package com.uptop.dao;


import com.uptop.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao {

    public int insertOrder(Order order);

    public Order findOrder(Integer id);

    public int updateOrder(Order order);
}
