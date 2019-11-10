package Kernal;
import Flipkart.*;

public class ObjectFactory {
	public static AppType app = new RideSharingApp();
	public static AppType getObject(String AppType) {
		if(AppType.equalsIgnoreCase("RideShare"))
			return app;
		
		return null;
	}
}
