package model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.Conn;

public abstract class DAO<Entity> {
	
	static final Connection CONN = Conn.getconnection();
	
	protected List<Entity> list = new ArrayList<>();

	public void add(Entity entity) {
		list.add(entity);
	}

	public void remove(Entity entity) {
		list.remove(entity);
	}

	public List<Entity> getList() {
		return list;
	}

	abstract public void update(Entity entity);

	abstract public Entity find(Serializable id);

	abstract public List<Entity> findBy(Serializable by);

	abstract public List<Entity> getAll() throws SQLException;

}
