import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Utils {

	public static ArrayList<String> getPageDetails(String URL) {
		try {
			ArrayList<String> pageSource = new ArrayList<String>();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(URL).openStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				pageSource.add(line);
			}
			reader.close();
			return pageSource;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getPageSource(String URL) {
		try {
			URL website = new URL(URL);
			HttpURLConnection connection = (HttpURLConnection) website.openConnection();
			connection.setRequestMethod("GET");
			InputStream input = connection.getInputStream();
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int bytes = 0;
			while ((bytes = input.read(buffer)) != -1) {
				output.write(buffer, 0, bytes);
			}
			input.close();
			output.close();
			return new StringBuilder().append(output).toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Image getImage(String path) {
		if (Constants.isJarFile()) {
			path = path.replace("./resources/", "");
			URL url = ClientLoader.class.getClassLoader().getResource(path);
			return new ImageIcon(url).getImage();
		} else {
			return Toolkit.getDefaultToolkit().getImage(path);
		}
	}

	public static Image getImage(String path, Dimension size) {
		if (Constants.isJarFile()) {
			path = path.replace("./", "");
			URL url = ClientLoader.class.getClassLoader().getResource(path);
			return new ImageIcon(url).getImage().getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);
		} else {
			return Toolkit.getDefaultToolkit().getImage(path).getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);
		}
	}

}
