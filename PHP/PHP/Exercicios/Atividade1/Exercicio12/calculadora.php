<?php
/*12. Crie uma calculadora HTML.

Campos:
Número 1
Número 2
Botões:
Somar
Subtrair
Multiplicar
Dividir */

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    

    $numero1 = $_POST["numero1"];
    $numero2 = $_POST["numero2"];
    $operacao = $_POST["operacao"];

    switch ($operacao) {
        case "somar":
            $resultado = $numero1 + $numero2;
            break;

        case "subtrair":
            $resultado = $numero1 - $numero2;
            break;

        case "multiplicar":
            $resultado = $numero1 * $numero2;
            break;

        case "dividir":
            $resultado = $numero1 / $numero2;
            break;
    }

    echo "<h2>O resultado é: $resultado </h2>";
}
?>