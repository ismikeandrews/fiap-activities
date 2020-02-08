<?php

// Dado um multiplicador exiba a sua tabula no seguinte formato.
// 3 x 1  = 3
// 3 x 2  = 6
// 3 x 3  = 9
// 3 x 4  = 12
// 3 x 5  = 15
// 3 x 6  = 18
// 3 x 7  = 21
// 3 x 8  = 24
// 3 x 9  = 27
// 3 x 10 = 30

$multiplicador = 3;

for ($i=1; $i <= 10; $i++) { 
    $result = $multiplicador * $i;
    echo "$multiplicador x $i = $result".PHP_EOL;
}