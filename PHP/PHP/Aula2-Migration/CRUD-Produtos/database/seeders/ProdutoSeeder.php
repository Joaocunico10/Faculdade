<?php

namespace Database\Seeders;

use App\Models\Produto;
use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;

class ProdutoSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        Produto::create([
            'nome' => 'Notebook',
            'preco' => 6000.50,
            'quantidade' => 12,
        ]);
        Produto::create([
            'nome' => 'Iphono17 Pre Mex',
            'preco' => 7500,
            'quantidade' => 22,
        ]);
        Produto::create([
            'nome' => 'Compuiter gamer',
            'preco' => 15000,
            'quantidade' => 4,
        ]);
    }
}
