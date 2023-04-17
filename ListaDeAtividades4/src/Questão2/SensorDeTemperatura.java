package Questão2;

import java.util.ArrayList;

public class SensorDeTemperatura {
    private ArrayList<Aparelho> aparelhos;
    private int temperatura;

    
    public SensorDeTemperatura() {
        aparelhos = new ArrayList<Aparelho>();
    }

    public void adicionar(Aparelho aparelho) {
        this.aparelhos.add(aparelho);
    }

    public void remover(Aparelho aparelho) {
        this.aparelhos.remove(aparelho);
    }

    public void notificar() {
        for(int i = 0; i<this.aparelhos.size(); i++){
            this.aparelhos.get(i).atualizar();
        }
    }

    public int getTemperatura(){
        return temperatura;
    }


    public void atualizar(int temperatura) {
        this.temperatura = temperatura;
        notificar();
    }

     
}
