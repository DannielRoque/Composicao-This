package br.com.javacore.composicao.composicaothis;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    //contrutor pra inicializar nome, data nascimento e data de contratação
    public Employee(String first, String last, Date dateOfBith, Date dateOfHire){
        firstName = first;
        lastName = last;
        birthDate = dateOfBith;
        hireDate = dateOfHire;
    }// fim do contrutor

    //converte Employee em formato de String
    public String toString(){
        return String.format("%s, %s Hired: %s Birthday: %s",lastName,firstName, hireDate, birthDate);
    }// fim do metodo toString
}// fim da classe Employee
