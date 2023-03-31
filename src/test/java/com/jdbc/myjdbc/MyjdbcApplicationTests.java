package com.jdbc.myjdbc;

import com.jdbc.myjdbc.model.Purchase;
import com.jdbc.myjdbc.services.PurchaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class MyjdbcApplicationTests {

	@Autowired
	private PurchaseService purchaseService;

	@Test
	void contextLoads() {
		assert true;
	}

	@Test
	void findAllPurchasesTest(){
		Purchase purchase = new Purchase();
		purchase.setPrice(new BigDecimal(12345));
		purchase.setProduct("Ball");

		try {
			System.out.println("StoreStore with exception");
			purchaseService.store(purchase);
		} catch (RuntimeException e){
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Find last or nothing");
			List<Purchase> purchases = purchaseService.find(purchase);
			purchases.forEach(System.out::println);
		} catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
	}

}
