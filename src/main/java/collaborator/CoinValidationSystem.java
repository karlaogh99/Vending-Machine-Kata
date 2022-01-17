package collaborator;

import model.Coin;

public class CoinValidationSystem {

    public boolean validate(Coin coin) {
        if (isFiveCoin(coin)){
            return true;
        }
        if (isTenCoin(coin)){
            return true;
        }
        if (isTwentyCoin(coin)){
            return true;
        }
        if (isFyftyCoin(coin)){
            return true;
        }
        if (is1EuroCoin(coin)){
            return true;
        }
        if (is2EuroCoin(coin)){
            return true;
        }
        return false;
    }

    private boolean isTenCoin(Coin coin) {
        return coin.getDiametro() == 19.75 && coin.getPeso() == 4.1;
    }

    private boolean isFiveCoin(Coin coin) {
        return coin.getDiametro() == 21.25 && coin.getPeso() == 3.9;
    }
    private boolean isTwentyCoin(Coin coin) {
        return coin.getDiametro() == 22.25 && coin.getPeso() == 5.7;
    }
    private boolean isFyftyCoin(Coin coin) {
        return coin.getDiametro() == 24.25 && coin.getPeso() == 7.8;
    }
    private boolean is1EuroCoin(Coin coin) {
        return coin.getDiametro() == 23.25 && coin.getPeso() == 7.5;
    }
    private boolean is2EuroCoin(Coin coin) {
        return coin.getDiametro() == 25.75 && coin.getPeso() == 8.5;
    }


}
