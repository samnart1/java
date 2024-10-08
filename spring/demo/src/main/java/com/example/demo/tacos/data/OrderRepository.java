package com.example.demo.tacos.data;

import com.example.demo.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    

}
