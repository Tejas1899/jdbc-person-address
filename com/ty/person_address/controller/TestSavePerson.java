package com.ty.person_address.controller;

import com.ty.person_address.dao.PersonDao;
import com.ty.person_address.dto.Person;

public class TestSavePerson {
public static void main(String[] args) {
	Person person=new Person();
	person.setPid(4);
	person.setName("john");
	person.setEmail("john@mail.com");
	person.setPhone("966846464");
	PersonDao personDao=new PersonDao();
	personDao.savePerson(person);
	if(person!=null)
	{
		System.out.println("Data stored");
	}
	else
	{
		System.out.println("Data not stored");
	}
}
}
