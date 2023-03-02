package com.jdbc.myjdbc;

import com.jdbc.myjdbc.model.Purchase;
import com.jdbc.myjdbc.services.PurchaseRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class MyjdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MyjdbcApplication.class, args);
        PurchaseRepository purchaseRepository = context.getBean(PurchaseRepository.class);
        purchaseRepository.storePurchase(new Purchase("table", new BigDecimal(100)));
        purchaseRepository.storePurchase(new Purchase("table2", new BigDecimal(222)));
        System.out.println(purchaseRepository.findAllPurchases());

    }

}
