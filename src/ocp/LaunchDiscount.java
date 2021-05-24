package ocp;

public class LaunchDiscount implements Discount {

	@Override
	public Double apply(Double price) {
		return price * 0.5;
	}

}
