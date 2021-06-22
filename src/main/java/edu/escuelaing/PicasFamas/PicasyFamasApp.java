package edu.escuelaing.PicasFamas;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PicasyFamasApp {
	public static void main(String[] args) {
		int port = getPort();
        SpringApplication app = new SpringApplication(PicasyFamasApp.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", port));
        app.run(args);
	}

	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 8080; // returns default port if heroku-port isn't set (i.e. on localhost)
	}
}
