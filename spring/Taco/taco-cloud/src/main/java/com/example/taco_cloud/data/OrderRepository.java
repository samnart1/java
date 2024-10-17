package com.example.taco_cloud.data;

import org.springframework.data.repository.CrudRepository;

import com.example.taco_cloud.TacoOrder;


public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    // List<TacoOrder> findByDeliveryZip(String deliveryZip);
    // List<TacoOrder> readOrderByDeliveryZipAndPlaceAtBetween(String deliveryZip, Date startDate, Date endDate);
    // List<TacoOrder> findByDeliveryNameAndDeliveryCityAllIgnoreCase(String deliveryName, String deliveryCity);
    // List<TacoOrder> findByDeliveryCityOrderByDeliveryName(String city);

    // @Query("Order o where o.deliveryCity='Seattle'")
    // List<TacoOrder> readOrdersDeliveredInSeattle();
    
}
