<?php

/*2. Crie uma variável $dinheiro.

Exiba:
Pobre
Classe Média
Riquinho
Ricão
Elon Musk */

$dinheiro = 50000;

if($dinheiro < 100000){
    echo "Pobre";
} else if($dinheiro < 250000){
    echo "Classse media";
} elseif($dinheiro < 500000){
    echo "Riquinho";
} elseif($dinheiro < 1000000){
    echo "Ricao";
} elseif($dinheiro < 5000000){
    echo "Elon Musk";
}