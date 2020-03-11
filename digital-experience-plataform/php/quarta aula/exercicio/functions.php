<?php
require_once("vectors.php");
//Setting an empty array to produtos variable
$produtos = [];

//Calling the function addProduto
addProduto($produtos, readline("Id: "), readline("Nome do produto: "), 
readline("Valor: "));

//Function to add a product to the empty array
function addProduto(array & $produtos, int $id, string $nomeProduto, string $valor){
    $produtos[$id] = [
        "Nome" => $nomeProduto,
        "Valor" => $valor
    ];
}

print_r($produtos[1]);




