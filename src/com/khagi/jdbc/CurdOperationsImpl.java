package com.khagi.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.khagi.jdbc.utility.ConnectionUtility;

public class CurdOperationsImpl implements CurdOperations {

	@Override
	public void insertRecord() {
		Connection connection = ConnectionUtility.getConnection();
		
		try {
//			Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement("values(?,?,?)");			
			int status = preparedStatement.executeUpdate();
			
			if (status > 0) {
				System.out.println("");
			} else {
				System.out.println("");
			}
		} catch (SQLException e) {
			System.out.println();
		}
		
	}

	@Override
	public void updateRecord() {

	}

	@Override
	public void deleteRecord() {

	}

	@Override
	public void retrieveAllRecords() {
		Connection connection = ConnectionUtility.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("");
			ResultSet resultSet = preparedStatement.executeQuery("");
			while(resultSet != null && resultSet.next()) {
				int emplyeeId = resultSet.getInt(1);
				String employeeName = resultSet.getString(2);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
