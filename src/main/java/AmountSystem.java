
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
        amountDictionary.put(new Coin(22.25, 5.7), 0.20);
        amountDictionary.put(new Coin(21.25, 3.9), 0.05);
        amountDictionary.put(new Coin(24.25, 7.8), 0.50);
        amountDictionary.put(new Coin(25.75, 8.5), 2.00);
        amountDictionary.put(new Coin(19.75, 4.1), 0.10);

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
        return amountDictoniaryContains(coin) ?
                this.amountDictionary.get(coin) : 0.00;
    }
    private boolean amountDictoniaryContains(Coin coin) {
        return this.amountDictionary.get(coin) != null ;
    }

}
