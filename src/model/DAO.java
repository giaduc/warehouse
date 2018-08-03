package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import util.Conn;

public abstract class DAO<Entity> {
	
	static final Connection CONN = Conn.getconnection();
	
	abstract public Entity findByName(String name);

	abstract public List<Entity> getAll() throws SQLException;

}
