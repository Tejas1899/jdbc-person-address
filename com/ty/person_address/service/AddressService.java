package com.ty.person_address.service;

import com.ty.person_address.dao.AddressDao;
import com.ty.person_address.dto.Address;

public class AddressService {
AddressDao addressDao=new AddressDao();
public int saveAddress(Address address)
{
	return 1;
}
}
