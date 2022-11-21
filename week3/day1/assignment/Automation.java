package week3.day1.assignment;

public class Automation extends MultipleLangauge implements Language,TestTool {
	
	public void ruby() {
		System.out.println("Ruby");
	}
	
	public void selenium()
	{
		System.out.println("Selenium");
	}
	public void java()
	{
		System.out.println("Java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a = new Automation();
		a.python();
		a.ruby();
		a.selenium();
		a.java();
		
		

	}

}
