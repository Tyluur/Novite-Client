import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Tyluur
 */
@SuppressWarnings("serial")
public class ErrorMessage extends javax.swing.JFrame {

	/**
	 * Creates new form ErrorMessage
	 */
	public ErrorMessage(String message) {
		initComponents(message);
	}

	private void initComponents(String message) {

		copyButton = new javax.swing.JButton();
		messageScroll = new javax.swing.JScrollPane();
		errorMessage = new javax.swing.JTextArea(message);
		informationLabel = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Oops, an error occurred!");

		copyButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StringSelection string = new StringSelection(errorMessage.getText());
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
			}
		});
		
		copyButton.setText("Copy to Clipboard");

		errorMessage.setEditable(false);
		errorMessage.setColumns(20);
		errorMessage.setLineWrap(true);
		errorMessage.setRows(5);
		messageScroll.setViewportView(errorMessage);

		informationLabel.setText("Oh no, an error has occurred! Please copy and paste this error message to the bug reports section of our forum!");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(messageScroll).addComponent(copyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addContainerGap()).addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(informationLabel).addContainerGap(74, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(20, 20, 20).addComponent(informationLabel).addGap(18, 18, 18).addComponent(messageScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(copyButton).addContainerGap()));

		pack();
		
		setVisible(true);
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		new ErrorMessage("CacheNode_Sub10.method2329:97 PacketParser.method2249:2006 Class194_Sub3_Sub1.method1980:31 Node_Sub38_Sub38.method2916:143 Client.method120:1755 Client.method97:1637 GameStub.method98:533 GameStub.run:371 java.lang.Thread.run | java.lang.NullPointerException | T2 - 91,6,69 - 23,4192,5721 - 0,2,-128,0,0,6,0,0,40,0,2,64,0,3,17,-13,-80,71,-53,-63,31,46,-128,").setVisible(true);
	}

	// Variables declaration - do not modify
	private javax.swing.JButton copyButton;
	private javax.swing.JLabel informationLabel;
	private javax.swing.JScrollPane messageScroll;
	private javax.swing.JTextArea errorMessage;
	// End of variables declaration
}