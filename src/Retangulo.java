public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    double calcularArea() {
        return getLargura() * getAltura();
    }

    double calcularPerimetro() {
        return 2 * (getLargura() + getAltura());
    }

    void exibirInformacoes() {
        System.out.println("\n========= Informações do retãngulo =========");
        System.out.println("Largura: " + getLargura());
        System.out.println("Altura: " + getAltura());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

