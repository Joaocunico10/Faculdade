<?php
/*IF e ELSE:

1. Crie uma variável $idade.
Mostre: 
Você é maior de idade 
ou 
Você é menor de idade. */

$idade = 12;

if($idade >= 18){
    echo "Voce e maior de idade! Sua idade e ". $idade;
}else{
    echo "Voce nao e maior de idade! Voce tem ". $idade;
}