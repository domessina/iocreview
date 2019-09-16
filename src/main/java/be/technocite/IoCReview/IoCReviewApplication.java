package be.technocite.IoCReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class IoCReviewApplication implements CommandLineRunner {

	@Autowired
	private CarFactory carFactory;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(IoCReviewApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run();
	}

	public void run(String... args) {
		carFactory.startFactory();
	}


}
