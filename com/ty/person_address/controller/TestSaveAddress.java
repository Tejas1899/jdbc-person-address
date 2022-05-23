package com.ty.person_address.controller;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;
import java.util.Scanner;

public class TestSaveAddress {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the id ");
	int id=sc.nextInt();
	Address address=new Address();
	address.setAid(4);
	address.setStreet("Nagarbhavi Street");
	address.setDoor_num(101);
	address.setCity("Kolar");
	address.setPin("560141");
	address.setPid(id);
	AddressDao addressDao=new AddressDao();
	int result=addressDao.saveAddress(address,id);
	if(result>0)
	{
		System.out.println("data saved");
	}
	else
	{
		System.out.println("Data not saved");
	}

}
}
