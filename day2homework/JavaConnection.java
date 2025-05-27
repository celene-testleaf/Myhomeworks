package week3.day2homework;

public class JavaConnection extends MySqlConnection {
	

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		super.connect();
		System.out.println("The system is connected");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		super.disconnect();
		System.out.println("The system is disconnected");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		super.executeUpdate();
		System.out.println("The system is updated");
	}

	@Override
	public void executeQuery() {
	System.out.println("The query is executed");
		
	}

	public static void main(String[] args) {
		JavaConnection J = new JavaConnection();
		J.connect();
		J.executeUpdate();
		J.executeQuery();
		J.disconnect();
		

	}

}
