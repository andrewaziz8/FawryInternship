// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        product cheese = new product("cheese", 10.0, 2, true, true, 10.0);
        product biscuits = new product("biscuits", 20.0, 1, true, true, 2.0);
        product TV = new product("TV", 500.0, 10, true, false, 80.0);
        product Mobile = new product("Mobile", 1000.0, 1, true, false, 20.0);
        cheese.setShippingFees(20.0);
        TV.setShippingFees(200.0);
        
        customer jack = new customer("jack", 2000.0);
        jack.add(cheese, 2);
        jack.add(TV, 2);
        
        jack.Checkout();
    }
}