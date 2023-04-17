package Desafio;

import java.util.ArrayList;

public class Aleatoria {
    private ArrayList<Amostra> amostras = new ArrayList<>();

    public void addAmostra(Amostra amostra) {
        amostras.add(amostra);
    }

    public void removeAmostra(Amostra amostra) {
        amostras.remove(amostra);
    }

    // (c) Implementação da interface Comparable
    class Amostra implements Comparable<Amostra> {
        private int valor;

        @Override
        public int compareTo(Amostra outraAmostra) {
            return Integer.compare(this.valor, outraAmostra.valor);
        }

        public int getCor() {
            return 0;
        }
    }

    // (d) Método buscaCor
    public boolean buscaCor(int cor) {
        for (Amostra amostra : amostras) {
            if (amostra.getCor() == cor) {
                return true;
            }
        }
        return false;
    }
}