package org.example.application;

import org.example.model.dao.DaoFactory;
import org.example.model.dao.SellerDao;
import org.example.model.entities.Seller;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}