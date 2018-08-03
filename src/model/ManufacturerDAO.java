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

public class ManufacturerDAO extends DAO<Manufacturer> {

	private static final String SELECT_ALL = "SELECT * FROM MANUFACTURER";

	@Override
	public List<Manufacturer> getAll() throws SQLException {
		List<Manufacturer> manufacturers = new ArrayList<>();
		try {
			Statement s = CONN.createStatement();

			ResultSet r = s.executeQuery(SELECT_ALL);

			while (r.next()) {
				Manufacturer m = new Manufacturer(r.getInt(1), r.getString(2));
				System.out.println(m.getId());
				manufacturers.add(m);
			}

			r.close();
			s.close();
		} catch (SQLException e) {
			System.out.println("Can't get data in MANUFACTURER.");
		}
		return manufacturers;
	}

	@Override
	public void update(Manufacturer entity) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public Manufacturer find(Serializable id) {

		return null;
	}

	public Manufacturer find(List<Manufacturer> manufacturers, String id) {
		for (Manufacturer m : manufacturers) {
			if (id.trim().equals(m.getName().trim())) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Manufacturer> findBy(Serializable by) {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

}
