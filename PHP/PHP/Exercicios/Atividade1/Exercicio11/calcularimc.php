<?php
/*FORMULÁRIOS
11. Crie um formulário com:
Peso
Altura
Calcule o IMC.
Exiba:
Seu IMC é: tal IMC */

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $peso = $_POST["peso"];
    $altura = $_POST["altura"];

    $imc = $peso / ($altura * $altura);

    echo "<h2>Olá, seu IMC é: " . $imc . "</h2>";
}

?>