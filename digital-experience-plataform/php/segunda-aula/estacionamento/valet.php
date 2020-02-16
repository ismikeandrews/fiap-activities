<?php require_once("valet-vectors.php"); ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    
    <title>FIAP Estacionamento</title>
</head>
<body>
    <ul>
        <?php foreach($veiculos as $placa => $veiculo){ ?>
            <li><?= $placa." ".$veiculo["Marca"]." ".$veiculo["Modelo"] ?></li>
        <?php }?>

    </ul>
</body>