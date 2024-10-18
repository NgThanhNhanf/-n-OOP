package Payment;

public class WalletPayment implements PayMent{
    private String soDienThoai;
    private double balance;
    @Override
    public void pay(double amount,double priceItem) {
        if(!isValid(soDienThoai)){
            System.out.println("So tien can thanh toan: " + priceItem);
            if(amount > priceItem){
                balance = amount - priceItem;
            }else balance = 0;
        }else{
            System.out.println("So dien thoai khong hop le!");
            return;
        }
    }
    public double getBalance(){
        return balance  = 0 ;
    }
    @Override
    public void refund(double amount) {
        System.out.println("Hoan tra khong can thiet!");
    }

    @Override
    public boolean isValid(String details) {
        for (int i = 0; i < details.length(); i++) {
            if (details.charAt(i) < 0 && details.charAt(i) > 9) return false;
            return true;
        }
        if (details.length() != 9) return false;
        return true;
    }
    @Override
    public void bill(double amount,double priceItem) {
        System.out.println("THANH TOAN BANG VI DIEN TU");
        System.out.println("-------------Hóa đơn bán hàng--------------");
        System.out.println("Gía sản phẩm: " + priceItem);
        System.out.println("Tiền khách đưa: " + amount);
        System.out.println("Tiền trả lại: " + getBalance());
    }
}
