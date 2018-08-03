package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class WarehouseDAO extends DAO<Warehouse> {

	private static final String SELECT_ALL = "SELECT * FROM WAREHOUSE";

	@Override
	public List<Warehouse> getAll() throws SQLException {
		List<Warehouse> warehouses = new ArrayList<>();
		try {
			Statement s = CONN.createStatement();

			ResultSet r = s.executeQuery(SELECT_ALL);

			while (r.next()) {
				int id = Integer.parseInt(r.getString(1));

				Warehouse w = new Warehouse(id, r.getString(2));
				warehouses.add(w);
			}

			r.close();
			s.close();
		} catch (SQLException e) {
			System.out.println("Can't get data in WAREHOUSE");
		}
		return warehouses;
	}

	public Warehouse find(List<Warehouse> warehouses, String name) {
		for (Warehouse w : warehouses) {
			if (name.trim().equals(w.getName().trim().trim())) {
				return w;
			}
		}
		return null;
	}

	@Override
	public Warehouse findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
