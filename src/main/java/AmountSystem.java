
import java.util.HashMap;

public class AmountSystem {

    private double currentAmount;
    private CoinValidationSystem coinValidationSystem;
    private HashMap<Coin, Double> amountDictionary;

    public AmountSystem() {
        this.currentAmount = 0.0;
        this.coinValidationSystem = new CoinValidationSystem();
        this.amountDictionary = loadAmountDictioanary();
    }

    private HashMap <Coin, Double> loadAmountDictioanary(){
        amountDictionary = new HashMap<>();
        amountDictionary.put(new Coin(23.25, 7.5), 1.00);
        return amountDictionary;
    }

    public double getCurrentAccount() {
        return this.currentAmount;
    }

    public double addAmountFrom(Coin coin) {
        if (coinValidationSystem.validate(coin)){
            this.currentAmount += getAmountFrom(coin);
            
        }
        return this.currentAmount;

    }

    private double getAmountFrom(Coin coin) {
        return this.amountDictionary.get(coin);
    }
}
