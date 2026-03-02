package com.sgp.modelo;

public class Pessoa {

    //caracteristica / Tipo / Apelido
    private String nome; //Atributo privado de tipo String (nome)
    private int idade; //Atributo privado de tipo int (nome)

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Construtor padrão
        public Pessoa(){
            this.nome = "Davi";
            this.idade = 16;
        }

    //Saudação 
    public void saudacao(){
        System.out.println("Olá, " + nome + "!" + " Você tem " + idade + "anos");
    }

    //Métodos Getters e Setters para controle de acesso dos atributos privados
    public String getNome(){
        return nome;
    }
    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade
    }

    @Override
    public String toString() {
        return "Pessoa [nome = " + nome +
                ", idade = " + idade +
                ", altura = " + altura + "]";
    }

    public static void imprimirMenu() {
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
        System.out.println("Menu de acesso");
    }

    public static int receberOp()
}