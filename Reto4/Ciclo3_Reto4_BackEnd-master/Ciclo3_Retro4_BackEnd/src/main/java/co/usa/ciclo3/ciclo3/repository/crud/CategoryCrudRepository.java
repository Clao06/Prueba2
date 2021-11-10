package co.usa.ciclo3.ciclo3.repository.crud;

/**
 *
 * @author Claudia Díaz
 */

import co.usa.ciclo3.ciclo3.model.Category;
import org.springframework.data.repository.CrudRepository;


public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
    
}

