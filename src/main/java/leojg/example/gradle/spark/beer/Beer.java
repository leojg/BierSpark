package leojg.example.gradle.spark.beer;

import leojg.example.gradle.spark.BeerType;

public class Beer {
	
	private Integer id;
	private String name;
	private String desc;
	private String homeTown;
	private BeerType type;
	private String image;
	
	public Beer(Integer id, String name, BeerType type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public BeerType getType() {
		return type;
	}
	public void setType(BeerType type) {
		this.type = type;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
}
