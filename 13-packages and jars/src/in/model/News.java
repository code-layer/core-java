package in.model;

public class News {
	private static String[ ] news;
	public static int newsCount = 2;
	
	static {
		news = new String[2];
		news[0] = "Indian won World Cup";
		news[1] = "A-320 Emergency Landing";
	}
	
	public static String[] getAllNews() {
		return news;
	}
	
	public static String getCurrentNews() {
		return news[1];
	}
	
}