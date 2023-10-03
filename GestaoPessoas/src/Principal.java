/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author felipe.aswiaczorek
 */
// Passo 2: Criando a Classe Principal

public class Principal {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa e passando valores pelo construtor
        Pessoa pessoa = new Pessoa("João", 25);

        // Utilizando métodos get para exibir informações
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        // Utilizando métodos set para modificar informações
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        // Exibindo informações após a modificação
        System.out.println("Novo nome: " + pessoa.getNome());
        System.out.println("Nova idade: " + pessoa.getIdade());
    }
}
