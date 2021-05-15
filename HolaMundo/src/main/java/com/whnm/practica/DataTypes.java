package com.whnm.practica;

public class DataTypes {

    public static void main(String[] args) {
        int nInt = 455555555;
        long nLong = 4555555555555L; //hasta el tamanno del int no necesita la "L", despues de superar el tamanno es obligatorio "L"
        double nDou = 344.5555;
        float nFloat = 344.5555F;//siempre es obligatorio poner la "F" para diferenciar

        var salary = 1000;
        var pension = salary*0.03;
        var totalSalary = salary - pension;

        System.out.println("Salario: " + salary);
        System.out.println("Pension: " + pension);
        System.out.println("Salario Total: " + totalSalary);

        var nombre = "Wilson Neira";
        System.out.println("Mi nombre: " + nombre);

    }
}
