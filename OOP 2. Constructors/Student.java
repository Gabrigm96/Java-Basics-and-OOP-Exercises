package javaoop._2;

public class Student {
    String nome;
    int eta;

    Student(String nome, int eta){
        System.out.println("Constructing");
        System.out.println("Constructed");

        this.nome = nome;
        this.eta = eta;

    }

    Student(String nome){
        this.nome = nome;
    }

    Student(int eta){
        this.eta = eta;
    }

    Student(){

    }


    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

}
