package  rs.tijanap.gym.testModel;

import java.util.List;

public class Restaurant {

	// String welcomeNote;
	private IHotDrink hotDrink;
	private IHotMeal hotCheese;
	private List restaurantWaitressList;

	public Restaurant(IHotDrink hotDrink) {
		// super();
		this.hotDrink = hotDrink;
	}

	/*
	 * public String getWelcomeNote() { return welcomeNote; }
	 * 
	 * public void setWelcomeNote(String welcomeNote) { this.welcomeNote =
	 * welcomeNote; }
	 * 
	 * public void greetCustomer() { System.out.println(welcomeNote); }
	 */

	public IHotMeal getHotCheese() {
		return hotCheese;
	}

	public void setHotCheese(IHotMeal hotCheese) {
		this.hotCheese = hotCheese;
	}
	

	public List getRestaurantWaitressList() {
		return restaurantWaitressList;
	}

	public void setRestaurantWaitressList(List restaurantWaitressList) {
		this.restaurantWaitressList = restaurantWaitressList;
	}

	public void prepareHotDrink() {
		hotDrink.prepareHotDrink();

	}
	
	public void prepareHotCheese() {
		hotCheese.prepareHotMeal();
		
	}
	public void displayWaitressNames(){
		System.out.println("All waitress" + restaurantWaitressList);
	}

}
