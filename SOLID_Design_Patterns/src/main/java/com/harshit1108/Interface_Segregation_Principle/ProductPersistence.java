package com.harshit1108.Interface_Segregation_Principle;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class ProductPersistence implements PersistenceService<Product>{

    private static final Map<Long, Product> productList =  new HashMap<>();
    @Override
    public void save(Product entity) {
        synchronized(productList){
            productList.put(entity.getId(), entity);
            entity.setId((long) Math.random());
        }
    }
    @Override
    public void delete(Product entity) {
        synchronized(productList){
            productList.remove(entity.getId());
        }
    }
    @Override
    public Product findById(Long id) {
        synchronized(productList) {
            return productList.get(id);
        }
    }

    public BigDecimal calculatePrice(Long id){
        synchronized(productList){
            return productList.values().stream().filter(p-> Objects.equals(p.getId(), id))
                    .map(p->p.getTotalPrice().subtract(BigDecimal.valueOf(50))).findFirst().get();
            }
        }
}
