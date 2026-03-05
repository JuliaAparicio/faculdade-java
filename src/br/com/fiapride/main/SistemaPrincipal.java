package br.com.fiapride.main;

 // Importamos a classe Computador para que o sistema a reconheça
import br.com.fiapride.model.Computador;

public class SistemaPrincipal {

    public static void main(String[] args) {
     // INSTANCIAÇÃO
     // O comando 'new' aloca memória para um novo objeto.
     // Criando o primeiro Computador (Objeto 1)
    Computador computador1 = new Computador("Ana Silva", "222");
     System.out.println("Regarga Computador 1");
    Computador1.adicionarSaldo(50.0);

     // Criando o segundo Computador (Objeto 2)
     Computador computador2 = new Computador("Carlos Souza", "333");
     System.out.println("Regarga Computador 2");
     computador2.adicionarSaldo(12.5);

     System.out.println("--- Sistema FiapRide ---");
    System.out.println("Computador: " + Computador1.nome + " | Saldo: R$ " + Computador1.saldo + " | CPF: " + Computador1.cpf);
    System.out.println("Computador: " + Computador2.nome + " | Saldo: R$ " + Computador2.saldo + " | CPF: " + Computador2.cpf);

    System.out.println("Pagando viagem do Computador 1");
     computador1.pagarViagem(20);
     System.out.println("Pagando viagem do Computador 2");
     computador2.pagarViagem(20);

    }
}
