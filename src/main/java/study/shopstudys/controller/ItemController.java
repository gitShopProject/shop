package study.shopstudys.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import study.shopstudys.entity.Item;
import study.shopstudys.service.ItemService;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/write")
    public String write() {
        return "write.html";
    }

    @PostMapping("/add")
    public String itemAdd(@RequestParam String title,
                          @RequestParam Long price) {
        itemService.save(title,price);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) {
        Optional<Item> result = itemService.findById(id);
        if (result.isPresent()){
            model.addAttribute("data", result.get());
            return "detail.html";
        } else {
            return "redirect:/list";
        }
    }

    @GetMapping("/detail2/{id}")
    String detail2(@PathVariable Long id, Model model) throws Exception {
        throw new Exception();
//        Optional<Item> result = itemService.findById(id);
//        if (result.isPresent()){
//            model.addAttribute("data", result.get());
//            return "detail.html";
//        } else {
//            return "redirect:/list";
//        }
    }

}
