/**
 * Created by olenyuk on 05.12.2016.
 */
public class Currency {
    int amount;
    public Currency(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;

    };
    public void takeAmount(int money){
        amount -= money;
    }
}
