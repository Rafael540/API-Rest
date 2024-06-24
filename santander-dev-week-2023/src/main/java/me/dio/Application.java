package me.dio;

<<<<<<< HEAD
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

>>>>>>> dd7d6698c1de76eb052ea99ab9d6623e38285d21
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> dd7d6698c1de76eb052ea99ab9d6623e38285d21
