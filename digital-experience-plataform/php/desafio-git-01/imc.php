<?php

// Dado o peso e altura de uma pessoa, calcule o IMC.
// Pesquise sobre as regras do IMC

$altura = 1.83;
$peso = 86.3;
$helper = $altura * $altura;
$imc = $peso / $helper;

echo $imc;