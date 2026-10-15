<?php

namespace App\Services;

use App\Models\Produto;
use Illuminate\Validation\ValidationException;


class ProdutoService
{
    private const margem_minima = 0.10;

    public function create(array $dados)
    {
        $this->verificarMargem($dados['preco'], $dados['preco_custo']);

        return Produto::create($dados);

    }

    private function verificarMargem(float $preco, float $preco_custo)
    {
        $margem = $preco_custo + 
        ($preco_custo*self::margem_minima);
        $minimo = round($margem, 2);
        {
            throw ValidationException::withMessages([
                'preco' => sprintf('O preco deve ser no minimo %.2f (margem Minima)', $minimo),
            ]);
        }
    }
}