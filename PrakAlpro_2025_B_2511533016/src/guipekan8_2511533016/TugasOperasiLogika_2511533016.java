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

	public class TugasOperasiLogika_2511533016 extends JFrame {

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
						TugasOperasiLogika_2511533016 frame = new TugasOperasiLogika_2511533016();
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
		public TugasOperasiLogika_2511533016() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("OPERATOR LOGIKA");
			lblNewLabel.setBounds(115, 10, 142, 20);
			contentPane.add(lblNewLabel);
			
			txtBil1 = new JTextField();
			txtBil1.setBounds(87, 71, 79, 17);
			contentPane.add(txtBil1);
			txtBil1.setColumns(10);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2"}));
			comboBox.setBounds(87, 146, 79, 20);
			contentPane.add(comboBox);
			
			txtBil2 = new JTextField();
			txtBil2.setBounds(87, 99, 79, 18);
			contentPane.add(txtBil2);
			txtBil2.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("Operasi 1");
			lblNewLabel_1.setBounds(7, 71, 70, 15);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Operasi 2");
			lblNewLabel_2.setBounds(10, 102, 67, 12);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Operator");
			lblNewLabel_3.setBounds(7, 150, 72, 12);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Hasil");
			lblNewLabel_4.setBounds(7, 198, 44, 12);
			contentPane.add(lblNewLabel_4);
			
			txtHasil = new JTextField();
			txtHasil.setBounds(87, 195, 79, 18);
			contentPane.add(txtHasil);
			txtHasil.setColumns(10);
			
			JButton btnNewButton = new JButton("Proses");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean hasil = false;
					try {
						String text1 = txtBil1.getText().trim();
						String text2 = txtBil2.getText().trim();
						if(txtBil1.getText().trim().isEmpty()) {
							pesanPeringatan("nilai 1 harus di isi");
						} else
						if(txtBil2.getText().trim().isEmpty()) { 
							pesanPeringatan ("nilai 2 harus di isi");
						}
						if(!(text1.equalsIgnoreCase("true") || text1.equalsIgnoreCase("false"))) {
							pesanError("nilai 1 harus di isi true atau false");
						} else
						if (!(text2.equalsIgnoreCase("true") || text2.equalsIgnoreCase("false"))) {
							pesanError("nilai 2 harus di isi true atau false");
						}
						boolean a1 = Boolean.parseBoolean(text1);
						boolean a2= Boolean.parseBoolean(text2);
						int z = comboBox.getSelectedIndex();
						if (z==0) {hasil = a1 && a2;}
						if (z==1) {hasil = a1 || a2;}
						if (z==2) {hasil = !a1;}
						}
						catch (Exception ex) {
						pesanError("nilai 1 dan 2 harus berupa true atau false");
						}
						txtHasil.setText(String.valueOf(hasil));

					}
					});
					btnNewButton.setBounds (287, 139, 89, 23);
					contentPane.add(btnNewButton);

					}
					
		
	}
	