<?php
/*5. Exiba a tabuada dos números:
4, 7 e 12.879,5 */

echo "Exibindo a tabuada do 4:\n";
$tabuada4 = 4;
for ($i=0; $i <= 10; $i++) { 
    echo $tabuada4, " X ", $i ," = ", $tabuada4 * $i, "\n";
}

echo "\nExibindo a tabuada do 7:\n";
$tabuada7 = 7;
for ($i=0; $i <= 10; $i++) { 
    echo $tabuada7, " X ", $i ," = ", $tabuada7 * $i, "\n";
}

echo "\nExibindo a tabuada do 12.879.5:\n";
$tabuada128795 = 12879.5;
for ($i=0; $i <= 10; $i++) { 
    echo $tabuada128795, " X ", $i ," = ", $tabuada128795 * $i, "\n";
}