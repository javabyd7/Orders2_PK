package pl.sda.jdbc.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.sda.jdbc.config.HibernateUtils;
import pl.sda.jdbc.entity.Order;

import java.util.List;

public class OrdersDAO {
    public Order ordersService (Order orders){
        Session session = HibernateUtils.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(orders);
        transaction.commit();
        return orders;
    }

    public void closeSession(){
        HibernateUtils.closeSession();
        System.out.println("Session close");
    }


    public List<Order> showAll(){
        Session session = HibernateUtils.getSession();
        List<Order> orders = session.createQuery("select a from Order a", Order.class).getResultList();
        return orders;
    }
}
