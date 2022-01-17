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

    @Override
    public boolean equals(Object obj ){
        if (obj instanceof Coin){
            Coin coinToCompare = (Coin) obj;
            return (coinToCompare.getDiametro() == this.diametro &&
                    coinToCompare.getPeso() == this.peso);
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    }

}
