package com.uptop.service;

import com.uptop.entity.Order;

public interface OrderService {

    public int insertOrder(Order order);

    public Order findOrder(Integer id);

    public int updateOrder(Order order);
}
