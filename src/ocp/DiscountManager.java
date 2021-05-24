package ocp;

public class DiscountManager {
	
	public Double apply(Double price, Discount discount) {
		return discount.apply(price);
	}
	
}
