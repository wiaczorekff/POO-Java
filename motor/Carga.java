/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.motor;

/**
 *
 * @author felipe.aswiaczorek
 */
public class Carga extends Veiculo {
    public Carga(String placa, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        super(placa, modelo, cor, velocMax, qtdRodas, motor);
    }

    // Sobrescreve o método calcVel para converter a velocidade para cm/h
    @Override
    public float calcVel() {
        return super.getVelocMax() * 100000 / 3600; // Convertendo para cm/h
    }
}


