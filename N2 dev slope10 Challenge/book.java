public class book{
    private String ISBN;
    private String title;
    private Integer year;
    private Double price;
    private Integer quantity;
    private Boolean Paperbook;
    private Boolean Ebook;
    private Boolean Demobook;
    private Boolean otherProducts;
    private String productName;
    
    public book(String isbn, String ti, Integer ye, Double pr, Integer q, Boolean P, Boolean E, Boolean D){
        ISBN = isbn;
        title = ti;
        year = ye;
        price = pr;
        quantity = q;
        Paperbook = P;
        Ebook = E;
        Demobook = D;
        otherProducts = false;
        productName = "";
    }
    
    public Integer getYear(){
        return year;
    }
    public String getISBN(){
        return ISBN;
    }
    public Integer getQuant(){
        return quantity;
    }
    public Double getPrice(){
        return price;
    }
    public Boolean isPaperbook(){
        return Paperbook;
    }
    public Boolean isEbook(){
        return Ebook;
    }
    public Boolean isotherProducts(){
        return otherProducts;
    }
    public String getproductName(){
        return productName;
    }
    public void setQuant(Integer q){
        quantity = q;
    }
    public void setotherProducts(Boolean other){
        otherProducts = other;
    }
    public void setproductName(String prodName){
        productName = prodName;
    }
    
}