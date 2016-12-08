/**
 * Created by olenyuk on 05.12.2016.
 */
public class Dollar20Exchange implements Exchange{
    Exchange next;
    @Override
    public void setNext(Exchange nextCon) {
        next = nextCon;
    }

    @Override
    public void getMoney(Currency currency) {
        if (currency.getAmount() >= 50){
            int n = currency.getAmount();
            currency.takeAmount((n - n/50) * 50);
            next.getMoney(currency);
        }
        else{
            next.getMoney(currency);
        }

    }
}