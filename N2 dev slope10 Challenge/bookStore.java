import java.util.ArrayList;
import java.time.LocalDate;

public class bookStore{
    private ArrayList<book> books = new ArrayList<>();
    private ArrayList<customer> customers = new ArrayList<>();
    
    public bookStore(){
    }
    public void add(book b){
        if( (books.size() > 0) && books.contains(b)){
            System.out.println("This book already exists in the store!!!!");
        }
        else{
            System.out.println("Added Successfully to the book store");
            books.add(b);
        }
    }
    
    public void remove(book b, Integer num_years){
        int currentYear = LocalDate.now().getYear();
        if( (currentYear - b.getYear()) >= num_years ){
            System.out.println("Removed Successfully from the book store");
            books.remove(b);
        }
        else{
            System.out.println("Cannot remove this book. Still does not exceed the specific number of years");
        }
    }
    
    public Double buy(customer c, String ISBN, Integer quantity, String email, String address){
        if(!customers.contains(c)){
            customers.add(c);
        }
        
        Boolean done = false;
        Double paidPrice = -1.0;
        for(book bo: books){
            if(ISBN.equals(bo.getISBN())){
                if(bo.getQuant() >= quantity){
                    done = true;
                    paidPrice = quantity*bo.getPrice();
                    // if ( (bo.getQuant() - quantity) == 0 ){
                    //     books.remove(bo);
                    // }
                    // else{
                    bo.setQuant( (bo.getQuant() - quantity) );
                    if(bo.isPaperbook()){
                        System.out.println("Successfully bought this book and Sent Successfully to the shipping service with the address: " + address);
                    }
                    else if(bo.isEbook()){
                        System.out.println("Successfully bought this book and Sent Successfully to the MailService with the email: " + email);
                    }
                    System.out.println("Paid Amount is: " + paidPrice);
                }
                else{
                    paidPrice = -1.0;
                    throw new RuntimeException("Error! This quantity is not available right now");
                }
                break;
            }
        }
        
        if(!done){
            System.out.println("No book found with this ISBN. Try again");
        }
        return paidPrice;
    }
}