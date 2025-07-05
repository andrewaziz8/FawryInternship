import java.util.ArrayList;
import java.time.LocalDate;

public class customer{
    private String id;
    private Double currbalance;
    private Double ordersub;
    private Double AllShippingfees;
    private ArrayList<product> allProducts = new ArrayList<>();
    private ArrayList<shippingservice> Service = new ArrayList<>();
    
    
    public customer(String i, Double balance){
        id = i;
        currbalance = balance;
        ordersub = 0.0;
        AllShippingfees = 0.0;
    }
    
    public void add(product p, Integer quant){
        if(p.isOutofstock()){
            System.out.println("Error! This product is currently out of stock");
            return;
        }
        if(p.isExp()){
            LocalDate today = LocalDate.now();
            if(today.isAfter(p.getExpirydate())){
                System.out.println("Error! This product is expired");
            return;
            }
        }
        if(p.getQuantity() >= quant){
            allProducts.add(p);
            shippingservice s = new shippingservice(p.getName(), p.getWeight());
            Service.add(s);
            ordersub = ordersub + (quant*p.getPrice());
            System.out.print(quant + "x " + p.getName());
            System.out.println("          " + (quant*p.getPrice()));
            if(p.isShip()){
                AllShippingfees = AllShippingfees + p.getShippingFees();
            }
        }
        else{
            System.out.println("Error! There is no available product of this quantity. The available quantity is only: " + p.getQuantity());
        }
    }
    
    public void Checkout(){
        if(allProducts.size() == 0){
            System.out.println("Error! the cart is empty.");
            return;
        }

        Double paidAmount = ordersub + AllShippingfees;
        if(paidAmount > currbalance){
            System.out.println("Error! you do not have enough money in your balance.");
            return;
        }
        
        System.out.println(" ** Checkout receipt ** ");
        
        System.out.println("----------------------------------");
        System.out.println("Subtotal                  " + ordersub);
        System.out.println("Shipping                  " + AllShippingfees);
        System.out.println("Amount                  " + paidAmount);
        System.out.println("Customer Current balance is " + (currbalance-paidAmount));
        
        System.out.println(" ** Shipment notice ** ");
        for(shippingservice sh: Service){
            System.out.print(sh.getName());
            System.out.println("          " + sh.getWeight() + "g");
        }
    }
}