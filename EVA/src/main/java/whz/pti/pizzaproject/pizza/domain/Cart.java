package whz.pti.pizzaproject.pizza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity(name = "cart")
public class Cart extends BaseEntity<Long> {

    private int quantity;

    @OneToMany
    private Map<String, Item> items;

    @Enumerated(EnumType.STRING)
    private Status status;

}
