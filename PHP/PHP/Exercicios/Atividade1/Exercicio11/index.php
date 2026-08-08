<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcular IMC</title>
</head>
<body>
    <form action="calcularimc.php" method="POST">
        <label for="">Peso: </label>
        <input type="number" name="peso" id="peso" required>
        <label for="">Altura:</label>
        <input type="number" step="0.01" name="altura" id="altura" required>

        <button type="submit">Enviar</button>
    </form>


</body>
</html>
