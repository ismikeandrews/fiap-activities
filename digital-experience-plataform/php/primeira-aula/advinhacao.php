<?php
    echo "****************************************".PHP_EOL;
    echo "**  Bem-vindo ao jogo de adivinhação  **".PHP_EOL;
    echo "****************************************".PHP_EOL;
    echo PHP_EOL;

    $numeroSecreto = random_int(1, 100);
    $totalTentativas = 3;
    $level = intval(readline("Escolha um level"));
    $pontos = 1000;


    if ($level === 3) {
        $totalTentativas = 20;
    }else if($level === 2){
        $totalTentativas = 10;
    }elseif ($level === 1) {
        $totalTentativas = 5;
    }

    for($i = 1; $i <= $totalTentativas; $i++){
        echo "Tentativa $i de $totalTentativas".PHP_EOL;
        $palpite = intval(readline("Informe um numero de 1 até 100: "));    
        echo "Você disse $palpite".PHP_EOL;

        if($palpite < 1 || $palpite > 100){
            echo "Coisinha de Jesus, só digite se o numero for entre 1 e 100".PHP_EOL;
            continue;
        }

        $acertou = $palpite === $numeroSecreto;
        $maior = $palpite > $numeroSecreto;
        $menor = $palpite < $numeroSecreto;

        if($acertou){
            echo "Parabens você acertou !".PHP_EOL;
            echo "Sua Pontuação foi de $pontos pontos.".PHP_EOL;
        }else{
            echo "Numero errado!!!!!!!!!!".PHP_EOL;
            if($maior){
                echo "Chutou longe".PHP_EOL;
            }else {
                echo "Chutou o chão".PHP_EOL;
            }
            $pontosPerdidos = abs($palpite - $numeroSecreto);
            $pontos -= $pontosPerdidos;
        }
    }

    echo $numeroSecreto;


    