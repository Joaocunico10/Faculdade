<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
</head>
<body>
    <form action="registro.php" method="POST">
        <label for="">Nome: </label>
        <input type="text" name="nome" id="nome" required>
        <label for="">Email</label>
        <input type="email" name="email" id="email">
        <label for="">Telefone</label>
        <input type="tel" name="telefone" id="telefone">
        <label for="">Data de nascimento</label>
        <input type="date" name="datanas" id="datanas">
        <label for="">Cidade</label>
        <input type="text" name="cidade" id="cidade">
        <label for="">Estado</label>
        <input type="text" name="estado" id="estado">
        <label for="">Sexo</label>
        <input type="text" name="sexo" id="sexo">
        <label for="">Curso</label>
        <input type="text" name="curso" id="curso">
        <label for="">Observacoes</label>
        <input type="textarea" name="obs" id="obs">

        <button type="submit">Enviar</button>
    </form>


</body>
</html>
