package com.ftkj.conn;

import java.sql.Connection;
import java.sql.SQLException;

import com.ftkj.invoker.Resource;
import com.ftkj.invoker.ResourceType;

public class GameConnectionDAO extends BaseDAO {

	@Resource(value = ResourceType.DB_nba_game)
	public Database database;
	/**
	 * Method getConnection.
	 * @return Connection
	 * @throws SQLException 
	 */
	protected Connection getRealConnection(){
		return database.getConnection();
	}	

}
