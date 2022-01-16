public class CoinValidationSystem {

    public boolean validate(Coin coin) {
        if (isFiveCoin(coin)){
            return true;
        }
        if (isTenCoin(coin)){
            return true;
        }
        return false;
    }

    private boolean isTenCoin(Coin coin) {
        return coin.getDiametro() == 19.75 && coin.getPeso() == 1.51;
    }

    private boolean isFiveCoin(Coin coin) {
        return coin.getDiametro() == 21.25 && coin.getPeso() == 3.9;
    }




}
