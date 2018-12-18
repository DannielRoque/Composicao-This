package br.com.javacore.composicao.composicaothis;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(7, 14,1949);
        Date hire = new Date(1,29,1968);
        Employee employee = new Employee("Daniel","Roque",birth,hire);

        System.out.println(employee);
    }// fim do metodo main
}// fim da classe EmployeeTest
