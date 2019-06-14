package advancedoop.abstractclasses;

public class AbstractDemo2 {

	public static void main(String[] args) {

	}

}

class MyPersonalWebpage extends Webpage {

	@Override
	void renderPage() {
		page.println("Hello world")
	}
	
}

abstract class Webpage {
	String createTable(String[][] tableData) {
		return "";  // ....
	}
	
	String createParagraph(String paragraphText) {
		return "<p>" + paragraphText + "</p>";
	}
	
	abstract void renderPage();
}