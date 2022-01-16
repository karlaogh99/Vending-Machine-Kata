public class Coin {
    private final double peso;
    private final double diametro;


    public Coin(double diametro, double peso) {
        this.diametro = diametro;
        this.peso = peso;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getPeso() {
        return peso;
    }


}
