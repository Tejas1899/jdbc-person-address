package com.ty.person_address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person_address.dto.Address;
import com.ty.person_address.util.ConnectionObject;

public class AddressDao {
	public int saveAddress(Address address, int id) {
		Connection connection = ConnectionObject.getConnection();
		String query = "Insert into address values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, address.getAid());
			preparedStatement.setString(2, address.getStreet());
			preparedStatement.setInt(3, address.getDoor_num());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setString(5, address.getPin());
			preparedStatement.setInt(6, id);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}
	
	public List<Address> getAddress(int pid)
	{
		List list=new ArrayList<Address>();
		Connection connection=ConnectionObject.getConnection();
		String query="Select * from address where pid=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, pid);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				Address address=new Address();
				address.setAid(resultSet.getInt(1));
				address.setStreet(resultSet.getString(2));
				address.setDoor_num(resultSet.getInt(3));
				address.setCity(resultSet.getString(4));
				address.setPin(resultSet.getString(5));
				address.setPid(resultSet.getInt(6));
				list.add(address);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
