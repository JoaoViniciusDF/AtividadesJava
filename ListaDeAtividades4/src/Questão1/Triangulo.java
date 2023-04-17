package Questão1;

import java.util.Scanner;

public class Triangulo extends FormaGeometrica {

    public Triangulo(int lados) {
        super(lados);
    }


    @Override
    public double calcularArea() {

        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da base: ");
        double base = entrada.nextDouble();

        System.out.println("Informe o valor da altura: ");
        double altura = entrada.nextDouble();

        area = (base * altura)/2;
    
        return area;
    }
    
    
}
