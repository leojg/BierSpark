package leojg.example.gradle.spark;

import static spark.Spark.*;

import leojg.example.gradle.spark.beer.BeerController;

public class Main {

	public static void main(String[] args) {
		
		port(8080);
		
		//Resource mapping
		get("/", (req, res) -> "Hello");
		get("/beers/", BeerController.getBeers);
		get("/beers/:name", BeerController.getBeersByName);
		
		System.out.print("hearing");
	}

}
