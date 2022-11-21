package bootcamp.practice.restaurantapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcamp.practice.restaurantapi.entity.MenuItem;
import bootcamp.practice.restaurantapi.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	MenuItemRepository repository;
	
	public List<MenuItem> getAllItems(){
		
		return repository.findAll();
		
	}
	
	public List<MenuItem> getItemsByCategory(String category){
		
		return repository.findByCategory(category);
	}

}
