package ocp;

public class GoldDiscount implements Discount {
	@Override
	public Double apply(Double price) {
		return price * 0.2;
	}
}
