import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Card {

	private JPanel contentPane;
	private JFrame f;
	JLabel lblNewLabel_2;
	
	public Card(Info in) {
		f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 491, 353);
		f.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		f.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 239, 213));
		panel_1.setBounds(0, 0, 475, 281);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\om\\Pictures\\logo.png"));
		lblNewLabel_1.setBounds(0, 0, 94, 87);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(104, 51, 43, 18);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Father Name:");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(104, 80, 90, 18);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Branch:");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(104, 109, 52, 18);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Date of birth:");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(104, 138, 87, 18);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Blood Group:");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(105, 167, 89, 18);
		panel_1.add(lblNewLabel_3_4);
		
		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(348, 51, 101, 127);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Contact No:");
		lblNewLabel_3_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(104, 196, 79, 18);
		panel_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Address:");
		lblNewLabel_3_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(104, 225, 60, 18);
		panel_1.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4 = new JLabel("ID:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(335, 22, 22, 18);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_7 = new JLabel("Name");
		lblNewLabel_3_7.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7.setBounds(202, 50, 79, 18);
		panel_1.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_7_1 = new JLabel("Name");
		lblNewLabel_3_7_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_1.setBounds(202, 79, 136, 18);
		panel_1.add(lblNewLabel_3_7_1);
		
		JLabel lblNewLabel_3_7_2 = new JLabel("Name");
		lblNewLabel_3_7_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_2.setBounds(202, 108, 79, 18);
		panel_1.add(lblNewLabel_3_7_2);
		
		JLabel lblNewLabel_3_7_3 = new JLabel("Name");
		lblNewLabel_3_7_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_3.setBounds(201, 137, 79, 18);
		panel_1.add(lblNewLabel_3_7_3);
		
		JLabel lblNewLabel_3_7_4 = new JLabel("Name");
		lblNewLabel_3_7_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_4.setBounds(201, 166, 79, 18);
		panel_1.add(lblNewLabel_3_7_4);
		
		JLabel lblNewLabel_3_7_5 = new JLabel("Name");
		lblNewLabel_3_7_5.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_5.setBounds(202, 195, 94, 18);
		panel_1.add(lblNewLabel_3_7_5);
		
		JLabel lblNewLabel_3_7_6 = new JLabel("Name");
		lblNewLabel_3_7_6.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_6.setBounds(174, 210, 179, 60);
		panel_1.add(lblNewLabel_3_7_6);
		
		JLabel lblNewLabel_3_7_7 = new JLabel("Name");
		lblNewLabel_3_7_7.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblNewLabel_3_7_7.setBounds(359, 21, 79, 18);
		panel_1.add(lblNewLabel_3_7_7);
		
		JLabel lblNewLabel_5 = new JLabel("Signature");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(379, 252, 62, 18);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_3_7.setText(in.getName());
		lblNewLabel_3_7_1.setText(in.getFatherName());
		lblNewLabel_3_7_2.setText(in.getBranch());
		lblNewLabel_3_7_3.setText(in.getDob());
		lblNewLabel_3_7_4.setText(in.getBloodGrp());
		lblNewLabel_3_7_5.setText(Long.toString(in.getMobile()));
		lblNewLabel_3_7_6.setText(in.getAddress());
		lblNewLabel_3_7_7.setText(in.getId());
		lblNewLabel_2.setIcon(ResizeImage(in.getPath()));
		
		JLabel lblNewLabel = new JLabel("          ABC COLLEGE");
		lblNewLabel.setForeground(new Color(250, 128, 114));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lblNewLabel.setBounds(104, 11, 202, 29);
		panel_1.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 280, 475, 34);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Print");
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printRecord(panel_1);
			}
		});
	}
	public ImageIcon ResizeImage(String path)
	{
		ImageIcon myImage=new ImageIcon(path);
		Image img=myImage.getImage();
		Image newImg=img.getScaledInstance(lblNewLabel_2.getWidth(),lblNewLabel_2.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon newImage=new ImageIcon(newImg);
		return newImage;
	}
	public void printRecord(JComponent c)
	{
		PrinterJob pj=PrinterJob.getPrinterJob();
		pj.setJobName("Print");
		pj.setPrintable(new Printable()
				{
					@Override
					public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
						if(pageIndex>0)
							return Printable.NO_SUCH_PAGE;
						Graphics2D gd=(Graphics2D)graphics;
						gd.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
						c.printAll(gd);
						return Printable.PAGE_EXISTS;
					}
			
				});
		if (pj.printDialog() == false)
		  return;

		  try {
		        pj.print();
		  } catch (PrinterException ex) {
		        // handle exception
		  }
		
	}
}
