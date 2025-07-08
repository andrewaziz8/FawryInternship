public class Main
{
	public static void main(String[] args) {
		System.out.println(" * Welcome to the New Online Book Store * ");
		book b1 = new book("1234", "title1", 2003, 2000.90, 3, true, false, false);
		book b2 = new book("12345", "title2", 1995, 100.5, 4, true, false, false);
		book b3 = new book("123456", "title3", 1889, 1000.50, 1, false, true, false);
		book b4 = new book("1234567", "title4", 1850, 1500.0, 10, false, true, false);
		book b5 = new book("12345678", "title5", 2024, 3500.90, 6, false, false, true);
		
		bookStore QuantumStore = new bookStore();
		
		customer jack = new customer("jack@gmail.com", "New Cairo");
		
		QuantumStore.add(b1);
		QuantumStore.add(b1);
		QuantumStore.add(b2);
		QuantumStore.add(b3);
		QuantumStore.add(b4);
		QuantumStore.add(b5);
		
		QuantumStore.remove(b1, 24);
		QuantumStore.remove(b1, 21);
		
        QuantumStore.buy(jack, "noTitle", 2, "jack@gmail.com", "New Cairo");
		QuantumStore.buy(jack, "12345", 2, "jack@gmail.com", "New Cairo");
		QuantumStore.buy(jack, "1234567", 10, "jack@gmail.com", "New Cairo");
		QuantumStore.buy(jack, "1234567", 2, "jack@gmail.com", "New Cairo");
	}
}
