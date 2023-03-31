package com.jdbc.myjdbc.services;

import com.jdbc.myjdbc.model.Purchase;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Transactional
@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public void storePurchase(Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    public List<Purchase> findAllPurchases() {
        return purchaseRepository.findAllPurchases();
    }

    public List<Purchase> storeAndFind(Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
        return purchaseRepository.findAllPurchases();
    }

    public void store(Purchase purchase) {
        purchaseRepository.storePurchase(purchase);
    }

    public List<Purchase> find(Purchase purchase) {
        return purchaseRepository.findAllPurchases();
    }
}
