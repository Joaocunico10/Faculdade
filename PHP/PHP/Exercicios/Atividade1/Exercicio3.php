<?php
/*3. Crie:
$numero1 
$numero2 
$operacao
Faça a operação escolhida usando if ou switch. */

$numero1 = 10;
$numero2 = 5;
$operacao = "/";

switch ($operacao) {
    case "+":
        echo "O resultado + (Adicao) e: ", $numero1 + $numero2;
        break;  
    case "-":
        echo "O resultado de - (Subtracao) e: ", $numero1 - $numero2;
        break;
    case "*":
        echo "O resultado de * (Multiplicacao) e: ", $numero1 * $numero2;
        break;
    case "/":
        echo "O resultado de / (Divisao) e: ", $numero1 / $numero2;
}