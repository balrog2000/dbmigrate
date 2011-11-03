package dbmigrate.executor;

import dbmigrate.model.db.DbConnector;
import dbmigrate.model.operation.IOperationDescriptor;

public class GeneralExecutor<T extends IOperationDescriptor> implements IExecutor<T> {

	private DbConnector connector;

	public DbConnector getConnector() {
		return connector;
	}

	public void setConnector(DbConnector connector) {
		this.connector = connector;
	}

	protected boolean execute(String s) {
		System.out.println(s);
		return true;
	}

	public void execute(T operation) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
