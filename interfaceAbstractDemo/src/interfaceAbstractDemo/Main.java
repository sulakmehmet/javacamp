package interfaceAbstractDemo;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucsCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Mehmet", "Sulak", "59338103068")); 

	}

}
