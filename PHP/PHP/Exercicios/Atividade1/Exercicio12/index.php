<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    <form action="calculadora.php" method="POST">
        <label for="">Numero 1: </label>
        <input type="number" name="numero1" id="numero1" required>
        <label for="">Numero 2: </label>
        <input type="number" name="numero2" id="numero2" required>

        <button type="submit" name="operacao" value="somar">Somar</button>
        <button type="submit" name="operacao" value="subtrair">Subtrair</button>
        <button type="submit" name="operacao" value="multiplicar">Multiplicar</button>
        <button type="submit" name="operacao" value="dividir">Dividir</button>
    </form>
</body>
</html>