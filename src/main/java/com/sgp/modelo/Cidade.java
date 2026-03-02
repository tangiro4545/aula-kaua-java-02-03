package com.sgp.modelo;

public class Cidade {

    private String nome;
    private String prefeito;
    private int numhabitantes;
            //construtor
    public Cidade(String nome, String prefeito, int numhabitantes) {
        this.nome = nome;
        this.prefeito = prefeito;
        this.numhabitantes = numhabitantes;
    }
            //Construtor padrão
    public Cidade() {
        this.nome = "São Paulo";
        this.prefeito = "Ricardo Nunes";
        this.numhabitantes = 11900000;
    }
            //saudação
    public void mostrarCidade() {
        System.out.println("A cidade de " + nome + ", cujo prefeito é " + prefeito + ", tem " + numhabitantes + " de habitantes.");
    }
            //get
    public String getNome() {
        return nome;
    }
    public String getPrefeito() {
        return prefeito;
    }
    public int getNumHabitantes() {
        return numhabitantes;
    }
        
        //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrefeito(int prefeito) {
        this.prefeito = prefeito
    }
        public void setNumhabitantes(int numhabitantes) {
        this.numhabitantes = numhabitantes
    }

    @Override
    public String toString() {
        return "Cidade [nome = " + nome +
                ", prefeito = " + prefeito +
                ", numhabitantes = " + numhabitantes + "]";
    }
        public static void imprimirMenu() {
        System.out.println("Menu de acesso");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static int receberOp()
}