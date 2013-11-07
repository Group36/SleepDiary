package experiments;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JRadioButton;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ActionListenerAttempt15 {

	private JFrame frame;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=-7,-16
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionListenerAttempt15 window = new ActionListenerAttempt15();
				
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			});
		}

	/**
	 * Create the application.
	 */
	public ActionListenerAttempt15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		frame.setVisible(true);
		
		final JFrame frame2 = new JFrame();
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout2 = new GridBagLayout();
		gridBagLayout2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame2.getContentPane().setLayout(gridBagLayout2);
		frame2.setVisible(false);
		
		final JFrame frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout3 = new GridBagLayout();
		gridBagLayout3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame3.getContentPane().setLayout(gridBagLayout3);
		frame3.setVisible(false);
		
		final JFrame frame4 = new JFrame();
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout4 = new GridBagLayout();
		gridBagLayout4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout4.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame4.getContentPane().setLayout(gridBagLayout4);
		frame4.setVisible(false);
		
		final JFrame frame5 = new JFrame();
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout5 = new GridBagLayout();
		gridBagLayout5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout5.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout5.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame5.getContentPane().setLayout(gridBagLayout5);
		frame5.setVisible(false);
		
		final JFrame frame6 = new JFrame();
		frame6.setBounds(100, 100, 450, 300);
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel dodger = new JLabel("New label");
		dodger.setIcon(new ImageIcon("C:\\Users\\George\\workspace3\\SleepApp\\Artdodger.jpg"));
		GroupLayout groupLayout = new GroupLayout(frame6.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(129, Short.MAX_VALUE)
					.addComponent(dodger, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(dodger, GroupLayout.PREFERRED_SIZE, 253, Short.MAX_VALUE)
					.addContainerGap())
		);
		frame6.getContentPane().setLayout(groupLayout);
		frame6.setVisible(false);
 
		
		
		JLabel lblHowManyCups = new JLabel("How many cups of coffee did you have today after midday?");
		GridBagConstraints gbc_lblHowManyCups = new GridBagConstraints();
		gbc_lblHowManyCups.insets = new Insets(0, 0, 5, 5);
		gbc_lblHowManyCups.gridx = 6;
		gbc_lblHowManyCups.gridy = 1;
		frame.getContentPane().add(lblHowManyCups, gbc_lblHowManyCups);

		
		JRadioButton rdbtnCups_1 = new JRadioButton("0 Cups");
		rdbtnCups_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				try{
				FileOutputStream fos = new FileOutputStream("Question1.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="0";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_rdbtnCups_1 = new GridBagConstraints();
		gbc_rdbtnCups_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCups_1.gridx = 6;
		gbc_rdbtnCups_1.gridy = 3;
		frame.getContentPane().add(rdbtnCups_1, gbc_rdbtnCups_1);
		
		JRadioButton rdbtnCup = new JRadioButton("1 Cup");
		rdbtnCup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question1.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="1";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}}
		});
		GridBagConstraints gbc_rdbtnCup = new GridBagConstraints();
		gbc_rdbtnCup.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCup.gridx = 6;
		gbc_rdbtnCup.gridy = 4;
		frame.getContentPane().add(rdbtnCup, gbc_rdbtnCup);
		
		JRadioButton rdbtnCups = new JRadioButton("2 Cups");
		rdbtnCups.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question1.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="2";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}}
		});
		GridBagConstraints gbc_rdbtnCups = new GridBagConstraints();
		gbc_rdbtnCups.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCups.gridx = 6;
		gbc_rdbtnCups.gridy = 5;
		frame.getContentPane().add(rdbtnCups, gbc_rdbtnCups);
		

		JRadioButton rdbtnCupsOr = new JRadioButton("3 Cups or More");
		rdbtnCupsOr.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question1.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="3";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}
				
			}
			
		});
		
		GridBagConstraints gbc_rdbtnCupsOr = new GridBagConstraints();
		gbc_rdbtnCupsOr.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCupsOr.gridx = 6;
		gbc_rdbtnCupsOr.gridy = 6;
		frame.getContentPane().add(rdbtnCupsOr, gbc_rdbtnCupsOr);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				frame2.setVisible(true);	
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.insets = new Insets(0, 0, 0, 5);
		gbc_btnNext.gridx = 10;
		gbc_btnNext.gridy = 7;
		frame.getContentPane().add(btnNext, gbc_btnNext);

		
	
		
		JButton btnBack2 = new JButton("Back");
		btnBack2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(true);
				frame2.setVisible(false);}
			
		});
				
				
				GridBagConstraints gbc_btnBack2 = new GridBagConstraints();
				gbc_btnBack2.insets = new Insets(0, 0, 0, 5);
				gbc_btnBack2.gridx = 1;
				gbc_btnBack2.gridy = 7;
				frame2.getContentPane().add(btnBack2, gbc_btnBack2);
				
		JButton btnNext2 = new JButton("Next");
		btnNext2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame3.setVisible(true);
				frame2.setVisible(false);		
			}
		});
		
		GridBagConstraints gbc_btnNext2 = new GridBagConstraints();
		gbc_btnNext2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNext2.gridx = 10;
		gbc_btnNext2.gridy = 7;
		frame2.getContentPane().add(btnNext2, gbc_btnNext2);
		
		JLabel HowManyHoursNap = new JLabel("How many hours did you nap for yesterday, if at all?");
		GridBagConstraints gbc_HowManyHoursNap = new GridBagConstraints();
		gbc_HowManyHoursNap.insets = new Insets(0, 0, 5, 5);
		gbc_HowManyHoursNap.gridx = 6;
		gbc_HowManyHoursNap.gridy = 1;
		frame2.getContentPane().add(HowManyHoursNap, gbc_HowManyHoursNap);

		JRadioButton NapHours_1 = new JRadioButton("Not at all");
		NapHours_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question2.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="0";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_NapHours_1 = new GridBagConstraints();
		gbc_NapHours_1.insets = new Insets(0, 0, 5, 5);
		gbc_NapHours_1.gridx = 6;
		gbc_NapHours_1.gridy = 3;
		frame2.getContentPane().add(NapHours_1,gbc_NapHours_1);
		
		JRadioButton NapHours_2 = new JRadioButton("0-1 hours");
		NapHours_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question2.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="0.5";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_NapHours_2 = new GridBagConstraints();
		gbc_NapHours_2.insets = new Insets(0, 0, 5, 5);
		gbc_NapHours_2.gridx = 6;
		gbc_NapHours_2.gridy = 4;
		frame2.getContentPane().add(NapHours_2,gbc_NapHours_2);
		
		JRadioButton NapHours_3 = new JRadioButton("1-2 hours");
		NapHours_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question2.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="1.5";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_NapHours_3 = new GridBagConstraints();
		gbc_NapHours_3.insets = new Insets(0, 0, 5, 5);
		gbc_NapHours_3.gridx = 6;
		gbc_NapHours_3.gridy = 5;
		frame2.getContentPane().add(NapHours_3,gbc_NapHours_3);

		JRadioButton NapHours_4 = new JRadioButton("2-3 hours");
		NapHours_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question2.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="2.5";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_NapHours_4 = new GridBagConstraints();
		gbc_NapHours_4.insets = new Insets(0, 0, 5, 5);
		gbc_NapHours_4.gridx = 6;
		gbc_NapHours_4.gridy = 6;
		frame2.getContentPane().add(NapHours_4,gbc_NapHours_4);
		
		JRadioButton NapHours_5 = new JRadioButton("Over 3 hours");
		NapHours_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question2.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="3.5";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		
		GridBagConstraints gbc_NapHours_5 = new GridBagConstraints();
		gbc_NapHours_5.insets = new Insets(0, 0, 5, 5);
		gbc_NapHours_5.gridx = 6;
		gbc_NapHours_5.gridy = 7;
		frame2.getContentPane().add(NapHours_5,gbc_NapHours_5);
		
		
		JLabel HowManyHours = new JLabel("How many hours of sleep did you get last night?");
		GridBagConstraints gbc_HowManyHours = new GridBagConstraints();
		gbc_HowManyHours.insets = new Insets(0, 0, 5, 5);
		gbc_HowManyHours.gridx = 6;
		gbc_HowManyHours.gridy = 1;
		frame3.getContentPane().add(HowManyHours, gbc_HowManyHours);

		
		JRadioButton SleepHours_1 = new JRadioButton("0-2 hours");
		SleepHours_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question3.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="1";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_SleepHours_1 = new GridBagConstraints();
		gbc_SleepHours_1.insets = new Insets(0, 0, 5, 5);
		gbc_SleepHours_1.gridx = 6;
		gbc_SleepHours_1.gridy = 3;
		frame3.getContentPane().add(SleepHours_1,gbc_SleepHours_1);
		
		JRadioButton SleepHours_2 = new JRadioButton("2-4 hours");
		SleepHours_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question3.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="3";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_SleepHours_2 = new GridBagConstraints();
		gbc_SleepHours_2.insets = new Insets(0, 0, 5, 5);
		gbc_SleepHours_2.gridx = 6;
		gbc_SleepHours_2.gridy = 4;
		frame3.getContentPane().add(SleepHours_2,gbc_SleepHours_2);
		
		JRadioButton SleepHours_3 = new JRadioButton("4-6 hours");
		SleepHours_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question3.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="5";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_SleepHours_3 = new GridBagConstraints();
		gbc_SleepHours_3.insets = new Insets(0, 0, 5, 5);
		gbc_SleepHours_3.gridx = 6;
		gbc_SleepHours_3.gridy = 5;
		frame3.getContentPane().add(SleepHours_3,gbc_SleepHours_3);

		JRadioButton SleepHours_4 = new JRadioButton("6-8 hours");
		SleepHours_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question3.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="7";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_SleepHours_4 = new GridBagConstraints();
		gbc_SleepHours_4.insets = new Insets(0, 0, 5, 5);
		gbc_SleepHours_4.gridx = 6;
		gbc_SleepHours_4.gridy = 6;
		frame3.getContentPane().add(SleepHours_4,gbc_SleepHours_4);
		
		JRadioButton SleepHours_5 = new JRadioButton("Over 8 hours");
		SleepHours_5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question3.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="9";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_SleepHours_5 = new GridBagConstraints();
		gbc_SleepHours_5.insets = new Insets(0, 0, 5, 5);
		gbc_SleepHours_5.gridx = 6;
		gbc_SleepHours_5.gridy = 7;
		frame3.getContentPane().add(SleepHours_5,gbc_SleepHours_5);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
				frame2.setVisible(false);
				frame3.setVisible(false);
				frame4.setVisible(true);
				
				
				
			}
		});
		GridBagConstraints gbc_btnNext3 = new GridBagConstraints();
		gbc_btnNext3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNext3.gridx = 10;
		gbc_btnNext3.gridy = 7;
		frame3.getContentPane().add(btnNext3, gbc_btnNext3);
		
		JButton btnBack3 = new JButton("Back");
		btnBack3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame2.setVisible(true);
				frame3.setVisible(false);}
			
		});
				
				
				GridBagConstraints gbc_btnBack3 = new GridBagConstraints();
				gbc_btnBack3.insets = new Insets(0, 0, 0, 5);
				gbc_btnBack3.gridx = 1;
				gbc_btnBack3.gridy = 7;
				frame3.getContentPane().add(btnBack3, gbc_btnBack3);
		
		JLabel lblHowManyWakes = new JLabel("How many times did you wake up last night?");
		GridBagConstraints gbc_lblHowManyWakes = new GridBagConstraints();
		gbc_lblHowManyWakes.insets = new Insets(0, 0, 5, 5);
		gbc_lblHowManyWakes.gridx = 6;
		gbc_lblHowManyWakes.gridy = 1;
		frame4.getContentPane().add(lblHowManyWakes, gbc_lblHowManyWakes);

		
		JRadioButton Wakes_1 = new JRadioButton("Not once!");
		Wakes_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				try{
				FileOutputStream fos = new FileOutputStream("Question4.txt");
				Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
				String sb2="0";
				w.write(sb2);
				w.flush(); 
			}
			catch(Exception f){
				f.printStackTrace();
			}}
		});
		GridBagConstraints gbc_Wakes_1 = new GridBagConstraints();
		gbc_Wakes_1.insets = new Insets(0, 0, 5, 5);
		gbc_Wakes_1.gridx = 6;
		gbc_Wakes_1.gridy = 3;
		frame4.getContentPane().add(Wakes_1, gbc_Wakes_1);
		
		JRadioButton Wakes_2 = new JRadioButton("Once");
		Wakes_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question4.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="1";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}}
		});
		GridBagConstraints gbc_Wakes_2 = new GridBagConstraints();
		gbc_Wakes_2.insets = new Insets(0, 0, 5, 5);
		gbc_Wakes_2.gridx = 6;
		gbc_Wakes_2.gridy = 4;
		frame4.getContentPane().add(Wakes_2, gbc_Wakes_2);
		
		JRadioButton Wakes_3 = new JRadioButton("Twice");
		Wakes_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question4.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="2";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}}
		});
		GridBagConstraints gbc_Wakes_3 = new GridBagConstraints();
		gbc_Wakes_3.insets = new Insets(0, 0, 5, 5);
		gbc_Wakes_3.gridx = 6;
		gbc_Wakes_3.gridy = 5;
		frame4.getContentPane().add(Wakes_3, gbc_Wakes_3);
		

		JRadioButton Wakes_4 = new JRadioButton("3 times or more");
		Wakes_4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try{
					FileOutputStream fos = new FileOutputStream("Question4.txt");
					Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
					String sb2="3";
					w.write(sb2);
					w.flush(); 
				}
				catch(Exception f){
					f.printStackTrace();
				}
				
			}
			
		});
		
		GridBagConstraints gbc_Wakes_4 = new GridBagConstraints();
		gbc_Wakes_4.insets = new Insets(0, 0, 5, 5);
		gbc_Wakes_4.gridx = 6;
		gbc_Wakes_4.gridy = 6;
		frame4.getContentPane().add(Wakes_4, gbc_Wakes_4);
		
		
		JButton btnNext4 = new JButton("Next");
		btnNext4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame4.setVisible(false);
				frame5.setVisible(true);	
			}
		});
		GridBagConstraints gbc_btnNext4 = new GridBagConstraints();
		gbc_btnNext4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNext4.gridx = 10;
		gbc_btnNext4.gridy = 7;
		frame4.getContentPane().add(btnNext4, gbc_btnNext4);

		JButton btnBack4 = new JButton("Back");
		btnBack4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame3.setVisible(true);
				frame4.setVisible(false);}
			
		});
				
				
				GridBagConstraints gbc_btnBack4 = new GridBagConstraints();
				gbc_btnBack4.insets = new Insets(0, 0, 0, 5);
				gbc_btnBack4.gridx = 1;
				gbc_btnBack4.gridy = 7;
				frame4.getContentPane().add(btnBack4, gbc_btnBack4);
		
				JButton btnBack5 = new JButton("Back");
				btnBack5.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						frame4.setVisible(true);
						frame5.setVisible(false);}
					
				});
						
						
						GridBagConstraints gbc_btnBack5 = new GridBagConstraints();
						gbc_btnBack5.insets = new Insets(0, 0, 0, 5);
						gbc_btnBack5.gridx = 1;
						gbc_btnBack5.gridy = 7;
						frame5.getContentPane().add(btnBack5, gbc_btnBack5);
						
				JButton submit = new JButton("Submit");
				submit.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						frame6.setVisible(true);
						frame5.setVisible(false);
						try{
							BufferedReader in2 = new BufferedReader(new FileReader("DataString.txt")); 
							String text2 = in2.readLine();
							in2.close();
							String text3="|";
							StringBuffer sb3=new StringBuffer(text3);
							sb3.append(text2);
							FileOutputStream fos3 = new FileOutputStream("DataString.txt");
							Writer w3 =  new BufferedWriter(new OutputStreamWriter(fos3));
							String sb4=sb3.toString();
							w3.write(sb4);
							w3.flush(); 
							w3.close();
							String[] files= {"Question5.txt", "Question4.txt", "Question3.txt", "Question2.txt", "Question1.txt"}; 
							for(int i=0; i<files.length;i++){
							BufferedReader in = new BufferedReader(new FileReader(files[i])); 
							String text = in.readLine()+","; 
							in.close();
							String textExisting;
							BufferedReader inExisting = new BufferedReader(new FileReader("DataString.txt")); 
							textExisting = inExisting.readLine(); 
							inExisting.close();
							StringBuffer sb = new StringBuffer(text);
							sb.append(textExisting);
							FileOutputStream fos = new FileOutputStream("DataString.txt");
							Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
							String sb2=sb.toString();
							w.write(sb2);
							w.flush(); 
							w.close();
							}
							}
							catch(Exception ef){
								ef.printStackTrace();
							}
					}
				});
				
				GridBagConstraints gbc_submit = new GridBagConstraints();
				gbc_submit.insets = new Insets(0, 0, 0, 5);
				gbc_submit.gridx = 10;
				gbc_submit.gridy = 7;
				frame5.getContentPane().add(submit, gbc_submit);
				
				JLabel HowClose = new JLabel("How easy was it to wake up in the morning?");
				GridBagConstraints gbc_HowClose = new GridBagConstraints();
				gbc_HowClose.insets = new Insets(0, 0, 5, 5);
				gbc_HowClose.gridx = 2;
				gbc_HowClose.gridy = 1;
				frame5.getContentPane().add(HowClose, gbc_HowClose);

				JRadioButton Alertness_1 = new JRadioButton("Very difficult, extremely drowsy all day");
				Alertness_1.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {				
						try{
						FileOutputStream fos = new FileOutputStream("Question5.txt");
						Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
						String sb2="0";
						w.write(sb2);
						w.flush(); 
					}
					catch(Exception f){
						f.printStackTrace();
					}}
				});
				GridBagConstraints gbc_Alertness_1 = new GridBagConstraints();
				gbc_Alertness_1.insets = new Insets(0, 0, 5, 5);
				gbc_Alertness_1.gridx = 2;
				gbc_NapHours_1.gridy = 3;
				frame5.getContentPane().add(Alertness_1,gbc_Alertness_1);
				
				JRadioButton Alertness_2 = new JRadioButton("Fairly difficult, drowsy all morning");
				Alertness_2.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {				
						try{
						FileOutputStream fos = new FileOutputStream("Question5.txt");
						Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
						String sb2="1";
						w.write(sb2);
						w.flush(); 
					}
					catch(Exception f){
						f.printStackTrace();
					}}
				});
				GridBagConstraints gbc_Alertness_2 = new GridBagConstraints();
				gbc_Alertness_2.insets = new Insets(0, 0, 5, 5);
				gbc_Alertness_2.gridx = 2;
				gbc_Alertness_2.gridy = 4;
				frame5.getContentPane().add(Alertness_2,gbc_Alertness_2);
				
				JRadioButton Alertness_3 = new JRadioButton("Slightly difficult, drowsy for first 2 hours");
				Alertness_3.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {				
						try{
						FileOutputStream fos = new FileOutputStream("Question5.txt");
						Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
						String sb2="2";
						w.write(sb2);
						w.flush(); 
					}
					catch(Exception f){
						f.printStackTrace();
					}}
				});
				GridBagConstraints gbc_Alertness_3= new GridBagConstraints();
				gbc_Alertness_3.insets = new Insets(0, 0, 5, 5);
				gbc_Alertness_3.gridx = 2;
				gbc_Alertness_3.gridy = 5;
				frame5.getContentPane().add(Alertness_3,gbc_Alertness_3);

				JRadioButton Alertness_4 = new JRadioButton("Easy to get up, fully alert within 1 hour");
				Alertness_4.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {				
						try{
						FileOutputStream fos = new FileOutputStream("Question5.txt");
						Writer w =   new BufferedWriter(new OutputStreamWriter(fos));
						String sb2="3";
						w.write(sb2);
						w.flush(); 
					}
					catch(Exception f){
						f.printStackTrace();
					}}
				});
				GridBagConstraints gbc_Alertness_4 = new GridBagConstraints();
				gbc_Alertness_4.insets = new Insets(0, 0, 5, 5);
				gbc_Alertness_4.gridx = 2;
				gbc_Alertness_4.gridy = 6;
				frame5.getContentPane().add(Alertness_4,gbc_Alertness_4);
				
			
	}
}

