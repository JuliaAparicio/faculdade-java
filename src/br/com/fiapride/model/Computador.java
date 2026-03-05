package br.com.fiapride.model;

public class Computador {

    public double tamanho;
    public int memoria;
    public double preco;

    // Construtor
    public Computador(double tamanho, int memoria, double preco) {
        this.tamanho = tamanho;
        this.memoria = memoria;
        this.preco = preco;
    }

    public void novoComputador(double valor) {

        if (valor >= 7000) {
            System.out.println("Erro: O valor do computador deve ser menor que 7000");
            return;
        }

        this.preco = valor;

        System.out.println("Pode comprar o computador por: " + this.preco);
    }

    public void novoJogo(double jogo) {

        if (jogo <= 0) {
            System.out.println("Erro: O valor do jogo é inválido.");
            return;
        }

        if (this.preco < jogo) {
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }

        this.preco -= jogo;

        System.out.println("Jogo comprado. Valor restante: " + this.preco);
    }
}
