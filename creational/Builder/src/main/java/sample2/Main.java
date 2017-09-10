package sample2;

public class Main {
	public static void main(String[] args) {
		
		LunchOrderBean lunchOrderBean = new LunchOrderBean("Wheat", "Lettuce", "Mustard", "Meat");
		
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiments("Lettuce");
//		lunchOrderBean.setDressing("Mustard");
//		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}
}
