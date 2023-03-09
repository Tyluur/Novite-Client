import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.Properties;

import javax.swing.JApplet;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class ClientLoader extends JApplet implements Serializable, ActionListener, ComponentListener {

	public static void main(String[] strings) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ClientLoader loader = new ClientLoader();
				loader.doFrame();
			}
		});
	}

	public static String getWebClientCachePath() {
		return new StringBuilder(System.getProperty("user.home")).append(File.separator).append(Constants.NAME + "_Cache").toString();
	}

	public static boolean newInterface(int id) {
		if (id > 1144)
			return true;
		switch (id) {
		case 320:
		case 751:
			return true;
		default:
			return false;
		}
	}

	@Override
	public void init() {
		setParams();
		startClient();
	}

	public void doFrame() {
		setParams();
		openFrame();
		startClient();
	}

	private void openFrame() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel(new org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		client_frame = new JFrame();
		client_frame.setTitle(Constants.TITLE);
		client_frame.setLayout(new BorderLayout());
		client_frame.addComponentListener(this);
		JPanel client_panel = new JPanel();
		client_panel.setLayout(new BorderLayout());
		client_panel.add(this);
		client_frame.setIconImage(Utils.getImage("./resources/icon.png"));
		client_panel.setPreferredSize(new Dimension(784, 544));
		client_frame.getContentPane().add(client_panel, "Center");
		client_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		client_frame.setJMenuBar(new ClientMenuBar());
		client_frame.setVisible(true);
		client_frame.pack();

		client_frame.setLocationRelativeTo(null);
	}

	private void startClient() {
		GameStub.provideLoaderApplet(this);
		Client c = new Client();
		c.init();
		c.start();
	}

	public void setParams() {
		properties = new Properties();
		properties.put("cabbase", "g.cab");
		properties.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
		properties.put("colourid", "0");
		properties.put("worldid", "1");
		properties.put("lobbyid", "1");
		properties.put("lobbyaddress", Constants.IP);
		properties.put("demoid", "0");
		properties.put("demoaddress", "");
		properties.put("modewhere", "0");
		properties.put("modewhat", "0");
		properties.put("lang", "0");
		properties.put("objecttag", "0");
		properties.put("js", "1");
		properties.put("game", "0");
		properties.put("affid", "0");
		properties.put("advert", "1");
		properties.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
		properties.put("country", "0");
		properties.put("haveie6", "0");
		properties.put("havefirefox", "1");
		properties.put("cookieprefix", "");
		properties.put("cookiehost", Constants.IP);
		properties.put("cachesubdirid", "0");
		properties.put("crashurl", "");
		properties.put("unsignedurl", "");
		properties.put("sitesettings_member", "1");
		properties.put("frombilling", "false");
		properties.put("sskey", "");
		properties.put("force64mb", "false");
		properties.put("worldflags", "8");
	}

	@Override
	public String getParameter(String paramString) {
		return (String) properties.get(paramString);
	}

	@Override
	public URL getDocumentBase() {
		return getCodeBase();
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + Constants.IP);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {

	}

	@Override
	public void componentMoved(ComponentEvent arg0) {

	}

	@Override
	public void componentResized(ComponentEvent arg0) {

	}

	@Override
	public void componentShown(ComponentEvent arg0) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String command = e.getActionCommand();
			if (command.equalsIgnoreCase("Exit")) {
				System.exit(1);
			} else {
				System.out.println(command);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Client theme information
	 */
	private JFrame client_frame;

	/**
	 * Client information
	 */
	public static boolean isRS = false;
	public static final boolean DISABLE_USELESS_PACKETS = false;
	public static int PORT_ID = 43594;
	private Properties properties;

	private static final long serialVersionUID = -3815183950296997504L;

}
