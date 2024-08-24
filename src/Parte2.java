import java.util.Scanner;

public class Parte2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangulo[] retangulos = new Retangulo[5];

        System.out.println("Preencha o vetor de retangulos");
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o largura do retangulo da posição " + i + ": ");
            double largura = teclado.nextDouble();

            System.out.println("Digite o altura do retangulo da posição " + i + ": ");
            double altura = teclado.nextDouble();

            retangulos[i] = new Retangulo(largura, altura);
            System.out.println("-----------------------------------------------");
        }

        for (Retangulo retangulo : retangulos) {
            retangulo.exibirInformacoes();
        }

        double maiorArea = 0.0;
        double menorPerimetro = 100000.0;
        int contadorArea = 0;
        int contadorPerimetro = 0;

        for (int i = 0; i < retangulos.length; i++) {

            if (maiorArea < retangulos[i].calcularArea()) {
                maiorArea = retangulos[i].calcularArea();
                contadorArea = i;
            }

            if (menorPerimetro > retangulos[i].calcularPerimetro()) {
                menorPerimetro = retangulos[i].calcularPerimetro();
                contadorPerimetro = i;
            }
        }

        System.out.println("\nO retãngulo com maior área: ");
        retangulos[contadorArea].exibirInformacoes();

        System.out.println("\nO retãngulo com maior perímetro: ");
        retangulos[contadorPerimetro].exibirInformacoes();
    }
}
