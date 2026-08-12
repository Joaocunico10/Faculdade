<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Olá {{ $nome }}</title>
</head>
<body>
    <p>Olá {{ $nome }}, tudo bem?</p>
    
    @if($nome == 'Alex')
        <p>AINN que bonitinho!</p>
    @endif
</body>
</html>