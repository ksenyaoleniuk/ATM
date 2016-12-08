/**
 * Created by olenyuk on 05.12.2016.
 */
public interface Exchange {
    public void setNext(Exchange next);

    public void getMoney(Currency currency);
}
