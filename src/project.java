public class project {

	public static void main(String[] args) {
		double price = 6000;
		final double D1 = 0.10;
		final double D2 = 0.20;
		
		double finalprice;
		
		if(price > 5000) {
			finalprice = price - (price * D2);
		}else if (price > 1000) {
			finalprice = price - (price * D1);
		}else {
			finalprice = price;
		}
		System.out.println("original price: - " +price);
		System.out.println("Afte discount: " +finalprice);
	}

}
