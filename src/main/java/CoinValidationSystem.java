public class CoinValidationSystem {

    public boolean validate(Coin coin) {
        if (isFiveCoin(coin)){
            return true;
        }
        if (coin.getDiametro() == 19.75 && coin.getPeso() == 1.51){
            return true;
        }
        return false;
    }

    private boolean isFiveCoin(Coin coin) {
        return coin.getDiametro() == 21.25 && coin.getPeso() == 3.9;
    }




}
