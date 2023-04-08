package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService{
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		List<SimpleGrantedAuthority> roles = null;
		Customer c = customerRepository.findByUsername(username);
		if (c != null) {
			roles = Arrays.asList(new SimpleGrantedAuthority(c.getRole()));
			return new User(c.getUsername(),c.getPassword(), roles);
		}
		throw new UsernameNotFoundException("User not Found With Username " + username);
	}
	
	public Customer registerCustomer(Customer customer) throws Exception {
		Customer c1= customerRepository.findByEmail(customer.getEmail());
		Customer c2 = customerRepository.findByUsername(customer.getUsername());
		if(c1!=null && c2!=null) {
			throw new Exception("User already Exist with "+customer.getEmail());
		}else {
			customer.setPassword(bcryptEncoder.encode(customer.getPassword()));
			return customerRepository.save(customer);
		}
	
	}
	

}
