<?php

namespace Tests\Feature;

use App\Models\Produto;
use App\Services\ProdutoService;
use Illuminate\Foundation\Testing\RefreshDatabase;
use Illuminate\Validation\ValidationException;
use Tests\TestCase;

class ProdutoServiceTest extends TestCase
{
    use RefreshDatabase;

    private ProdutoService $service;

    protected function setUp(): void
    {
        parent::setUp();
        $this->service = new ProdutoService();
    }

    private function criarProduto(): Produto
    {
        return Produto::create([
            'nome' => 'Teclado',
            'descricao' => 'Teclado mecânico',
            'preco_custo' => 100,
            'preco' => 150,
            'estoque' => 10,
        ]);
    }

    public function test_nao_cria_produto_com_preco_abaixo_da_margem_minima(): void
    {
        $this->expectException(ValidationException::class);

        // custo 100 => mínimo 110
        $this->service->create([
            'nome' => 'Mouse',
            'preco_custo' => 100,
            'preco' => 105,
            'estoque' => 5,
        ]);
    }

    public function test_update_altera_os_dados_do_produto(): void
    {
        $produto = $this->criarProduto();

        $atualizado = $this->service->update($produto, [
            'nome' => 'Teclado Gamer',
            'preco' => 200,
        ]);

        $this->assertEquals('Teclado Gamer', $atualizado->nome);
        $this->assertDatabaseHas('produtos', [
            'id' => $produto->id,
            'nome' => 'Teclado Gamer',
            'preco' => 200,
        ]);
    }

    public function test_update_nao_aceita_preco_abaixo_da_margem_minima(): void
    {
        $produto = $this->criarProduto();

        $this->expectException(ValidationException::class);

        // custo 100 => mínimo 110
        $this->service->update($produto, ['preco' => 109]);
    }
}