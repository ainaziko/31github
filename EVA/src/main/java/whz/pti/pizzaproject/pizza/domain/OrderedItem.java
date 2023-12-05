package whz.pti.pizzaproject.pizza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity(name = "ordered_item")
public class OrderedItem extends BaseEntity<Long> {

    @Column(name = "pizza_id")
    private Long pizzaId;

    private String name;

    private int quantity;

    @Column(name = "ordered_item_price")
    private BigDecimal orderedItemPrice;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "pizza_size")
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

}
