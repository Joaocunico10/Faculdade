# API Laravel: Consumo de API e API RESTful de Tarefas

Trabalho de PHP com Laravel, dividido em duas partes:

1. **Consumo de API externa gratuita**: integração com a [PokéAPI](https://pokeapi.co/).
2. **Criação de API RESTful**: CRUD de tarefas com rotas RESTful, Resource e validação, testado no Postman.

**Aluno:** João Paulo Rodrigues Cunico
**Curso:** Engenharia de Software, Centro Universitário Campo Real

---

## Tecnologias

- PHP 8+
- Laravel 11+
- PostgreSQL
- Postman (testes)

---

## Como executar o projeto

```bash
# 1. Instalar dependências
composer install

# 2. Criar o arquivo de ambiente e gerar a chave
cp .env.example .env
php artisan key:generate

# 3. Configurar o banco PostgreSQL no .env
#    DB_CONNECTION=pgsql
#    DB_HOST=...
#    DB_PORT=5432
#    DB_DATABASE=...
#    DB_USERNAME=...
#    DB_PASSWORD=...

# 4. Criar as tabelas
php artisan migrate

# 5. Subir o servidor
php artisan serve
```

A API fica disponível em `http://localhost:8000/api`.

> **Observação (Windows):** se aparecer o erro `cURL error 60: SSL certificate`, configure `curl.cainfo` e `openssl.cafile` no `php.ini` apontando para o arquivo `cacert.pem` (https://curl.se/ca/cacert.pem) e reinicie o servidor.

---

## Parte 1: Consumo de API externa (PokéAPI)

A rota recebe o nome de um Pokémon, consulta a PokéAPI usando o `Http` facade do Laravel e devolve apenas os dados relevantes.

| Método | Rota | Descrição |
|---|---|---|
| GET | `/api/pokemon/{nome}` | Retorna id, nome, altura, peso, tipos e imagem do Pokémon |

**Exemplo:** `GET /api/pokemon/pikachu`

```json
{
    "id": 25,
    "nome": "pikachu",
    "altura": 4,
    "peso": 60,
    "tipos": ["electric"],
    "imagem": "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"
}
```

Se o Pokémon não existir ou a API estiver indisponível, a resposta é um JSON com a mensagem de erro e o status retornado pela API externa (ex.: 404).

---

## Parte 2: API RESTful de Tarefas

CRUD completo do recurso `tarefas`, com:

- **Rotas RESTful** via `Route::apiResource('tarefas', TarefaController::class)`
- **Resource** (`TarefaResource`) para padronizar a saída JSON
- **Form Request** (`TarefaRequest`) para validação dos dados
- **Migration** e **Model** (`Tarefa`)

### Endpoints

| Método | Rota | Descrição | Status de sucesso |
|---|---|---|---|
| GET | `/api/tarefas` | Lista todas as tarefas | 200 |
| POST | `/api/tarefas` | Cria uma tarefa | 201 |
| GET | `/api/tarefas/{id}` | Exibe uma tarefa | 200 |
| PUT/PATCH | `/api/tarefas/{id}` | Atualiza uma tarefa | 200 |
| DELETE | `/api/tarefas/{id}` | Remove uma tarefa | 204 |

### Estrutura da tarefa

| Campo | Tipo | Regra |
|---|---|---|
| `titulo` | string | obrigatório, máx. 255 caracteres |
| `descricao` | texto | opcional |
| `concluida` | boolean | opcional, padrão `false` |

### Exemplo de requisição

`POST /api/tarefas`

```json
{
    "titulo": "Estudar Laravel",
    "descricao": "Fazer o trabalho de API"
}
```

### Exemplo de resposta (201)

```json
{
    "data": {
        "id": 1,
        "titulo": "Estudar Laravel",
        "descricao": "Fazer o trabalho de API",
        "concluida": false,
        "criado_em": "20/10/2026 14:30"
    }
}
```

### Validação

Enviar um `POST` sem o campo `titulo` retorna **422** com os erros de validação em JSON.

---

## Testes no Postman

Todas as requisições usam o header `Accept: application/json`.

Os testes feitos cobrem:

- [x] GET `/api/pokemon/{nome}` (consumo da API externa)
- [x] GET `/api/tarefas` (listagem)
- [x] POST `/api/tarefas` (criação)
- [x] GET `/api/tarefas/{id}` (detalhe)
- [x] PUT `/api/tarefas/{id}` (atualização)
- [x] DELETE `/api/tarefas/{id}` (remoção)
- [x] POST com dados inválidos (erro 422)

A collection exportada e os prints dos testes estão na pasta `postman/` _(ajustar conforme a entrega)_.

---

## Estrutura dos principais arquivos

```
app/
├── Http/
│   ├── Controllers/
│   │   ├── PokemonController.php
│   │   └── TarefaController.php
│   ├── Requests/
│   │   └── TarefaRequest.php
│   └── Resources/
│       └── TarefaResource.php
└── Models/
    └── Tarefa.php
database/migrations/
└── xxxx_create_tarefas_table.php
routes/
└── api.php
```