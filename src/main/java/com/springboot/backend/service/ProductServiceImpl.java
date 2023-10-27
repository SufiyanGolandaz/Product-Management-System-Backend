package com.springboot.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.backend.model.Product;
import com.springboot.backend.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		// TODO Auto-generated method stub
		Product product=productRepository.findById(id).get();
		
		if(product!=null) {
			productRepository.delete(product);
			return "Product deleted successfully";
		}
		
		return "Something wrong on server";
		
	}

	@Override
	public Product editProduct(Product product, Integer id) {
		// TODO Auto-generated method stub
		Product oldProduct=productRepository.findById(id).get();
		oldProduct.setProductName(product.getProductName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setPrice(product.getPrice());
		oldProduct.setStatus(product.getStatus());
		
		return productRepository.save(oldProduct);
	}

}
