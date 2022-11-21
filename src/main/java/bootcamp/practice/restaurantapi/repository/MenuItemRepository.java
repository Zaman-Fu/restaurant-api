package bootcamp.practice.restaurantapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bootcamp.practice.restaurantapi.entity.MenuItem;

public interface MenuItemRepository extends JpaRepository <MenuItem,Long> {
	
	public List<MenuItem> findByCategory(String category);
	

}
