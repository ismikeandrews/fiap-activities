<?php
function addVeiculo(
    array &$veiculos,
    string $placa,
    string $modelo,
    string $marca)
    {
        $veiculos[$placa] = [
            "marca" => $marca,
            "modelo" => $modelo
        ];
    }
    
function removerVeiculos(array $veiculos, string $placa) : array
    {
        unset($veiculos[$placa]);
        return $veiculos;
    }

function veiculoString(array $veiculos, string $placa){
    $veiculo = $veiculos[$placa];
    return $veiculo["Marca"]." ".$veiculo["Modelo"];
}    