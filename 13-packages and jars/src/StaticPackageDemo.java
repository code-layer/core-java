import static in.model.News.*;

public class StaticPackageDemo {
	public static void main(String[] args) {
		System.out.println("News Count: " + newsCount );
		String news = getCurrentNews();
		System.out.println(" *** latest news ***");
		System.out.println(news);
	}
}