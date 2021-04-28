package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer mehmet = new IndividualCustomer();
		mehmet.customerNumber = "12345";
		
		
		CorporateCustomer trendyol = new CorporateCustomer();
		trendyol.customerNumber = "54321";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(trendyol);
		//customerManager.add(mehmet);
		
		Customer[] customers = {mehmet, trendyol};
		
		customerManager.addMultiple(customers);

	}

}
