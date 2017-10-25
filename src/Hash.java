import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Hash {

	public static void main(String[] args) {

		char[] password = "}}h9gUo4`gH|)8@".toCharArray();
		byte[] salt = "1".getBytes();

		Hash.hashPassword(password, salt, 3, 64);

	}

	public static String hashPassword(final char[] password, final byte[] salt, final int iterations,
			final int keyLength) {

		try {
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
			PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keyLength);
			SecretKey key = skf.generateSecret(spec);
			byte[] res = key.getEncoded();
			String str = "";
			for (int i = 0; i < res.length; i++) {
		
				str += res[i];
			}
			System.out.println(str);
			return str;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
