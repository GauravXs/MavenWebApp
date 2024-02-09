package webapp.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("Gaurav") && password.equals("Singh");
	}

}
