import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(3);
        lista.add(0, 1);
        int valor = lista.get(2);
        System.out.println("O elemento da posição 2 é:" + valor);
        lista.add(4);
        lista.add(5);
        System.out.println("O tamanho da lista é:" + lista.size());
        System.out.println(lista);
        lista.remove(2);
        lista.add(0, 4);
        lista.add(4);
        System.out.println(lista);
        int posicao = lista.indexOf(4);
        System.out.println("A primeira ocorrencia do elemento 4 é: " + posicao);
        int ultimaposicao = lista.lastIndexOf(4);
        System.out.println("A ultima ocorrencia do elemento 4 é: " + ultimaposicao);




        scanner.close();

    }
}
