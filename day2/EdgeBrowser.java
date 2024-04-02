package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		Browser bwe = new Browser();
		 bwe.loadUrl();
		 String launchBrowser = bwe.launchBrowser("Chrome");
		System.out.println(launchBrowser);

	}

}
