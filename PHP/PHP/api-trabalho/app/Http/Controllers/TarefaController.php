<?php

namespace App\Http\Controllers;

use App\Http\Requests\TarefaRequest;
use App\Http\Resources\TarefaResource;
use App\Models\Tarefa;

class TarefaController extends Controller
{
    public function index()
    {
        return TarefaResource::collection(Tarefa::latest()->get());
    }

    public function store(TarefaRequest $request)
    {
        $tarefa = Tarefa::create($request->validated());

        return (new TarefaResource($tarefa))
            ->response()
            ->setStatusCode(201);
    }

    public function show(Tarefa $tarefa)
    {
        return new TarefaResource($tarefa);
    }

    public function update(TarefaRequest $request, Tarefa $tarefa)
    {
        $tarefa->update($request->validated());

        return new TarefaResource($tarefa);
    }

    public function destroy(Tarefa $tarefa)
    {
        $tarefa->delete();

        return response()->noContent(); // 204
    }
}