package kau.coop.deliverus.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Embeddable
@NoArgsConstructor
@ToString
@Getter
public class Menu {

    @ElementCollection
    @CollectionTable(
            name = "restaurant_menu",
            joinColumns = @JoinColumn(name = "id")
    )

    private List<Food> menu;
}
