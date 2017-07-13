package assignment4;

public class DbConnection {

	private  Connection connection=null;

	private DbConnection(){
		
	}
	public  void setDbConnection(Connection connection) {
		this.connection = connection;
	}

	public Connection getDbConnection() {
		System.out.println("inside get");
		return connection;
	}
}
