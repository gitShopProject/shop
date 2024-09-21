package study.shopstudys.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import study.shopstudys.entity.Item;
import study.shopstudys.repository.ItemRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    public void save(String title, Long price) {

        validation(title,price);

        Item item = Item.builder()
                .title(title)
                .price(price)
                .build();

        itemRepository.save(item);

    }

    private void validation(String title, Long price) {

        if (title == null || price == null) {
            throw new RuntimeException("제목이나 가격은 반드시 입력해야 합니다.");
        }

    }

    public Optional<Item> findById(Long id) {

        return itemRepository.findById(id);

    }
}
