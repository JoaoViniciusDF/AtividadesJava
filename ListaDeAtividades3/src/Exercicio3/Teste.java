package Exercicio3;

public class Teste {
    public static void main(String[] args) {

        EditorDeTexto editor = new EditorDeTexto();
        editor.inserirTexto("Eai");
        System.out.println(editor.getTexto()); // saída: Oie
        editor.inserirTexto(", Wagner");
        System.out.println(editor.getTexto()); // saída: , Wagner
        editor.apagarTexto(7);
        System.out.println(editor.getTexto()); // saída: Eai,
        editor.desfazer();
        System.out.println(editor.getTexto()); // saída: Eai, Wagner

    }

}
