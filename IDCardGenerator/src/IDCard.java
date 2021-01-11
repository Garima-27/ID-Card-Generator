import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class IDCard extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_5;
	private JTextField textField_4;
	private JTextField textField_6;
	private JButton btnNewButton_1_1,btnNewButton,btnNewButton_1;
	private JTextArea textArea;
	private JComboBox comboBox,comboBox_1;
	Info in=new Info();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDCard frame = new IDCard();
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
	public IDCard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 23, 96, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblAge.setBounds(10, 102, 96, 28);
		contentPane.add(lblAge);
		
		JLabel lblFatherName = new JLabel("Father Name:");
		lblFatherName.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblFatherName.setBounds(10, 63, 123, 28);
		contentPane.add(lblFatherName);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblBranch.setBounds(10, 141, 96, 28);
		contentPane.add(lblBranch);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblDateOfBirth.setBounds(10, 180, 123, 28);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblMobileNo = new JLabel("Mobile No:");
		lblMobileNo.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblMobileNo.setBounds(10, 219, 123, 28);
		contentPane.add(lblMobileNo);
		
		JLabel lblAddress = new JLabel("Gender:");
		lblAddress.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblAddress.setBounds(10, 302, 96, 28);
		contentPane.add(lblAddress);
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		lblBloodGroup.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblBloodGroup.setBounds(10, 263, 123, 28);
		contentPane.add(lblBloodGroup);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 148, 151, 20);
		contentPane.add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 109, 151, 20);
		contentPane.add(textField_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 70, 151, 20);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(143, 30, 151, 20);
		contentPane.add(textField);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 226, 151, 20);
		contentPane.add(textField_5);
		
		textArea = new JTextArea(203,48);
		textArea.setBounds(91, 345, 203, 48);
		textArea.setMargin(new Insets(10,10,10,10));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea);
//      JScrollPane scroll = new JScrollPane (textArea);
//		contentPane.add(scroll);
//		scroll.setVisible(true);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblAddress_1.setBounds(10, 341, 96, 28);
		contentPane.add(lblAddress_1);
		
		String s1[]= {"Select","A+","A-","B+","B-","O+","O-","AB+","AB-"};
		comboBox = new JComboBox(s1);
		comboBox.setBounds(143, 268, 151, 22);
		contentPane.add(comboBox);
		
		String s2[]= {"Select","Male","Female"};
		comboBox_1 = new JComboBox(s2);
		comboBox_1.setBounds(143, 307, 151, 22);
		contentPane.add(comboBox_1);
		
		btnNewButton = new JButton("Select Image");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 404, 115, 28);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Print");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1.setBounds(165, 454, 108, 36);
		contentPane.add(btnNewButton_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(143, 186, 151, 20);
		contentPane.add(textField_6);
		
		btnNewButton_1_1 = new JButton("Generate ID");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(30, 454, 115, 36);
		contentPane.add(btnNewButton_1_1);
		
		btnNewButton_1_1.addActionListener(this);
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);
		
		//set details
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Database db=new Database();
		JFrame f=new JFrame();
		in.setName(textField.getText());
		in.setFatherName(textField_1.getText());
		in.setBranch(textField_3.getText());
		try{
			in.setAge(Integer.parseInt(textField_2.getText()));
		}
		catch(Exception e2){}
	
		in.setGender(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()).toString());
		in.setDob(textField_6.getText());
		in.setBloodGrp(comboBox.getItemAt(comboBox.getSelectedIndex()).toString());
		in.setAddress(textArea.getText());
		try{
			in.setMobile(Long.parseLong(textField_5.getText()));	
		}
		catch(Exception e1){}
		if(e.getSource()==btnNewButton_1_1)
			JOptionPane.showMessageDialog(f,db.insert(in));  
		
		if(e.getSource()==btnNewButton)
		{
			JFileChooser fc=new JFileChooser();
			int i=fc.showOpenDialog(this);
			if(i==JFileChooser.APPROVE_OPTION)
			{
				File file=fc.getSelectedFile();
				String path=file.getPath();
				in.setPath(path);
			}
		}
		
	}
}
