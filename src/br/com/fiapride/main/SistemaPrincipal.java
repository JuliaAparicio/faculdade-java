package br.com.fiapride.main;

import br.com.fiapride.model.Computador;

public class SistemaPrincipal {
    public static void main(String[] args) {

        // Criando o primeiro computador
        Computador computador1 = new Computador();
        computador1.tamanho = 70;
        computador1.memoria = 50.0;

        // Criando o segundo computador
        Computador computador2 = new Computador();
        computador2.tamanho = 80;
        computador2.memoria = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Computador: " + computador1.tamanho + 
                           " | Memória: " + computador1.memoria + "GB");
        System.out.println("Computador: " + computador2.tamanho + 
                           " | Memória: " + computador2.memoria + "GB");

        // Teste mental:
        // Se eu mudar o nome do computador1, o computador2 muda?
    }
}