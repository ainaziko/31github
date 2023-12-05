package whz.pti.pizzaproject.pizza.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedRepository extends JpaRepository<Ordered, Long> {
}
