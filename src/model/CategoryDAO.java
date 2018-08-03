/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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

	@Override
	public void update(Category entity) {
		// TODO update Category
	}

	@Override
	public Category find(Serializable id) {
		// TODO find Category
		return null;
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
	public List<Category> findBy(Serializable by) {
		// TODO findBy Category
		return null;
	}

	public static void main(String[] args) throws SQLException {
		// Run test
		CategoryDAO categoryDAO = new CategoryDAO();
		for (Category c : categoryDAO.getAll()) {
			System.out.println(c);
		}
	}
}
