package bootcamp.practice.restaurantapi.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import bootcamp.practice.restaurantapi.entity.MenuItem;
import bootcamp.practice.restaurantapi.repository.MenuItemRepository;

@Component
public class RestaurantAppCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	MenuItemRepository menuRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		menuRepository.save(new MenuItem(0l,"Marquis Burger", "beef burger with bacon,cheese and pepper sauce", "Main", 8.00f));
		menuRepository.save(new MenuItem(1l,"Count Burger", "mixed smashed burger with cheese and caramelized onions", "Main", 7.50f));
		menuRepository.save(new MenuItem(2l,"Songbird Salad", "Iceberg vinegrette with prunes and almonds", "Side", 5.00f));
		menuRepository.save(new MenuItem(3l,"Poutintine", "extra cheesy poutine, the envy of all canada", "Side", 5.00f));
		menuRepository.save(new MenuItem(4l,"Nuka Cola", "the original nuka cola taste", "Drink", 1.00f));
		menuRepository.save(new MenuItem(5l,"Nuka Cola lite", "with a shorter half life for the less adventurous", "Drink", 1.00f));
		
	}

}
