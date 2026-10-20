<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\Http;

class PokemonController extends Controller
{
    public function show(string $nome)
    {
        $resposta = Http::timeout(10)
            ->get("https://pokeapi.co/api/v2/pokemon/" . strtolower($nome));

        if ($resposta->failed()) {
            return response()->json([
                'erro' => 'Pokémon não encontrado ou API indisponível.'
            ], $resposta->status());
        }

        $dados = $resposta->json();

        // Retorna só o que interessa
        return response()->json([
            'id'       => $dados['id'],
            'nome'     => $dados['name'],
            'altura'   => $dados['height'],
            'peso'     => $dados['weight'],
            'tipos'    => collect($dados['types'])->pluck('type.name'),
            'imagem'   => $dados['sprites']['front_default'],
        ]);
    }
}
