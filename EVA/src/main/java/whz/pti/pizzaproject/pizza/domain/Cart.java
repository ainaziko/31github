package whz.pti.pizzaproject.pizza.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity(name = "cart")
public class Cart extends BaseEntity<Long> {

    private int quantity;

}
