package Questão1;

import java.util.Scanner;

public class Pentagono extends FormaGeometrica {

    public Pentagono(int lados) {
        super(lados);
    }
    
    @Override
    public double calcularArea() {

        double area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do lado: ");
        double tamLado = entrada.nextDouble();

        System.out.println("Informe o valor do apotema: ");
        double apotema = entrada.nextDouble();

        area = (lados * tamLado)/2 * apotema;
    
        return area;

    }
    
}
