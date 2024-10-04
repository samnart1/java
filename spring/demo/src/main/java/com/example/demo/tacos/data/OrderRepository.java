package com.example.demo.tacos.data;

import com.example.demo.tacos.TacoOrder;
import java.util.Optional;

public interface OrderRepository {
    
    TacoOrder save(TacoOrder order);

}
