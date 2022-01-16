public class CoinValidationSystem {

    public boolean validate(Coin coin) {
        if (coin.getDiametro() == 21.25 && coin.getPeso() == 3.9){
            return true;
        }
        return false;
    }
}
