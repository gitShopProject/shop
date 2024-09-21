package study.shopstudys.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import study.shopstudys.entity.Item;
import study.shopstudys.service.ItemService;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/list")
    public String list(Model model) {

        List<Item> result = itemService.findAll();
        model.addAttribute("items",result);

        return "list.html";
    }


}
