<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nome = $_POST["nome"];
    $email = $_POST["email"];
    $telefone = $_POST["telefone"];
    $dataNascimento = $_POST["datanas"];
    $cidade = $_POST["cidade"];
    $estado = $_POST["estado"];
    $sexo = $_POST["sexo"];
    $curso = $_POST["curso"];
    $observacoes = $_POST["obs"];


    echo "<h2>Cartão de Cadastro</h2>";
    echo "Nome: $nome <br>";
    echo "Email: $email <br>";
    echo "Telefone: $telefone <br>";
    echo "Data de nascimento: $dataNascimento <br>";
    echo "Cidade: $cidade <br>";
    echo "Estado: $estado <br>";
    echo "Sexo: $sexo <br>";
    echo "Curso: $curso <br>";
    echo "Observações: $observacoes <br>";
}
