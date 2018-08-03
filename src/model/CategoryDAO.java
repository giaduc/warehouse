/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends DAO<Category> {

	private static final String SELECT_ALL = "SELECT * FROM CATEGORY";

	@Override
	public List<Category> getAll() throws SQLException {
		List<Category> categories = new ArrayList<>();
		try {
			Statement s = CONN.createStatement();

			ResultSet r = s.executeQuery(SELECT_ALL);

			while (r.next()) {
				Category c = new Category(r.getInt(1), r.getString(2));
				categories.add(c);
			}

			r.close();
			s.close();
		} catch (SQLException e) {
			System.out.println("Can't get data in CATEGORY.");
		}
		return categories;
	}

	public Category find(List<Category> categories, String name) {
		for (Category c : categories) {
			if (name.trim().equals(c.getName().trim())) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
