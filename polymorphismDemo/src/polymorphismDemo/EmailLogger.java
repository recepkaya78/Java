package polymorphismDemo;

public class EmailLogger extends BaseLogger
{
	//Override logger
	public void Log(String message) {
		System.out.println("Log to Email : "+message);
	}

}
