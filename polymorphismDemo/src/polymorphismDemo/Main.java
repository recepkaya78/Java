package polymorphismDemo;

public class Main {
	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.Log("Log mesaji");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(),new DatabaseLogger()};
				
				
	}
}
