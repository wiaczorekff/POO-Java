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
        // Cria motores para os veículos
        Motor motor1 = new Motor(6, 350);
        Motor motor2 = new Motor(4, 250);
        Motor motor3 = new Motor(3, 210);
        Motor motor4 = new Motor(5, 320);

        // Cria veículos 
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Sedan", "Azul", 290, 4, motor1);
        Veiculo veiculo2 = new Veiculo("XYZ-7898", "SUV", "Preto", 210, 4, motor2);
        Veiculo veiculo3 = new Veiculo("DEF-4567", "Hatchback", "Prata", 230, 4, motor3);
        Veiculo veiculo4 = new Veiculo("GHI-7895", "Caminhonete", "Vermelho", 220, 4, motor4);

        //informações dos veículos 
        System.out.println("Veiculo 1 - Placa: " + veiculo1.getPlaca());
        System.out.println("       - Modelo: " + veiculo1.getModelo());
        System.out.println("       - Cor: " + veiculo1.getCor());
        System.out.println("       - Velocidade Máxima: " + veiculo1.getVelocMax());
        System.out.println("       - Quantidade de Rodas: " + veiculo1.getQtdRodas());
        System.out.println("       - Motor - Quantidade de Pistões: " + veiculo1.getMotor().getQtdPist());
        System.out.println("       - Motor - Potência: " + veiculo1.getMotor().getPotencia() + "\n");
        
        
        System.out.println("Veiculo 2 - Placa: " + veiculo2.getPlaca());
        System.out.println("       - Modelo: " + veiculo2.getModelo());
        System.out.println("       - Cor: " + veiculo2.getCor());
        System.out.println("       - Velocidade Máxima: " + veiculo2.getVelocMax());
        System.out.println("       - Quantidade de Rodas: " + veiculo2.getQtdRodas());
        System.out.println("       - Motor - Quantidade de Pistões: " + veiculo2.getMotor().getQtdPist());
        System.out.println("       - Motor - Potência: " + veiculo2.getMotor().getPotencia() + "\n");
        
        
        System.out.println("Veiculo 3 - Placa: " + veiculo3.getPlaca());
        System.out.println("       - Modelo: " + veiculo3.getModelo());
        System.out.println("       - Cor: " + veiculo3.getCor());
        System.out.println("       - Velocidade Máxima: " + veiculo3.getVelocMax());
        System.out.println("       - Quantidade de Rodas: " + veiculo3.getQtdRodas());
        System.out.println("       - Motor - Quantidade de Pistões: " + veiculo3.getMotor().getQtdPist());
        System.out.println("       - Motor - Potência: " + veiculo3.getMotor().getPotencia() + "\n");
        
        
        System.out.println("Veiculo 4 - Placa: " + veiculo4.getPlaca());
        System.out.println("       - Modelo: " + veiculo4.getModelo());
        System.out.println("       - Cor: " + veiculo4.getCor());
        System.out.println("       - Velocidade Máxima: " + veiculo4.getVelocMax());
        System.out.println("       - Quantidade de Rodas: " + veiculo4.getQtdRodas());
        System.out.println("       - Motor - Quantidade de Pistões: " + veiculo4.getMotor().getQtdPist());
        System.out.println("       - Motor - Potência: " + veiculo4.getMotor().getPotencia());
    }
}
