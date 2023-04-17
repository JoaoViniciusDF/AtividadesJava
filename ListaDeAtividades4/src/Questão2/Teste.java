package Questão2;

public class Teste {
    public static void main(String[] args) {
        SensorDeTemperatura sensor = new SensorDeTemperatura();

        ArCondicionado ar = new ArCondicionado(false, sensor);
        Aquecedor aquecedor = new Aquecedor(false, sensor);

        sensor.adicionar(ar);
        sensor.adicionar(aquecedor);
        sensor.atualizar(17);
        
    }
}
