package pl.sda.jdbc;

import pl.sda.jdbc.DAO.OrdersDAO;
import pl.sda.jdbc.entity.Order;
import pl.sda.jdbc.entity.User;

public class App {
    public static void main(String[] args) {
        User user = new User("Piotr", "Kot", "Grunwaldzka 81");
        String[] products = {"item1", "item2", "item3"};
        String[] products2 = {"item4", "item5", "item6"};
        Order order = new Order(user , products, "27-05-219");
        Order order2 = new Order(user , products2, "15-07-219");
        OrdersDAO ordersDAO = new OrdersDAO();
        ordersDAO.ordersService(order);
        ordersDAO.ordersService(order2);
        ordersDAO.closeSession();

    }
}