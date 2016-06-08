/**
 * 
 */
package rs.tijanap.gym.testModel;

/**
 * @author tijana.pavicic
 *
 */
public class FastFood {

	IHotMeal hotMeal;

	public IHotMeal getHotMeal() {
		return hotMeal;
	}

	public void setHotMeal(IHotMeal hotMeal) {
		this.hotMeal = hotMeal;
	}

	public void prepareHotMeal() {
		hotMeal.prepareHotMeal();

	}
}
