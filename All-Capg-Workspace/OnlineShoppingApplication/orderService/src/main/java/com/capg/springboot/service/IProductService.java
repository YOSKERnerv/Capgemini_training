package com.capg.springboot.service;

import java.util.List;
import java.util.Optional;

import com.capg.springboot.dto.Productdto;
import com.capg.springboot.entity.Category;
import com.capg.springboot.entity.Product;

/*/*****************************************************************************
 * IProduct Service Class 
 *
 * Created By: 
 * Date:  
 *******************************************************************************/

public interface IProductService {
  public List<Product> viewAllProducts();
  public Product addProduct(Productdto productdto);
  
  public Product updateProduct(Productdto productdto);
  public Product viewProduct(String id);
  public List<Product> findAllProductByCategory(String cname);
  public Product removeProduct(Product product);

 
}
