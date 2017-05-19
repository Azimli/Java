package ebob_ekob;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class ebob extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ebob frame = new ebob();
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
	public ebob() {
		setTitle("\u018FBOB v\u0259 \u018FKOB proqram\u0131");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbldd = new JLabel("\u018Fd\u0259d 1 :");
		lbldd.setBounds(27, 35, 46, 14);
		contentPane.add(lbldd);
		
		txt1 = new JTextField();
		txt1.setBounds(83, 32, 297, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JLabel lbldd_1 = new JLabel("\u018Fd\u0259d 2 :");
		lbldd_1.setBounds(27, 89, 46, 14);
		contentPane.add(lbldd_1);
		
		txt2 = new JTextField();
		txt2.setBounds(83, 86, 297, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JButton btn = new JButton("Cavab");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				
				int eded1,eded2,ekob,say=2,cem;
				
				eded1 = Integer.parseInt(txt1.getText());
				eded2 =Integer.parseInt(txt2.getText());
				
				while(true){
					if((say%eded1==0)&& (say%eded2==0))
					{
						cem=say;
						break;
					}
					say++;
				}
				
				
				while(eded2>0)
				{
					ekob=eded1%eded2;
					eded1=eded2;
					eded2 =ekob;
				}
				
				
				
				textField_3.setText(String.valueOf(cem));
				textField_2.setText(String.valueOf(eded1));
				
				
				
				
				
				
				
			}
		});
		btn.setBounds(164, 137, 123, 32);
		contentPane.add(btn);
		
		JLabel lblbob = new JLabel("\u018FBOB :");
		lblbob.setBounds(27, 203, 46, 14);
		contentPane.add(lblbob);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 200, 297, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblkob = new JLabel("\u018FKOB :");
		lblkob.setBounds(27, 255, 46, 14);
		contentPane.add(lblkob);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 252, 297, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
