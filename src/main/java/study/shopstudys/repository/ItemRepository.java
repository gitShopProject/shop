package study.shopstudys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.shopstudys.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
