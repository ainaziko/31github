package whz.pti.pizzaproject.pizza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity(name = "Ordered")
public class Ordered extends BaseEntity<Long> {

    @Column(name = "number_of_items")
    private int numberOfItems;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "ordered_items")
    @OneToMany(fetch = FetchType.EAGER)
    private List<OrderedItem> orderedItems;

    @Column(name = "total_price")
    private double totalPrice;

}
