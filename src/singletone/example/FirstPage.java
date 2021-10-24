package singletone.example;

public class FirstPage {
	private Settings_Example settings = Settings_Example.getInstance();
	
	public void setAndPrintSetting() {
		settings.setDarkmode(true);
		settings.setFontSize(15);
		System.out.println(settings.isDarkmode()+" "+settings.getFontSize());
	}
}
