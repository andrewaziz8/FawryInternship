interface shserv{
    String getName();
    Double getWeight();
}

class shippingservice implements shserv{
    private Double weight;
    private String name;
    
    public shippingservice(String n, Double w){
        name = n;
        weight = w;
    }
    
    public String getName(){
        return name;
    }
    public Double getWeight(){
        return weight;
    }
    
}