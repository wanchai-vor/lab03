package rmuti.lab03;

/**
 * Hello world!
 *
 */
public class App extends ArraysList {

	public static void main(String[] args) {
		App app = new App();
	
		System.out.print("Remove even => ");
		app.removeEven();
		System.out.println(app.toString());

		System.out.print("Add first => ");
		app.addFirst(5);
		System.out.println(app.toString());

		System.out.print("Add last => ");
		app.addLast(6);
		System.out.println(app.toString());
	}
}