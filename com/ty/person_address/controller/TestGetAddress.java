package com.ty.person_address.controller;

import java.util.List;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class TestGetAddress {
public static void main(String[] args) {
	Address address=new Address();
	AddressDao addressDao=new AddressDao();
	
	List list=addressDao.getAddress(1);
	
	System.out.println(list);
}
}
