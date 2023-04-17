package Questão2;


public class ArCondicionado implements Aparelho {
    private int temperaturaArCondicionado;
    private boolean estado;
    private SensorDeTemperatura sensor;


    public ArCondicionado(boolean estado, SensorDeTemperatura sensor) {
        this.estado = estado;
        this.sensor = sensor;
    }


    @Override
    public void atualizar() {

        temperaturaArCondicionado = sensor.getTemperatura();
        
        if(temperaturaArCondicionado >= 24){

            estado = true;
            System.out.println("Ar ligado");

        }else if(temperaturaArCondicionado < 24){

            estado = false;
            System.out.println("Ar Desligado.");

        }
    }
    
}
