package singletone.example;

public class SecondPage {
	private Settings_Example settings = Settings_Example.getInstance();
	
	public void printSettings() {
		System.out.println(settings.isDarkmode()+" "+settings.getFontSize());
	}
	
}
