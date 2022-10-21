public class ClassProductList {

	private Product product;

	private ReminderVisitor reminderVisitor;

	public void accept(NodeVisitor visitor) {
		System.out.println("Reminder");
	}

}
