package com.oauth.config;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class CustomAuth2user implements OAuth2User{
	private OAuth2User auth2User;

	@Override
	public Map<String, Object> getAttributes() {
		// TODO Auto-generated method stub
		return auth2User.getAttributes();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return auth2User.getAuthorities();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return auth2User.getAttribute("name");
	}
	public String getemail() {
		return auth2User.getAttribute("email");
	}

}
