package leojg.example.gradle.spark.beer;

import java.io.StringWriter;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import spark.Route;

public class BeerController {
	
	private static BeerDAO beerDAO;
		
	public static Route getBeers = (req, res) -> {

		String[] fromQueryParams= req.queryParamsValues("from");
		String from = null; 	
		
		if (fromQueryParams != null) {
			from = fromQueryParams[0];
		}
		
		beerDAO = new BeerDAO();		
		List<Beer> beers = beerDAO.getBeers(from);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		StringWriter sw = new StringWriter();
		
		mapper.writeValue(sw, beers);
		
		res.type("application/json");
		res.status(200);
		
		return sw.toString();
	};
	
	public static Route getBeersByName = (req, res) -> {
		
		String name = req.params().get(":name");
		
		if (name.isEmpty() != true) {		
			beerDAO = new BeerDAO();
			List<Beer> beers = beerDAO.getBeersByName(name);
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);
			StringWriter sw = new StringWriter();
			
			mapper.writeValue(sw, beers);
			
			res.type("application/json");
			res.status(200);
			
			return sw.toString();
			
		};
		
		res.status(400);
		return "";
		
	};
	
	
	
}
