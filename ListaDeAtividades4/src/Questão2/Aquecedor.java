package Questão2;

public class Aquecedor implements Aparelho {
    private int temperaturaAquecedor;
    private boolean estado;
    private SensorDeTemperatura sensor;


    public Aquecedor(boolean estado, SensorDeTemperatura sensor) {
        this.estado = estado;
        this.sensor = sensor;
    }


    @Override
    public void atualizar() {

        temperaturaAquecedor = sensor.getTemperatura();
        
        if(temperaturaAquecedor >= 16){

            estado = true;
            System.out.println("Aquecedor ligado");

        }else if(temperaturaAquecedor < 16){

            estado = false;
            System.out.println("Aquecedor Desligado.");

        }
    }
}
