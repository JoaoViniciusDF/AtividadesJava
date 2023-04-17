package Questão1;

import java.util.Scanner;

public class Quadrado extends FormaGeometrica {

    public Quadrado(int lados) {
        super(lados);
    }
    
    @Override
    public double calcularArea() {

        double area;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamanho dos lados: ");
        double tamanhoLados = entrada.nextDouble();
        area = tamanhoLados * tamanhoLados;    
    
        return area;
    }
    
}
