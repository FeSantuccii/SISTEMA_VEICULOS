package Veiculos;

// Classe para testar os objetos dos veículos
class TestarVeiculos {
    public static void main(String[] args) {
        
        // Criando instâncias de diferentes veículos
        Automovel carro = new Automovel("Fusca", 1980, "Volkswagen", "Amarelo", 50000, 4, "Disco", true);
        Motocicleta moto = new Motocicleta("CB500", 2015, "Honda", "Preta", 8000, 500, 45.0);
        Caminhao caminhao = new Caminhao("Mercedes-Benz Actros", 2023, "Mercedes", "Branco", 0, 4, 12000.0);
        Bicicleta bicicleta = new Bicicleta("Mountain Bike", 2022, "Caloi", "Azul", 50, "Caloi", "Aço", 18, false);
        Skate skate = new Skate("Skate Profissional", 2024, "Skate Co.", "Verde", 0, "Top Brand", "Policarbonato");
        
        // Chamando os métodos de inserção e exibindo os comandos no console
        System.out.println(carro.criarComandoInsert());
        System.out.println(moto.criarComandoInsert());
        System.out.println(caminhao.criarComandoInsert());
        System.out.println(bicicleta.criarComandoInsert());
        System.out.println(skate.criarComandoInsert());
    }
}
