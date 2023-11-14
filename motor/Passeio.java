/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.motor;

/**
 *
 * @author felipe.aswiaczorek
 */
public class Passeio extends Veiculo {
    public Passeio(String placa, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        super(placa, modelo, cor, velocMax, qtdRodas, motor);
    }

    // Sobrescreve o método calcVel para converter a velocidade para m/h
    @Override
    public float calcVel() {
        return super.getVelocMax() * 1000 / 3600; // Convertendo para m/h
    }
}


