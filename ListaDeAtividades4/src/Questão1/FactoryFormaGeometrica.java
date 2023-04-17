package Questão1;

public class FactoryFormaGeometrica {
    
    public FormaGeometrica criarForma(int lados) {
        if(lados == 5){
            return new Pentagono(lados);
        }

        if(lados == 4){
            return new Quadrado(lados);
        }

        if(lados == 3){
            return new Triangulo(lados);
        }

        return null;

    }
}
