<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produtos</title>
</head>
<body>

    @foreach ( $produtos as $produto )
        <p>Produto: {{ $produto -> nome }} | Preço: {{ $produto -> preco }} | Quantidade: {{ $produto -> quantidade }}</p>
        <hr>
    @endforeach

</body>
</html>