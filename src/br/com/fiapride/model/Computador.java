package br.com.fiapride.model;

public class Computador {
	public String preco;
	public String memoria;
	public double tamanho;

	public Computador(String preco, String memoria) {
		this.preco = preco;
		this.memoria = memoria
		this.tamanho = 70.5
}

	public void adicionarSaldo(double valor) {
		// Regra de negócio: O valor da recarga deve ser positivo
		if (valor <= 0) {
			System.out.printIn("Erro: O valor de recarga deve ser maior que zero");
			
			return; // Interrompe a execução do método
		}
 		this.saldo += valor;
		System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
	}

 	public void pagarViagem(double custo) {
		// Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente

 		if (custo <= 0) {
 			System.out.println("Erro: O custo da viagem é inválido.");
 			return;
 		}
		 if (this.saldo < custo) {
 			System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
 			return;
 		}
 		this.saldo -= custo;
 			System.out.println("Viagem paga. Saldo restante: " + this.saldo);
 	}
 }
