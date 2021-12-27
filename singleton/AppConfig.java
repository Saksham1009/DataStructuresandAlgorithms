package singleton;

public class AppConfig {

	private AppConfig() {
		
		
		
	}
	
	private static AppConfig obj = new AppConfig();	
	public static AppConfig getobj() {
		
		return obj;
		
	}
	
}
