package guipekan8_2511533016;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import javax.swing.JComboBox;
	import javax.swing.JButton;
	import javax.swing.DefaultComboBoxModel;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class OperatorAritmatikaGUI_2511533016 extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField txtBil1;
		private JTextField txtBil2;
		private JTextField txtHasil;
//		private pesanPeringatan;
		
		
		private void pesanPeringatan(String pesan) {
			JOptionPane.showMessageDialog(this, pesan, "Peringatan",JOptionPane.WARNING_MESSAGE);
		}
		private void pesanError(String pesan) {
			JOptionPane.showMessageDialog(this, pesan, "Kesalahan",JOptionPane.ERROR_MESSAGE);
		}

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						OperatorAritmatikaGUI_2511533016 frame = new OperatorAritmatikaGUI_2511533016();
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
		public OperatorAritmatikaGUI_2511533016() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
			lblNewLabel.setBounds(115, 10, 142, 20);
			contentPane.add(lblNewLabel);
			
			txtBil1 = new JTextField();
			txtBil1.setBounds(67, 71, 57, 18);
			contentPane.add(txtBil1);
			txtBil1.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
			comboBox.setBounds(67, 146, 35, 20);
			contentPane.add(comboBox);
			
			txtBil2 = new JTextField();
			txtBil2.setBounds(67, 99, 57, 18);
			contentPane.add(txtBil2);
			txtBil2.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
			lblNewLabel_1.setBounds(7, 71, 57, 15);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
			lblNewLabel_2.setBounds(10, 102, 54, 12);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Operator");
			lblNewLabel_3.setBounds(7, 150, 44, 12);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Hasil");
			lblNewLabel_4.setBounds(7, 198, 44, 12);
			contentPane.add(lblNewLabel_4);
			
			txtHasil = new JTextField();
			txtHasil.setBounds(70, 195, 54, 18);
			contentPane.add(txtHasil);
			txtHasil.setColumns(10);
			
			JButton btnNewButton = new JButton("Proses");
			btnNewButton.addActionListener(new ActionListener() {
				int hasil;
				public void actionPerformed(ActionEvent e) {
					if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bialangan 1 harus diisi");
				}else if (txtBil2.getText().trim().isEmpty()) {
				pesanPeringatan("Bialangan 2 harus diisi");
				} else
				{
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = comboBox.getSelectedIndex();
						
							if (c==0) {
								hasil = a+b;
							}
							if (c==1) {
								hasil = a-b;
							}
							if (c==2) {
								hasil = a*b;
							}
							if (c==3) {
								hasil = a/b;
							}
							if (c==4) {
								hasil = a%b;
							}
						} catch (NumberFormatException ex) {
							pesanError ("Bilangan 1 dan BIlangan 2 harus angka");
						}
				}
					txtHasil.setText(String.valueOf(hasil));
				}
			});
			btnNewButton.setBounds(111, 146, 84, 20);
			contentPane.add(btnNewButton);

				

		
	}
	}