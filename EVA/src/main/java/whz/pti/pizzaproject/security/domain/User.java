package whz.pti.pizzaproject.security.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import whz.pti.pizzaproject.common.BaseEntity;
import whz.pti.pizzaproject.pizza.domain.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class User extends BaseEntity<Long> {

    @Column(name = "login_name", nullable = false, unique = true)
    private String loginName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Status status;

}
