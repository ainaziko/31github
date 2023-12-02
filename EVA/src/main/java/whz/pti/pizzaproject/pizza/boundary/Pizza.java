package whz.pti.pizzaproject.pizza.boundary;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal priceLarge;

    private BigDecimal priceMedium;

    private BigDecimal priceSmall;

}
