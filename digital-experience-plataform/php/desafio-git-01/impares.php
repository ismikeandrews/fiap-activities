<?php

// Exiba os números ímpares entre 1 e 100, inclusive.
for ($i=1; $i <= 100; $i++) {
    $helper = $i % 2; 
    if ($helper === 1) {
        echo $i.PHP_EOL;
    }
}