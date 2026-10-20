<?php

use App\Http\Controllers\PokemonController;
use App\Http\Controllers\TarefaController;
use Illuminate\Support\Facades\Route;

// Consumo de API externa
Route::get('/pokemon/{nome}', [PokemonController::class, 'show']);

// API RESTful
Route::apiResource('tarefas', TarefaController::class);