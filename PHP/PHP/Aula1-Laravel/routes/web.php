<?php

use App\Http\Controllers\MensagemController;
use Illuminate\Support\Facades\Route;

Route::get('/bemvindo', function () {
    return view('welcome');
});

// ROTA COM RETORNO DIRETO
Route::get('/ola', 
    [MensagemController::class, 'mostrarMensagem']
);

Route::get('/mensagem', 
    [MensagemController::class, 'enviarMensagem']
);

Route::get('/ola/{nome}', 
    [MensagemController::class, 'cumprimentar']
);