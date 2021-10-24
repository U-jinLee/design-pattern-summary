package singletone.example;

public class Settings_Example {
	
	private static Settings_Example settings = null;
	
	private Settings_Example () {		
	}
	
	public static Settings_Example getInstance() {
		if(settings == null) {
			return settings = new Settings_Example();
		}
		return settings;
	}
	
	private boolean darkmode = false;
	private int fontSize = 13;

	public boolean isDarkmode() {return darkmode;}
	public int getFontSize() {return fontSize;}

	public void setDarkmode(boolean _darkmode) {
		this.darkmode = _darkmode;
	}
	public void setFontSize(int _fontSize) {
		this.fontSize = _fontSize;
	}
	
	
}
