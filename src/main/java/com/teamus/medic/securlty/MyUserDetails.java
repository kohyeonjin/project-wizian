package com.teamus.medic.securlty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.teamus.medic.command.UserVO;

public class MyUserDetails implements UserDetails{

	private UserVO userVO;

	public MyUserDetails(UserVO vo) {
		this.userVO = vo;
	}

	public String getRole() {

		return userVO.getUSER_ROLE();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		List<GrantedAuthority> list = new ArrayList<>();

		list.add(()->userVO.getUSER_ROLE());

		return list;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return userVO.getPASSWORD();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userVO.getUSERNAME();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}
