package Payment;

public class CashPayment implements PayMent{
    private double balance;
    @Override
    public void pay(double amount,double priceItem) {
        System.out.println("so tien can thanh toan: " + priceItem);
        if(amount > priceItem){
            System.out.println("so tien du: ");
            balance = amount - priceItem;
        }else if(amount == priceItem){
            balance = 0;
        }else {
            System.out.println("thanh toan khong thanh cong");
            return;
        }
       bill(amount,priceItem);
    }

    public double getBalance(){
        return balance;
    };
    @Override
    public void refund(double amount) {
        System.out.print("so tien thoi lai: " + getBalance());
    }

    @Override
    public boolean isValid(String details) {
        return true;
    }

    @Override
    public void bill(double amount,double priceItem) {
        System.out.println("-------------Hóa đơn bán hàng--------------");
        System.out.println("Gía sản phẩm: " + priceItem);
        System.out.println("Tiền khách đưa: " + amount);
        if(balance > 0){
            System.out.println("Tiền trả lại: " + getBalance());
        }else System.out.println("Tiền trả lại: 0");
    }
}
