package br.com.fiapride.main;

import br.com.fiapride.model.Computador;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Criando o primeiro Computador
        Computador computador1 = new Computador(15.6, 512, 6000, 200);

        System.out.println("=== Computador 1 ===");
        System.out.println("Tamanho: " + computador1.tamanho);
        System.out.println("Memória: " + computador1.memoria + "GB");
        System.out.println("Preço: R$ " + computador1.preco);
        System.out.println("Saldo disponível: R$ " + computador1.saldo);

        System.out.println("\nComprando jogo no Computador 1...");
        computador1.comprarJogo(50);

        // Criando o segundo Computador
        Computador computador2 = new Computador(17.0, 1024, 6500, 30);

        System.out.println("\n=== Computador 2 ===");
        System.out.println("Tamanho: " + computador2.tamanho);
        System.out.println("Memória: " + computador2.memoria + "GB");
        System.out.println("Preço: R$ " + computador2.preco);
        System.out.println("Saldo disponível: R$ " + computador2.saldo);

        System.out.println("\nComprando jogo no Computador 2...");
        computador2.comprarJogo(50);
    }
}
