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
        // Criação de veículos, cada um com seu próprio motor
        Veiculo[] veiculos = new Veiculo[4];

        veiculos[0] = new Veiculo("ABC1234", "Sedan", "Azul", 250, 4, new Motor(6, 350));
        veiculos[1] = new Veiculo("XYZ7895", "SUV", "Preto", 180, 4, new Motor(4, 250));
        veiculos[2] = new Veiculo("DEF4563", "Hatchback", "Prata", 220, 4, new Motor(3, 210));
        veiculos[3] = new Veiculo("GHI7894", "Caminhonete", "Vermelho", 120, 6, new Motor(5, 320));

        // Impressão das informações dos veículos com um loop
        for (int i = 0; i < veiculos.length; i++) {
            Veiculo veiculo = veiculos[i];

            System.out.println("Veiculo " + (i + 1) + " - Placa: " + veiculo.getPlaca());
            System.out.println("       - Modelo: " + veiculo.getModelo());
            System.out.println("       - Cor: " + veiculo.getCor());
            System.out.println("       - Velocidade Máxima: " + veiculo.getVelocMax());
            System.out.println("       - Quantidade de Rodas: " + veiculo.getQtdRodas());
            System.out.println("       - Motor - Quantidade de Pistões: " + veiculo.getMotor().getQtdPist());
            System.out.println("       - Motor - Potência: " + veiculo.getMotor().getPotencia());

            // Bloco condicional para verificar a velocidade máxima
            if (veiculo.getVelocMax() > 200) {
                System.out.println("       - Veículo rápido, passsa de 200km/h!");
            }

            System.out.println(); // Linha em branco para separar informações de veículos
        }
    }
}
