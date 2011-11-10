package dbmigrate.executor;

import dbmigrate.model.operation.DropTableOperationDescriptor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableExecutor extends GeneralExecutor<DropTableOperationDescriptor> {
	public DropTableExecutor(Connection connection) {
		this.setConnection(connection);
	}
	
	public String createSql(DropTableOperationDescriptor operation) {
		return "DROP TABLE \"" + operation.getTable().getName() + "\";";
	}
	
	@Override
	public void execute(DropTableOperationDescriptor operation) {
		try {
			Statement stmt = getConnection().createStatement();
			stmt.executeUpdate(createSql(operation));
		} catch (SQLException e) {
			// TODO Throw project-specific exception.
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
