<?php

/*6. Crie uma função que receba um nome.

Resultado:
Olá Carlos Johnson! */

$nome = "Carlos Johnson";

function recebeNome($nome){
    echo "Olá ", $nome , "!";
}

recebeNome($nome);