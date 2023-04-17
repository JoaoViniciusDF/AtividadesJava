package Questão1;


public class Teste {
    public static void main(String[] args) {

        FactoryFormaGeometrica factory = new FactoryFormaGeometrica();
        
        FormaGeometrica f1 = factory.criarForma(5);
        FormaGeometrica f2 = factory.criarForma(4);
        FormaGeometrica f3 = factory.criarForma(3);
        
        System.out.println("Area da primeira forma: ");
        System.out.println(f1.calcularArea());

        System.out.println("---------------------------------");
        System.out.println("Area da primeira forma: ");
        System.out.println(f2.calcularArea());
        
        
        System.out.println("---------------------------------");
        System.out.println("Area da primeira forma: ");
        System.out.println(f3.calcularArea());

    }
}