package NailSalon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.border.BevelBorder;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Salon {

	private JFrame frame;
	private JTable table;
	private JTextField txtSub;
	private JTextField txtPay;
	private JTextField txtBal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salon window = new Salon();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Salon() {
		initialize();
	}
	
	DefaultTableModel model = new DefaultTableModel();
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 217, 236));
		frame.setBounds(100, 100, 1004, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 128, 192), 1, true));
		panel.setBackground(new Color(255, 217, 236));
		panel.setBounds(0, 0, 990, 59);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nail Salon Inventory");
		lblNewLabel.setForeground(new Color(189, 0, 95));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(381, 10, 246, 39);
		panel.add(lblNewLabel);
		
		JList list = new JList();
		list.setBounds(166, 305, 1, 1);
		frame.getContentPane().add(list);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(255, 217, 236));
		panel_1.setBounds(0, 69, 406, 410);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Procedure Type:");
		lblNewLabel_1.setForeground(new Color(189, 0, 95));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 10, 138, 26);
		panel_1.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(189, 0, 95));
		separator.setBounds(10, 40, 416, 19);
		panel_1.add(separator);
		
		JCheckBox chk1 = new JCheckBox("Full Set Acrylics Natural");
		chk1.setForeground(new Color(189, 0, 95));
		chk1.setBackground(new Color(255, 217, 236));
		chk1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk1.setBounds(10, 65, 416, 26);
		panel_1.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Infill Acrylics - French");
		chk2.setForeground(new Color(189, 0, 95));
		chk2.setBackground(new Color(255, 217, 236));
		chk2.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk2.setBounds(10, 105, 416, 26);
		panel_1.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Polish re-paint");
		chk3.setForeground(new Color(189, 0, 95));
		chk3.setBackground(new Color(255, 217, 236));
		chk3.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk3.setBounds(10, 145, 416, 26);
		panel_1.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("Gel Colour");
		chk4.setForeground(new Color(189, 0, 95));
		chk4.setBackground(new Color(255, 217, 236));
		chk4.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk4.setBounds(10, 188, 416, 26);
		panel_1.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("Gel Nails Simple Design");
		chk5.setForeground(new Color(189, 0, 95));
		chk5.setBackground(new Color(255, 217, 236));
		chk5.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk5.setBounds(10, 233, 416, 26);
		panel_1.add(chk5);
		
		JCheckBox chk6 = new JCheckBox("Gel Toes");
		chk6.setForeground(new Color(189, 0, 95));
		chk6.setBackground(new Color(255, 217, 236));
		chk6.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk6.setBounds(10, 276, 416, 26);
		panel_1.add(chk6);
		
		JCheckBox chk7 = new JCheckBox("File & Polish");
		chk7.setForeground(new Color(189, 0, 95));
		chk7.setBackground(new Color(255, 217, 236));
		chk7.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk7.setBounds(10, 317, 416, 26);
		panel_1.add(chk7);
		
		JCheckBox chk8 = new JCheckBox("Manicure - with Gel");
		chk8.setForeground(new Color(189, 0, 95));
		chk8.setBackground(new Color(255, 217, 236));
		chk8.setFont(new Font("Tahoma", Font.BOLD, 15));
		chk8.setBounds(10, 358, 416, 26);
		panel_1.add(chk8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 217, 236));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(422, 489, 558, 168);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("SubTotal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(24, 25, 72, 39);
		panel_3.add(lblNewLabel_2);
		
		txtSub = new JTextField();
		txtSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtSub.setBounds(106, 26, 147, 38);
		panel_3.add(txtSub);
		txtSub.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cash");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(310, 27, 72, 37);
		panel_3.add(lblNewLabel_2_1);
		
		txtPay = new JTextField();
		txtPay.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPay.setColumns(10);
		txtPay.setBounds(390, 25, 147, 39);
		panel_3.add(txtPay);
		
		JLabel lblNewLabel_2_2 = new JLabel("Balance");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(24, 87, 72, 39);
		panel_3.add(lblNewLabel_2_2);
		
		txtBal = new JTextField();
		txtBal.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtBal.setColumns(10);
		txtBal.setBounds(106, 88, 147, 38);
		panel_3.add(txtBal);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int subtot = Integer.parseInt(txtSub.getText());
				int pay = Integer.parseInt(txtPay.getText());
				
				// Get the balance
				int bal = pay - subtot;
				txtBal.setText(String.valueOf(bal));
			}
		});
		btnCal.setBackground(new Color(133, 231, 176));
		btnCal.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCal.setBounds(310, 87, 227, 39);
		panel_3.add(btnCal);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO add your handling code here:
				
				int sum = 0;
				int price;
				
				if(chk1.isSelected()) {
					String cut = chk1.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 80
					}); 
						
					
				}
				
				if(chk2.isSelected()) {
					String cut = chk2.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 60
					}); 
						
					
				}
				
				if(chk3.isSelected()) {
					String cut = chk3.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 20
					}); 
						
					
				}
				
				if(chk4.isSelected()) {
					String cut = chk4.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 45
					}); 
						
					
				}
				
				if(chk5.isSelected()) {
					String cut = chk5.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 55
					}); 
						
					
				}
				
				if(chk6.isSelected()) {
					String cut = chk6.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 33
					}); 
						
					
				}
				
				if(chk7.isSelected()) {
					String cut = chk7.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 36
					}); 
						
					
				}
				
				if(chk8.isSelected()) {
					String cut = chk8.getText();
					model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[] {
							cut,
							price = 39
					}); 
						
					
				}
				
				// Get the subtotal
				for(int i = 0; i<table.getRowCount(); i++) {
					sum = sum + Integer.parseInt(table.getValueAt(i, 1).toString());
				}
				
				txtSub.setText(String.valueOf(sum));		
			}
		});
		
		
		btnAdd.setBackground(new Color(64, 159, 255));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBounds(144, 509, 108, 42);
		frame.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(422, 69, 568, 410);
		frame.getContentPane().add(scrollPane);
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		table = new JTable();
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setFont(new Font("Verdana", Font.PLAIN, 13));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Procedure Type", "Price"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(95);
	}
}
