import java.util.Scanner;

public class Parte3 {
    static Retangulo[] retangulos = new Retangulo[5];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

       retangulos[0] = new Retangulo(5, 3);
       retangulos[1] = new Retangulo(2, 8);
       retangulos[2] = new Retangulo(1, 5);
       retangulos[3] = new Retangulo(4, 4);
       retangulos[4] = new Retangulo(2, 3);

       expandirVetor();
       ordenarRetangulos();
    }

    public static void expandirVetor() {
        Retangulo[] novoVetor = new Retangulo[10];

        for (int i = 0; i < retangulos.length; i++) {
            novoVetor[i] = retangulos[i];
        }

        for (int i = 0; i < novoVetor.length; i++) {
            System.out.println("Digite a largura a para o novo retângulo " + i + ":");
            double largura = teclado.nextDouble();
            System.out.println("Digite a altura para o novo retângulo " + i + ":");
            double altura = teclado.nextDouble();
            novoVetor[i] = new Retangulo(largura, altura);
        }

        retangulos = novoVetor;
    }

    public static void ordenarRetangulos() {
        System.out.println("Ordernar retãgulos:");
        System.out.println("1 - Ordernar por tamanho da área");
        System.out.println("2 - Ordernar por tamanho de perímetro");
        int escolha = teclado.nextInt();

        for (int i = 0; i < retangulos.length - 1; i++) {
            for (int j = 0; j < retangulos.length - i - 1; j++) {
                if (escolha == 1) {
                    if (retangulos[j].calcularArea() > retangulos[j + 1].calcularArea()) {
                        Retangulo temp = retangulos[j];
                        retangulos[j] = retangulos[j + 1];
                        retangulos[j + 1] = temp;
                    }
                } else if (escolha == 2) {
                    if (retangulos[j].calcularPerimetro() > retangulos[j + 1].calcularPerimetro()) {
                        Retangulo temp = retangulos[j];
                        retangulos[j] = retangulos[j + 1];
                        retangulos[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Retangulos ordenados por " + (escolha == 1? "área": "perímetro") + ":");
        for(Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
        }
    }
}
