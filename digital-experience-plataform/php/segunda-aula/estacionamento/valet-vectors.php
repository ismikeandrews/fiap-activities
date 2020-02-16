<?php
require_once("functions.php");

$veiculos = [
    "ABC-1234" => [
        "Marca" => "ford",
        "Modelo" => "mustang",
    ],
    "BMW-5678" => [
        "Marca" => "Dodge",
        "Modelo" => "Challenger",
    ],
];

$veiculos["MSD-3112"] = [
    "Marca" => "Chevrolet",
    "Modelo" => "Camaro",
];

unset($veiculos["ABC-1234"]);

veiculoString($veiculos,"BMW-5678");

// print_r($veiculos);
?>
