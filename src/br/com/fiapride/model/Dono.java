package br.com.fiapride.model;

public class Dono {
	private String nome;
	private int idade;
	
	public Dono(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
    }
    // Getters para os atributos...
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
}
