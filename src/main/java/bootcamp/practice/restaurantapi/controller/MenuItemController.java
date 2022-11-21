package bootcamp.practice.restaurantapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.practice.restaurantapi.entity.MenuItem;
import bootcamp.practice.restaurantapi.service.MenuItemService;

@RestController
public class MenuItemController {
	
	
	MenuItemService service;
	
	@GetMapping("/menu")
	public ResponseEntity<List<MenuItem>> GetMenuItems() {
		
		List<MenuItem> menuItems= service.getAllItems();
		if(menuItems.size()==0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<MenuItem>>(menuItems,HttpStatus.OK);
		
	}
	
	@GetMapping("/menu/{category}")
	public ResponseEntity<List<MenuItem>> GetMenuItemsByCategory(@PathVariable String category){
		
		List<MenuItem> menuItems= service.getItemsByCategory(category);
		if(menuItems.size()==0) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<MenuItem>>(menuItems,HttpStatus.OK);
		
	}

}
