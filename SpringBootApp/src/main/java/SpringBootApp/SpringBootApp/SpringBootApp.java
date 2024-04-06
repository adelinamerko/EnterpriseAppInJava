package SpringBootApp.SpringBootApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApp implements CommandLineRunner {
	// Method 1
	// run() method for springBootApplication to execute
	@Override
	public void run(String args[]) throws Exception
	{
		// Print statement when method is called
		System.out.println("HEllo world");
	}
	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Calling run() method to execute
		// SpringBootApplication by
		// invoking run() inside main() method
		SpringApplication.run(
				SpringBootApp.class, args);
	}
}
