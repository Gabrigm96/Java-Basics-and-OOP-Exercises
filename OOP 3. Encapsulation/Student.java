package javaoop._3;

public class Student {
    private String nome;
    private int eta;
    private String cognome;
    private double weight;
    private int yearOfBirth;
    private short eta2 = 0;

    Student(String nome, int eta) {
        System.out.println("Constructing");
        System.out.println("Constructed");

        this.nome = nome;
        this.eta = eta;

    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    Student(String nome) {
        this.nome = nome;
    }

    Student(int eta) {
        this.eta = eta;
    }

    Student() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        if (eta == 0) {
            System.out.println(eta = eta + 20);
        }else if (eta > 0){
            System.out.println("student eta is = " + eta);
        } else if (eta < 0){
            System.out.println("error!");
        }else{
            this.eta = eta;
        }

    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

}

