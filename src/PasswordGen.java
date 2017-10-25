import org.apache.commons.lang3.RandomStringUtils;

public class PasswordGen {

	public static void main(String[] args) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String password = "";
		password = RandomStringUtils.random(15, characters);
		do {
			password = RandomStringUtils.random(15, characters);
		} while (!(password.length() >= 8 && !password.matches("[A-Za-z0-9 ]*") && !password.matches("[^A-Za-z0-9]")));
		System.out.println(password);
	}

}
