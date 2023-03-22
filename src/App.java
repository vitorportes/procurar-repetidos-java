import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite os valores da primeira lista separados por vírgula: ");
        String entrada1 = entradaDoUsuario.nextLine();
        String[] arr1 = entrada1.split(", ");

        System.out.println("Digite os valores da segunda lista separados por vírgula: ");
        String entrada2 = entradaDoUsuario.nextLine();
        String[] arr2 = entrada2.split(", ");

        boolean itemRepetidoEncontrado = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Item repetido: " + arr1[i]);
                    itemRepetidoEncontrado = true;
                    break;
                }
            }
        }

        if (!itemRepetidoEncontrado) {
            System.out.println("Não existem itens repetidos nas listas");
        }

        entradaDoUsuario.close();
    }
}
