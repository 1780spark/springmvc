package cn.com.rscala.springmvc.view.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "wine")
public class Wine {
	
	private String name;
	
	private String flavor;
	
	private List<String> toppings = new ArrayList<String>();
	
	public Wine(){
		
	}
	
	public Wine(String name){
		this.name = name;
		this.flavor = "spicy";
		this.toppings.add("Cheese");
		this.toppings.add("Stout");
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public List<String> getToppings() {
		return toppings;
	}
	
	@XmlElement
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
	
}
