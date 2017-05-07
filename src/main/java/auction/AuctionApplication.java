package auction;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.vertx.core.Vertx;

@SpringBootApplication
public class AuctionApplication {

	@Autowired
	private AuctionServiceVerticle verticle;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Vertx vertx = Vertx.vertx();
//		vertx.deployVerticle(new AuctionServiceVerticle());
		
		SpringApplication.run(AuctionApplication.class);
	}

	@PostConstruct
	public void deploy(){
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(verticle);
		
	}
}