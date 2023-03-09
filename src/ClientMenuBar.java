import java.awt.Desktop;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * @author Lazarus <lazarus.rs.king@gmail.com>
 * @since Jul 21, 2014
 */
@SuppressWarnings("serial")
public class ClientMenuBar extends JMenuBar implements ActionListener {

	public ClientMenuBar() {
		file = new JMenu("File");
		file.getPopupMenu().setLightWeightPopupEnabled(false);
		add(file);

		exit = new JMenuItem("Exit");
		file.add(exit);

		links = new JMenu("Links");
		links.getPopupMenu().setLightWeightPopupEnabled(false);
		add(links);

		forums = new JMenuItem("Community");
		vote = new JMenuItem("Vote");
		highscores = new JMenuItem("Highscores");
		advertise = new JMenuItem("Advertise");

		links.add(forums);
		links.add(vote);
		links.add(highscores);
		links.add(advertise);

		screenshot = new JButton("Screenshot");
		add(screenshot);

		setAction(exit, forums, vote, highscores, advertise, screenshot);
	}

	private void setAction(AbstractButton... button) {
		for (AbstractButton b : button) {
			b.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		switch (name.toLowerCase()) {
		case "exit":
			System.exit(0);
			break;
		case "community":
			openURL("http://www.novite666.com/forum/");
			break;
		case "vote":
			openURL("http://novite666.com/forum/index.php?pageid=vote");
			break;
		case "highscores":
			openURL("http://novite666.com/app/highscores/#");
			break;
		case "advertise":
			openURL("http://novite666.com/forum/showthread.php?1-Advertise-amp-Get-Rewards!&p=1#post1");
			break;
		case "screenshot":
			File image = takeScreenshot();
			if (image != null) {
				int choice = JOptionPane.showOptionDialog(null, "View image?", "Screenshot Saved", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" }, "No");
				if (choice == 0) {
					try {
						Desktop.getDesktop().open(image.getParentFile());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
			break;
		default:
			System.out.println(name);
			break;
		}
	}

	private void openURL(String url) {
		try {
			Desktop.getDesktop().browse(new URI(url));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Takes a screenshot and saves it in the novite user home directory. The
	 * screenshot {@code File} {@code Object} will be returned on successful
	 * saving.
	 * 
	 * @return
	 */
	public File takeScreenshot() {
		try {
			Window window = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusedWindow();
			Point point = window.getLocationOnScreen();
			int x = (int) point.getX();
			int y = (int) point.getY();
			int w = window.getWidth();
			int h = window.getHeight();
			Robot robot = new Robot(window.getGraphicsConfiguration().getDevice());
			Rectangle captureSize = new Rectangle(x, y, w, h);
			java.awt.image.BufferedImage bufferedimage = robot.createScreenCapture(captureSize);

			StringBuilder bldr = new StringBuilder();
			bldr.append(System.getProperty("user.home") + "/.novite_data/screenshots/");
			File directory = new File(bldr.toString());
			if (!directory.exists())
				directory.mkdirs();
			int files = directory.list().length;

			File file = new File(bldr.append("Screenshot " + (files + 1) + ".png").toString());
			ImageIO.write(bufferedimage, "png", file);
			return file;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private final JMenu file, links;
	private final JMenuItem exit, forums, vote, highscores, advertise;
	private final JButton screenshot;

}
