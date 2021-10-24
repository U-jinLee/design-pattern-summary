package singletone;

public class App {
	
	public static void main(String[] args) {
		Settings setting = Settings.getInstance();
		Settings setting2 = Settings.getInstance();
		
		System.out.println(setting == setting2);
	}
	
}
