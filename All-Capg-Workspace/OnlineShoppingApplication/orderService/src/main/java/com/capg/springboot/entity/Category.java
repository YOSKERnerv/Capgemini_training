package com.capg.springboot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
 @Id
 private String catId;
 private String categoryName;
 @OneToOne(mappedBy = "category",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
 private  Product product;
public String getCatId() {
	return catId;
}
public void setCatId(String catId) {
	this.catId = catId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}

}
