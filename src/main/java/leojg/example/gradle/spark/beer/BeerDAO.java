package leojg.example.gradle.spark.beer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BeerDAO {
	
	List<Beer> beers;
	
	public BeerDAO() {
		beers = new ArrayList<Beer>(10);
		beers.add(new Beer(1,"LeBeer",null));
		beers.add(new Beer(2,"LeBeer2",null));
		beers.add(new Beer(3,"LeBeer3",null));
		beers.add(new Beer(4,"LeBeer4",null));
		
	}
	
	public List<Beer> getBeers(String from) {
		return beers;
	}
	
	public List<Beer> getBeersByName(String name) {
		
		List<Beer> result = new ArrayList<Beer>(beers.size());
		
		Predicate<Beer> predicate = (Beer b) -> b.getName().toLowerCase().equals(name.toLowerCase());
		
		beers.stream().filter(predicate).forEach(p -> result.add(p));
		
		return result;
	}

}
