package com.example.demo.tacos.data;

import com.example.demo.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    

}
