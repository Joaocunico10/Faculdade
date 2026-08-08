<?php
/*10. Crie um array associativo contendo:
Nome
Idade
Cidade
Tchola
Mostre cada informação. */

$pessoas = [
    "Luis",
    20,
    "Laranjeiras",
    "Verdade",

    "\nJoao",
    19,
    "Guarapuava",
    "Falso",

    "\nAlex",
    67,
    "Laranjeiras",
    "Ama o peru"
];

[$nome, $idade, $cidade, $tchola] = $pessoas;

foreach ($pessoas as $pessoa) {
    echo $pessoa, "\n";
};
