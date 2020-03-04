<?php 
    class Veiculo{
        private string $placa;
        private string $marca;
        private string $modelo;

        public function __construct(string $placa, string $marca, string $modelo){
            $this->placa = $placa;
            $this->marca = $marca;
            $this->modelo = $modelo;
        }

        public function veiculoInfo(){
            return "$this->marca $this->modelo";
        }
        
        public function setPlaca(string $placa){
            $this->placa = $placa;
        }
        
        public function getPlaca(): string{
            return $this->placa;
        }

        public function setMarca(string $marca){
            $this->marca = $marca;
        }
        
        public function getMarca(): string{
            return $this->marca;
        }

        public function setModelo(string $modelo){
            $this->modelo = $modelo;
        }
        
        public function getModelo(): string{
            return $this->modelo;
        }
    }