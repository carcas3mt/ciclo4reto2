package Reto2_Web.repository;

import Reto2_Web.infertace.InterfaceOrder;
import Reto2_Web.model.Order;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author JhonA
 */
@Repository
public class OrderRepository {
    @Autowired
    private InterfaceOrder orderCrudRepository;
    
    public List<Order> getAll(){
        return orderCrudRepository.findAll();
    }

    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }

    public Order create(Order order){
        return orderCrudRepository.save(order);
    }

    public void update(Order order){
        orderCrudRepository.save(order);
    }

    public void delete(Order order){
        orderCrudRepository.delete(order);
    }

    public List<Order> getOrderByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);    
    }
    
    public List<Order> getBySalesManId(Integer id){
        return orderCrudRepository.findBySalesManId(id);
    }
    
    public List<Order> getBySalesMainIdAndStatus(Integer id, String status){
        return orderCrudRepository.findBySalesManIdAndStatus(id, status);
    }
    
    public List<Order> getByRegisterDayAndSalesManId(String registerDay, Integer id){
        try {
            return orderCrudRepository.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay), id);
        } catch (ParseException e) {
            //Logger.getLogger(OrderRepository.class.getName()).log(Level.SEVERE, null, ex);
            e.printStackTrace();
            return null;
        }
    }
}
