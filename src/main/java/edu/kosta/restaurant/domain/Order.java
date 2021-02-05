package edu.kosta.restaurant.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "cook_id", nullable = false, foreignKey = @ForeignKey(name="FK_COOK_TB_ORDER"))
    private Cook cooks;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "tablet_id", nullable = false, foreignKey = @ForeignKey(name="FK_TABLET_TB_ORDER"))
    private Tablet tablets;

    @Column(name = "order_datetime", nullable = false)
    private LocalDateTime orderDatetime;

    @Column(name = "state", nullable = false)
    @Enumerated(EnumType.STRING)
    private State state; // 주문 상태

    @OneToMany(mappedBy = "orders")
    private List<OrderDishes> orderDishes;

    public enum State {
        PLACED,
        COOKING,
        READY,
        DELIVERED;
    }
}