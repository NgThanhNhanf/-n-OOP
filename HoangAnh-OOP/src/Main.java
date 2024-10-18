import Model.Accessory;
import Model.Clothing;
import Model.Product;
import Model.Shoes;

public class Main {
    public static void main(String[] args) {
        Product item = new Product();
        Product item1 = new Accessory();
        Product item2 = new Clothing();
        Product item3 = new Shoes();
        //item.displayInfor();
        //item1.displayInfor();
        item2.displayInfor();
    }
}