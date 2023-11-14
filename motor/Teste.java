/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.motor;

/**
 *
 * @author felipe.aswiaczorek
 */
public class Teste {
    public static void main(String[] args) {
        // Criação de veículos de Passeio
        Passeio[] passeios = {
                new Passeio("ABC1234", "Sedan", "Azul", 200, 4, new Motor(6, 350)),
                new Passeio("XYZ7890", "SUV", "Preto", 180, 4, new Motor(4, 250)),
                new Passeio("DEF4567", "Hatchback", "Prata", 220, 4, new Motor(3, 210)),
                new Passeio("GHI7894", "Caminhão", "Vermelho", 120, 6, new Motor(5, 320)),
                new Passeio("JKL0123", "Caminhonete", "Branco", 240, 4, new Motor(8, 400))
        };

        // Criação de veículos de Carga
        Carga[] cargas = {
                new Carga("MNO3456", "Caminhão", "Verde", 150, 6, new Motor(6, 300)),
                new Carga("PQR6789", "Carreta", "Amarelo", 120, 12, new Motor(10, 500)),
                new Carga("STU9012", "VUC", "Laranja", 130, 4, new Motor(4, 200)),
                new Carga("VWX2345", "Reboque", "Roxo", 110, 8, new Motor(8, 350)),
                new Carga("YZA5678", "Furgão", "Marrom", 140, 4, new Motor(6, 280))
        };

        // Teste das funcionalidades
        System.out.println("===== veiculos de Passeios =====");
        testeVeiculos(passeios);

        System.out.println("===== veiculos de Cargas =====");
        testeVeiculos(cargas);
    }

    // Método para teste de funcionalidades com veículos
    private static void testeVeiculos(Veiculo[] veiculos) {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Cor: " + veiculo.getCor());
            System.out.println("Velocidade Máxima (original): " + veiculo.getVelocMax() + " km/h");
            System.out.println("Velocidade Convertida: " + veiculo.calcVel());
            System.out.println("Quantidade de Rodas: " + veiculo.getQtdRodas());
            System.out.println("Motor - Quantidade de Pistões: " + veiculo.getMotor().getQtdPist());
            System.out.println("Motor - Potência: " + veiculo.getMotor().getPotencia());
            System.out.println("===============================");
        }
    }
}
