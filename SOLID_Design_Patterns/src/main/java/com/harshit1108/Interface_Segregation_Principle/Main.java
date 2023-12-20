package com.harshit1108.Interface_Segregation_Principle;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Harshit", LocalDateTime.now());
        user1.setId(1L);
        User user2 = new User("Shivangi", LocalDateTime.now());
        user2.setId(2L);

        Product product1 = new Product(LocalDateTime.now(), BigDecimal.valueOf(19000));
        product1.setId(101L);
        Product product2 = new Product(LocalDateTime.now(), BigDecimal.valueOf(14000));
        product2.setId(101L);

        //Not used interface reference because with that we cannot access child methods.
        //With parent reference we can access to parents methods only.
        UserPersistenceService r = new UserPersistenceService();
        r.save(user1);
        r.save(user2);

        ProductPersistence p = new ProductPersistence();
        p.save(product1);
        p.save(product2);

       System.out.println( r.findByName("Shivangi"));
       System.out.println(p.calculatePrice(product1.getId()));



    }
}
