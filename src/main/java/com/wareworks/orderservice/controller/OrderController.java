package com.wareworks.orderservice.controller;

import com.wareworks.orderservice.entity.Order;
import com.wareworks.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<Order> getAllOrders() { 
      return orderRepository.findAll();
}
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
       return orderRepository.save(order);
    }
} 

