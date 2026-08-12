<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class MensagemController extends Controller
{
    public function mostrarMensagem(){
        return 'olá, piá, so que do controller';
    }

    public function enviarMensagem(){
        $mensagem = "Olá, tudo bem? Essa é uma mensagem";

        return view('mensagens.index', ['texto' => $mensagem]);
    }

    public function cumprimentar(string $nome){
        return view(
            'mensagens.pessoa', 
            ['nome' => $nome]
        );
    }
}
