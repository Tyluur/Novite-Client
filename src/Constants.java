import java.math.BigInteger;

/**
 * @author Tyluur <itstyluur@gmail.com>
 * @since Mar 19, 2014
 */
public class Constants {

	/**
	 * The name
	 */
	public static final String NAME = "Novite";

	/**
	 * The catchphrase/slogan
	 */
	public static final String CATCH_PHRASE = "We Know What You Love";

	/**
	 * The version of the client - The first number (e.g 4 in 4.5) is the one
	 * sent to the client for version checks
	 */
	public static final Double VERSION = 2.0;

	/**
	 * If we should connect to the server or not
	 */
	public static boolean connectingToServer = isJarFile();
	
	/**
	 * The title that will appear on the frame
	 */
	public static final String TITLE = "" + (connectingToServer ? "" : "[DEBUG] ") + "" + NAME + " v" + VERSION + " - " + CATCH_PHRASE;

	/**
	 * The revision of the client
	 */
	public static final int REVISION = 666;
	/**
	 * Build information for the client
	 */
	public static final String BUILD = "Build: " + REVISION;

	/**
	 * The html color code for the developers console
	 */
	public static final int DEV_CONSOLE_COLOR = 0xFF0000;

	/**
	 * The directory screenshots are saved to
	 */
	public static final String SCREENSHOTS_DIRECTORY = System.getProperty("user.home") + "/" + NAME + "/Screenshots";

	/**
	 * The IP to connect to
	 */
	public static String IP = connectingToServer ? "server.novite666.com" : "127.0.0.1";

	/**
	 * If we are running from a jar file
	 * 
	 * @return
	 */
	public static boolean isJarFile() {
		String className = ClientLoader.class.getName().replace('.', '/');
		String classJar = ClientLoader.class.getResource("/" + className + ".class").toString();
		if (classJar.startsWith("jar:")) {
			return true;
		}
		return false;
	}

	public static void adjustZoom(int notches) {
		while (notches > 0) {
			if (ZOOM_MODIFIER < 6)
				ZOOM_MODIFIER++;
			notches--;
		}
		while (notches < 0) {
			if (ZOOM_MODIFIER > 0)
				ZOOM_MODIFIER--;
			notches++;
		}
	}

	/**
	 * Gets the integer version of the current build
	 * 
	 * @return
	 */
	public static int getIntegerVersion() {
		String text = "" + String.valueOf(VERSION);
		String[] split = text.split("\\.");
		return Integer.parseInt(split[0]);
	}

	public static final String FORUMS = "www.novite666.com/community";

	public static final String QUIT_URL = "http://google.com";

	public static final BigInteger RSA_MODULUS = new BigInteger("101742773934718324340776654470909825353209547035387832391455805597629662471165691115678474051783537744486606982730204569547288525895800381296651800546738194301853480909269710416950789793318391141479236233585752002621260634214443509400257761714587239713035377860371443291773673266440535957413236472873724499387");

	public static final BigInteger RSA_EXPONENT = new BigInteger("65537");

	public static int ZOOM_MODIFIER = 3;

	public static final String[][] REPLACED_LOGINS = new String[][] { { "Invalid login or password.<br><br>For accounts created after the 24th of November 2010, please use your email address to login. Otherwise please login with your username.", "Invalid password specified for this account.<br><br>You must log in with the forum <col=23CB1D>username</col> & <col=23CB1D>password</col> you registered with." }, { "Your session has expired. Please click 'Back' in your browser to renew it.", "Database connection error! Please retry in a few minutes..." }, { "Invalid loginserver requested. Please try using a different world.", "Your account has been nulled.<br>Post this bug on the forums to join the game." }, { "This computer's address has been blocked, as it was used to break our rules.", "You have not registered with this account on the forums yet!<br> Visit <col=FF6000>www.novite666.com</col> to register." }, { "Service unavailable.", "Username must be between 3-12<br>characters be alphanumerical." } };

}
