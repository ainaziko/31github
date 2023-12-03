package whz.pti.pizzaproject.pizza.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;
import whz.pti.pizzaproject.common.BaseEntity;

import javax.persistence.*;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "pizza")
@Proxy(lazy=false)
public class Pizza extends BaseEntity<Long> {

    private String name;

    @Column(name = "price_large")
    private BigDecimal priceLarge;

    @Column(name = "price_medium")
    private BigDecimal priceMedium;

    @Column(name = "price_small")
    private BigDecimal priceSmall;

}
