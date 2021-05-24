package ocp;

public class BlackFridayDiscount implements Discount {
	@Override
	public Double apply(Double price) {
		return price * 0.4;
	}
}
