package Questão1;

public abstract class FormaGeometrica {
    protected int lados;

    public FormaGeometrica(int lados) {
        this.lados = lados;
    }

    public abstract double calcularArea();

}
