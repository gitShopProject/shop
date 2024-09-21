package study.shopstudys.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.shopstudys.entity.Item;
import study.shopstudys.repository.ItemRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}
