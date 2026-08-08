<?php

// Hello World
echo "Olá, mundo! \n";
echo "Tudo bem?\n";

// VARIAVEIS
$nome = "Joao";
$idade = 19;

echo "Meu nome e ". $nome . " e tenho ". $idade . " anos.\n";

// CONDICIONAL
if ($idade >= 18) {
    echo "Ja pode jogar no tigrinho, com responsabilidade. \n";
}else{
    echo "Pode jogar Roblox.\n";
}

//LOOP
for ($i = 0; $i < 10; $i++) {
    echo $i . " ";
}
echo "\n\n";

// FUNÇÃO
function calcular($a, $b){
    return $a + $b;
};

echo calcular(10, 5);

// ARRAY
$alunos = [
    [
        "nome" => "Alex",
        "idade" => 45,
        "cor" => "peru"
    ],
    [
        "nome" => "Kevin",
        "idade" => 67,
        "cor" => "Cor de cerca."
    ]
];

foreach($alunos  as $aluno){
    echo "\n--------";
    echo "\nNome: ", $aluno["nome"];
    echo "\nIdade: ", $aluno["idade"];
    echo "\nCor: ", $aluno["cor"];
}