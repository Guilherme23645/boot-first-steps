package depaula.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class MyApp implements CommandLineRunner {
	@Autowired
	private Calculator calculator;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Result: "+calculator.sum(3,4));
	}
}
