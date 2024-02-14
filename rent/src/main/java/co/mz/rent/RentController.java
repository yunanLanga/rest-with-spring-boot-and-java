package co.mz.rent;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/rent")
	public Rent rent(@RequestParam(value="name",defaultValue="World") String name) {
		return new Rent( counter.incrementAndGet(), String.format(template, name));
	}
	
}
