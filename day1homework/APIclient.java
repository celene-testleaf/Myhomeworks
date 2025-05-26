package week3.day1homework;

public class APIclient {
	private void sendrequest(String endpoint) {
		System.out.println(endpoint);
	}
	private void sendrequest(String endpoint, String requestbody, boolean requestStatus) {
		System.out.println(endpoint+" "+requestbody);
	
	if(requestStatus) {
		System.out.println("success");
	}
	else {
		System.out.println("not successful");
	}
	}

	public static void main(String[] args) {
		APIclient AC = new APIclient();
		AC.sendrequest("endpoint");
		AC.sendrequest("newendpoint", "requestbody", true);
		

	}

}
