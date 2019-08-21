package pl.sda.jdbc.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "products")
    private String[] products;

    @Column(name = "order_date")
    private String orderDate;

    public Order() {
    }

    public Order(User user, String[] products, String orderDate) {
        this.user = user;
        this.products = products;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", user=" + user +
                ", products=" + Arrays.toString(products) +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
