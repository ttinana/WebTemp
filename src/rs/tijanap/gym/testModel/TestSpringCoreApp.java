package rs.tijanap.gym.testModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringCoreApp {

	public  void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		 
		Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		FastFood fastFoodObj = (FastFood) context.getBean("fastFoodBean");
		//restaurantObj.greetCustomer();
		restaurantObj.prepareHotDrink();
		restaurantObj.prepareHotCheese();
		restaurantObj.displayWaitressNames();
		fastFoodObj.prepareHotMeal();
	}
}
