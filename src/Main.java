/**
 * Created by olenyuk on 05.12.2016.
 */
public class Main {
    public static void Main(String[] args){
        Dollar50Exchange d50 = new Dollar50Exchange();
        Dollar10Exchange d10 = new Dollar10Exchange();
        Dollar20Exchange d20 = new Dollar20Exchange();
//        Dolar100Exchange d100 = new Dollar100Exchange();
        d50.setNext(d20);
        d20.setNext(d10);
        d10.getMoney(new Currency(100));
    }
}
