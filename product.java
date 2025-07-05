import java.time.LocalDate;

public class product{
    private String name;
    private Double price;
    private Integer quantity;
    private Boolean shippable;
    private Boolean expirable;
    private LocalDate expirydate;
    private Double shippingfees;
    private Boolean outofstoch;
    private Double weight;
    
    public product(String n, Double prc, Integer quant, Boolean ship, Boolean expir, Double w){
        name = n;
        price = prc;
        quantity = quant;
        shippable = ship;
        expirable = expir;
        expirydate = LocalDate.of(2025,7,5);
        shippingfees = 0.0;
        outofstoch = false;
        weight = w;
    }
    
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public Boolean isShip(){
        return shippable;
    }
    public Boolean isExp(){
        return expirable;
    }
    public LocalDate getExpirydate(){
        return expirydate;
    }
    public Double getShippingFees(){
        return shippingfees;
    }
    public Boolean isOutofstock(){
        return outofstoch;
    }
    public Double getWeight(){
        return weight;
    }
    public void setExpirydate(int year, int month, int day){
        expirydate = LocalDate.of(year, month, day);
    }
    public void setShippingFees(Double fees){
        shippingfees = fees;
    }
    public void setStock(Boolean s){
        outofstoch = s;
    }
    
}