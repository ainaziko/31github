package whz.pti.pizzaproject.pizza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Item extends BaseEntity<Long> {

    @Column(name = "item_id")
    private String itemId;

    private int quantity;

    @ManyToOne
    private Pizza pizza;

    @Column(name = "pizza_size")
    @Enumerated(EnumType.STRING)
    private PizzaSize pizzaSize;

    @Column(name = "item_price")
    private BigDecimal itemPrice;

}
