package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Skitnerdig extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtinname;
	private JTextField txtinnum;
	private JTextArea textArea;
	private ArrayList<getLista> lista = new ArrayList<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Skitnerdig frame = new Skitnerdig();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Skitnerdig() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(59, 45, 70, 15);
		contentPane.add(lblNamn);

		JLabel lblTelefonr = new JLabel("Telefonr");
		lblTelefonr.setBounds(156, 45, 70, 15);
		contentPane.add(lblTelefonr);

		txtinname = new JTextField();
		txtinname.setBounds(28, 72, 114, 19);
		contentPane.add(txtinname);
		txtinname.setColumns(10);

		txtinnum = new JTextField();
		txtinnum.setBounds(166, 72, 114, 19);
		contentPane.add(txtinnum);
		txtinnum.setColumns(10);

		textArea = new JTextArea();
		textArea.setBounds(59, 115, 205, 125);
		contentPane.add(textArea);

		JButton btnadd = new JButton("Lägg till");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea.setText("");

				String namn = txtinname.getText();
				String tel = txtinnum.getText();

				lista.add(new getLista(namn, tel));	

				textArea.append(namn + "    " + tel);

			}
		});
		btnadd.setBounds(299, 23, 117, 25);
		contentPane.add(btnadd);

		JButton btnrem = new JButton("Ta bort");
		btnrem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String namn = txtinname.getText();
				String tel = txtinnum.getText();
				try {
					for(int i = 0; i < lista.size(); i++) {
						if(lista.get(i).getName().equals(namn)) {
							lista.remove(i);
							textArea.setText(null);
							for(int a=0; a< lista.size(); a++) {

								textArea.append(lista.get(a).getKontakt());
							}
							textArea.append(lista.get(i).getKontakt());

						}
					}
				}catch (IndexOutOfBoundsException p) {

				}




				//				for(int i = 0; i<lista.size(); i++) {
				//					if(lista.get(i).getTel().equals(tel));
				//					
				//				}
				//				
				//				textArea.setText(""); {
				//					for(int i = 0; i<lista.size(); i++) {	
				//						textArea.append(lista.get(i).getKontakt());
				//					}
				//				}

			}
		
	
		});
		btnrem.setBounds(299, 72, 117, 25);
		contentPane.add(btnrem);

		JButton btnchange = new JButton("Ändra");
		btnchange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String namn = txtinname.getText();
				String tel = txtinnum.getText();
				

				
				for(int i = 0; i < lista.size(); i++) {
					if(lista.get(i).getName().equals(namn)) {
						lista.get(i).setTel(tel);
					}}
							textArea.setText(null);
							for(int a=0; a< lista.size(); a++) {
								textArea.append(lista.get(a).getKontakt());

							}
							
							textArea.setText("");
							for(int a = 0; a< lista.size();a++) {
								textArea.append(lista.get(a).getKontakt());
												}						
						
					

				
				
			}
		});
		btnchange.setBounds(299, 115, 117, 25);
		contentPane.add(btnchange);

		JButton btnsearch = new JButton("Sök");
		btnsearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namn = txtinname.getText();
				String tel = txtinnum.getText();
				
				textArea.setText(null);
				
				for(int i=0; i<lista.size(); i++) {
					if(lista.get(i).getName().equals(namn)) {
						textArea.append(lista.get(i).getKontakt());
					}
					
				}
			}
		});
		btnsearch.setBounds(299, 189, 117, 25);
		contentPane.add(btnsearch);

		JButton btnview = new JButton("Visa alla");
		btnview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea.setText("");
				for(int i = 0; i< lista.size();i++) {
					textArea.append(lista.get(i).getKontakt());
				}
			}
		});
		btnview.setBounds(299, 152, 117, 25);
		contentPane.add(btnview);
}
}
