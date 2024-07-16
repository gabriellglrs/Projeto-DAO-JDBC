package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
     public static void main(String[] args) {
          SellerDao sellerDao = DaoFactory.createSellerDao();
          System.out.println("=== teste 1: seller findByid ===");
          Seller seller = sellerDao.findById(3);
          System.out.println(seller);
     }
}
