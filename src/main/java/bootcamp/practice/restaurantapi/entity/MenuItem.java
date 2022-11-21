package bootcamp.practice.restaurantapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MenuItem {
	
	@Id
	@GeneratedValue
	Long Id;
	
	@Column
	String name;
	
	@Column
	String description;
	
	@Column
	String category;
	
	@Column 
	Float price;

	public MenuItem(Long id, String name, String description, String category, Float price) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItem [Id=" + Id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
	

}
