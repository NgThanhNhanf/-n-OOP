package Payment;

import java.util.Date;

public class CardPayment implements PayMent{
    private String cardNumber;
    private Date expiryDate;
    private double balance;

    public CardPayment(String cardNumber,Date expiryDate){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount, double priceItem) {
        if(isValid(cardNumber)){
            System.out.println("So tien can thanh toan:" + priceItem);
            if(amount > priceItem){
                balance = amount - priceItem;
            }else balance = 0;
            bill(amount,priceItem);
        }else{
            System.out.println("so the khong hop le!");
            return;
        }
    }

    public double getBalance(){
        return  balance = 0;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Hoan tra khong can thiet!");
    }

    @Override
    public boolean isValid(String details) {
       for(int i = 0; i < details.length();i++){
           if(details.charAt(i) < 0  && details.charAt(i) > 9) return false;
           return true;
       }
       if(details.length() != 16) return false;
       return true;
    }

    @Override
    public void bill(double amount,double priceItem) {
        System.out.println("THANH TOAN BANG THE NGAN HANG");
        System.out.println("-------------Hóa đơn bán hàng--------------");
        System.out.println("Gía sản phẩm: " + priceItem);
        System.out.println("Tiền khách đưa: " + amount);
        System.out.println("Tiền trả lại: " + getBalance());
    }
}
