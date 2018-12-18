package br.com.javacore.composicao.composicaothis;

public class Date {
    private int month; //1-12
    private int day; //1-31
    private int year;

    //construtor: chama CheckMonth para validar o valor adequado para month
    //chama CheckDay para confirmar o valor adequado para Day
    public Date(int theMonth, int theDay, int theYear){
        month = checkMonth(theMonth); //valida a semana
        day = checkDay(theDay); //valida dia
        year = theYear; //poderia validar year

        System.out.printf("Date object contructor for date %s\n", this);
    }// Fim do contrutor date

    //método utilitário para validar month
    private int checkMonth(int testMonth){
        if(testMonth>0 && testMonth<=12) //validamos month
            return testMonth;
        else{
            System.out.printf("Invalid month (%d) set 1.",testMonth);
            return 1; //assim mantemos objeto consistente
        }//fim else
    }//fim checkMonth

    //método utilitário checkDay com base na month e year
    private int checkDay(int testDay){
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //verificando se day está no intervalo para month
        if(testDay>0 && testDay <= daysPerMonth[month])
            return testDay;

        //verificando se o ano é bissexto
        if(month == 2 && testDay == 29 &&(year % 400 ==0 || (year % 4 ==0 && year % 100 !=0)))
            return testDay;

        System.out.printf("Invalid day (%d) set 1.", testDay);
        return 1; //matém objeto consistente
    }// fim método checkDay

    //retorna uma String no formato dia/mes/ano
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }// fim metodo toString
}// fim da classe Date
