import Model.Accessory;
import Model.Clothing;
import Model.Product;
import Model.Shoes;
import Payment.CashPayment;
import Payment.CardPayment;
import Payment.WalletPayment;
import Payment.Bill;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thanh toan bang tien mat!");
        CashPayment cash = new CashPayment();
        cash.pay(200000,150000);

        System.out.println("Thanh toan bang the ngan hang!");
        CardPayment card = new CardPayment("1234567891234567",new Date());
        card.pay(200000,150000);


        System.out.println("Thanh toan bang vi dien tu!");
        WalletPayment wallet = new WalletPayment("0985922611");
        wallet.pay(200000,150000);
    }
}