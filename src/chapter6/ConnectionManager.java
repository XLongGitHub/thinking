package chapter6;

class Connection {
	//singleton
	private Connection() {
	}
	public static Connection conn = new Connection();

	public static Connection makeConnection() {
		return conn;
	}
}

public class ConnectionManager {
	public static void main(String[] args) {
		Connection conn = null;
		for (int i = 0; i < 10; i++) {
			conn = Connection.makeConnection();
			if (conn == null) {
				System.out.println("is null");
			} else {
				System.out.println(conn);
			}
		}
	}
}
