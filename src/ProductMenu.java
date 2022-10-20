import java.util.HashMap;

public interface ProductMenu {

//	private Person person;
	public Person person = null;

	public abstract void showMenu(HashMap<String, Integer> menu_data);

	public abstract void showAddButton(HashMap<String, Integer> menu_data);

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

}
