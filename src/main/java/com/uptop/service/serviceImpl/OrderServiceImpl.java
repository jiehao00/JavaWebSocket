package com.uptop.service.serviceImpl;

import com.uptop.dao.OrderDao;
import com.uptop.entity.Order;
import com.uptop.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;


    @Override
    public int insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }

    @Override
    public Order findOrder(Integer id) {
        return orderDao.findOrder(id);
    }

    @Override
    public int updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }
}
