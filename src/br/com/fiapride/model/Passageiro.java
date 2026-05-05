package br.com.fiapride.model;

public class Passageiro {
	// Atributos (Características)
    public String nome;
    public String cpf;
    public double saldo; 
    
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf; 
        this.saldo = 0.0;
    }
    public void adicionarSaldo(double valor) {
        
        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
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
