package study.shopstudys.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString()
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Long price;

    @Builder
    public Item(String title, Long price) {
        this.title = title;
        this.price = price;
    }
}
