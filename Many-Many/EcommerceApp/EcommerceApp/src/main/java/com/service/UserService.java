package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.model.User;
import com.repository.ProductRepository;
import com.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProductRepository productRepository;
	public User AddUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public User AddtoWishlist(int uid, int pid) throws Exception {
		User user = userRepository.findById(uid).get();
		if(user != null) {
			Product product = productRepository.findById(pid).get();
			if(product != null) {
				user.addtoWishlist(product);
				userRepository.save(user);
			}else {
				throw new Exception("Product Not Available");
			}
		}else {
			throw new Exception("User Not Available");
		}
		return user;
		 
	}

	public List<User> getAllusers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User RemoveProductFromWishList(int uid, int pid) throws Exception {
		User user = userRepository.findById(uid).get();
		if(user != null) {
			Product product = productRepository.findById(pid).get();
			if(product != null) {
				if(user.getWishlist().contains(product)) {
					user.getWishlist().remove(product);
					userRepository.save(user);
				}else {
					throw new Exception("Product Not Available in "+user.getUsername()+" wishlist");
				}
			}else {
				throw new Exception("Product Not Available");
			}
			
			
		}else {
			throw new Exception("User Not Available");
		}
		return user;
	}
	
	

}
