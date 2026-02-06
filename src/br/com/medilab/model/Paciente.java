package br.com.medilab.model;

public class Paciente {
    private String nome;
    private int idade;
    private String cpf;

    public Paciente (String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
        //Getter do nome
        public String getNome() {
            return nome;
        }

        // Getter da idade
        public int getIdade() {
            return idade;
        }

            // Getter do CPF
        public String getCpf(){
            return cpf;
        }

    // Setters (ESSENCIAIS para edição)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
