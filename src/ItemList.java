import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class ItemList {
	
	private double fileVersion, webVersion;
	private String listName;

	private JPanel contentPane;
	
	private JTextArea searchField;
	private JTextArea itemIdField;
	private JTextArea itemNameField;
	
	private int[] itemId = new int[30000];
	private String[] itemName = new String[30000];
	
	public ItemList() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			loadComponents();
			loadData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loadComponents() throws HeadlessException, NumberFormatException, IOException {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    
	    JFrame frame = new JFrame(Constants.NAME+" "+Constants.BUILD);
	    frame.setResizable(false);
	    frame.setFont(new Font("SansSerif", 0, 12));
	    frame.setDefaultCloseOperation(2);
	    frame.getContentPane().setLayout(new BorderLayout());
		frame.setBounds(100, 100, 275, 541);
	    
	    this.itemNameField = new JTextArea();
	    this.itemNameField.setEditable(false);
	    this.itemIdField = new JTextArea();
	    this.itemIdField.setEditable(false);
	    
	    JPanel panel = new JPanel(new FlowLayout());
	    panel.add(this.itemNameField);
	    panel.add(this.itemIdField);
	    
	    JScrollPane scrollPane = new JScrollPane(panel, 22, 31);
	    scrollPane.setPreferredSize(new Dimension(408, 503));
	    
		int i = 0;
		String str = "\n";
		for (int j = 0; (j < this.itemName.length) && (this.itemName[j] != null); j++) {
		if (i != 0) {
			this.itemNameField.append(str + this.itemName[j]);
			this.itemIdField.append(str + this.itemId[j]);
		} else {
			i = 1;
			this.itemNameField.append(this.itemName[j]);
	        this.itemIdField.append(this.itemId[j]+"");
		}
		}
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				search();
			}
		});
		btnNewButton.setBounds(183, 478, 130, 34);
	    
	    this.searchField = new JTextArea();
	    this.searchField.setLineWrap(false);
	    this.searchField.setRows(1);
	    this.searchField.setColumns(25);
	    searchField.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent keyevent) {
				if (keyevent.getKeyCode() == 10)
					search();
			}

			@Override
			public void keyReleased(KeyEvent keyevent) {
				if (keyevent.getKeyCode() == 10)
					searchField.setText(searchField.getText().replace("\n", ""));
			}

			@Override
			public void keyTyped(KeyEvent keyevent) {
			
			}
	    	
	    });
	    
	    JPanel panel2 = new JPanel(new FlowLayout());
	    panel2.add(this.searchField);
	    panel2.add(btnNewButton);
	    
	    frame.getContentPane().add(scrollPane, "East");
	    frame.getContentPane().add(panel2, "South");
	    
	    JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					checkUpdate();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	    panel2.add(btnUpdate);
	    
	    frame.pack();
	    frame.setVisible(true);
	    this.searchField.requestFocus();
	}
	
	public void loadData() throws IOException {
		Object object;
		BufferedReader reader;
		File path = new File(System.getProperty("user.home")+"/Echo_Cache");
		if (!path.exists()) {
			path.mkdir();
		}
		File file = new File(System.getProperty("user.home")+"/Echo_Cache/itemlist.txt");
		if (!file.exists()) {
			object = new URL("http://www.fathienblade.com/txt/itemlist.txt");
			reader = new BufferedReader(new InputStreamReader(((URL)object).openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			String liner;
			while ((liner = reader.readLine()) != null) {
				if (!liner.startsWith(" ") && !liner.equals("null"))
				writer.append(liner+"\n");
			}
			writer.close();
			setData(reader);
			JOptionPane.showMessageDialog(contentPane,"Please wait while it refreshes.", "Restart", JOptionPane.ERROR_MESSAGE);
			loadData();
		} else {
			object = file;
			reader = new BufferedReader(new FileReader((File)object));
			setData(reader);
		}
	}
	
	private void setData(BufferedReader reader) throws NumberFormatException, IOException {
		String line;
		String newLine = "\n";
		while ((line = reader.readLine()) != null) {
			if (line.startsWith("//V"))
				continue;
			String[] split = line.split(" - ");
			int i = Integer.parseInt(split[0]);
			itemId[i] = Integer.parseInt(split[0]);
			itemName[i] = split[1];
			if (i != 23027) {
				itemIdField.append(itemId[i] +newLine);
				itemNameField.append(itemName[i] +newLine);
			} else {
				itemIdField.append(itemId[i]+"");
				itemNameField.append(itemName[i]+"");
			}
		}
		reader.close();
	}
	
	private boolean checkUpdate() throws IOException {
		loadData();
		File file = new File(System.getProperty("user.home")+"/Echo_Cache/itemlist.txt");
		if (!file.exists()) {
			JOptionPane.showMessageDialog(contentPane,"Error: File not found! Try after restarting your itemlist.", "Error", JOptionPane.ERROR_MESSAGE);
			return true;
		}
		getUrlFile();
		getPathFile();
		if (getFileVersion() < getWebVersion()) {
			JOptionPane.showMessageDialog(contentPane,"Updating... Please wait!", "Updating...", JOptionPane.ERROR_MESSAGE);
			file.delete();
			loadData();
			return true;
		} else {
			JOptionPane.showMessageDialog(contentPane,"You currently have the latest version!", "Update", JOptionPane.ERROR_MESSAGE);
			return true;
		}
	}
	
	private void getPathFile() throws IOException {
		File file = new File(System.getProperty("user.home")+"/Echo_Cache/itemlist.txt");
		if (!file.exists())
			return;
		BufferedReader reader;
		String line;
		reader = new BufferedReader(new FileReader(file));
		while((line = reader.readLine()) != null) {
			if (line.startsWith("//V")) {
				line = line.replace("//Version = ", "");
				setFileVersion(Double.parseDouble(line));
			}
		}
	}
	
	private void getUrlFile() throws IOException {
		BufferedReader reader;
		String line;
		URL url = new URL("http://www.fathienblade.com/txt/itemlist.txt");
		reader = new BufferedReader(new InputStreamReader(url.openStream()));
		while((line = reader.readLine()) != null) {
			if (line.startsWith("//V")) {
				line = line.replace("//Version = ", "");
				setWebVersion(Double.parseDouble(line));
			}
		}
	}
	
	private void search() {
	    String line = searchField.getText();
	    itemIdField.setText("");
	    itemNameField.setText("");
	    int i = 0;
	    String str2 = "\n";
	    for (int j = 0; (j < itemName.length) && (itemName[j] != null); j++) {
	      if (!itemName[j].toLowerCase().contains(line.toLowerCase()))
	        continue;
	      if (i != 0) {
	    	  itemNameField.append(str2 + itemName[j]);
	    	  itemIdField.append(str2 + itemId[j]);
	      } else {
	        i = 1;
	        itemNameField.append(itemName[j]);
	        itemIdField.append(itemId[j]+"");
	      }
	    }

	    if (itemNameField.getText().equals(""))
	    	itemNameField.setText("No Results Found");
	  }

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public double getFileVersion() {
		return fileVersion;
	}

	public void setFileVersion(double fileVersion) {
		this.fileVersion = fileVersion;
	}

	public double getWebVersion() {
		return webVersion;
	}

	public void setWebVersion(double webVersion) {
		this.webVersion = webVersion;
	}

	public String getListName() throws NumberFormatException, IOException {
		File file = new File(System.getProperty("user.home")+"/Echo_Cache/itemlist.txt");
		BufferedReader reader;
		String line;
		if (!file.exists()) {
			URL url = new URL("http://www.fathienblade.com/txt/itemlist.txt");
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
		} else {
			reader = new BufferedReader(new FileReader(file));
		}
		while((line = reader.readLine()) != null) {
			if (line.startsWith("//V")) {
				line = line.replace("//Version = ", "").replace(".", "/").replace("<", "").replace(">", "");
				setListName("Matrix "+line+" ItemList");
			}
		}
		return listName;
	}
	
	public void setListName(String name) {
		this.listName = name;
	}

	public static void openURL(String url) {
		String osName = System.getProperty("os.name");
		try {
			if (osName.startsWith("Windows"))
					Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			else {
					String[] browsers = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "internet_explorer", "google_chrome" };
					String browser = null;
					for (int count = 0; count < browsers.length && browser == null; count++) 
						if (Runtime.getRuntime().exec(
								new String[] { "which", browsers[count] })
                                                .waitFor() == 0)
							browser = browsers[count];
					Runtime.getRuntime().exec(new String[] { browser, url });
			}
		} catch (Exception e) {
		}
	}
}
