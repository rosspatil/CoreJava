package com.database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class ImageStoring extends JFrame {




	ImageIcon icon=new ImageIcon("C:\\Users\\Roshan\\Documents\\upload.JPG");
	ImageIcon icon1=new ImageIcon("C:\\Users\\Roshan\\Documents\\upload.JPG");
	JLabel namelb=new JLabel("Name");
	JLabel idlb=new JLabel("Id");
	JTextField name=new JTextField();
	JTextField id=new JTextField();
	JLabel image=new JLabel(icon);
	GridBagConstraints gcb=new GridBagConstraints();
	JPanel info=new JPanel(new GridLayout(2, 2));
	JPanel btn=new JPanel();
	JButton submit=new JButton("Add");
	JButton download=new JButton("Download");
	JButton show=new JButton("Show");
	String file="blank";
	public ImageStoring() {
		setSize(400, 180);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);



		info.add(namelb);
		info.add(name);
		info.add(idlb);
		info.add(id);

		gcb.gridx=0; gcb.gridy=0;
		gcb.gridheight=1; gcb.gridwidth=1;
		gcb.weightx=2; gcb.weighty=1;
		gcb.fill=GridBagConstraints.HORIZONTAL;
		gcb.anchor=GridBagConstraints.CENTER;
		add(info,gcb);


		image.setBorder(new LineBorder(Color.black, 1));
		gcb.gridx=1; gcb.gridy=0;
		gcb.gridheight=1; gcb.gridwidth=1;
		gcb.weightx=1; gcb.weighty=2;
		gcb.fill=GridBagConstraints.NONE;
		gcb.anchor=GridBagConstraints.CENTER;
		add(image,gcb);

		btn.add(submit);
		btn.add(show);
		btn.add(download);
		gcb.gridx=0; gcb.gridy=1;
		gcb.gridheight=2; gcb.gridwidth=2;
		gcb.weightx=2; gcb.weighty=2;
		gcb.fill=GridBagConstraints.NONE;
		gcb.anchor=GridBagConstraints.CENTER;
		add(btn,gcb);

		image.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton()==1){
					JFileChooser fs=new JFileChooser();
					fs.showOpenDialog(null);
					file=fs.getSelectedFile().getAbsolutePath();
					icon=new ImageIcon(file);
					if(icon.getIconHeight()<=100 && icon.getIconWidth()<=100){
						image.setIcon(icon);
					}
					else{
						System.out.println("File is greater");
					}				
				}
			}
		});




		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(!(name.getText().equals("") && id.getText().equals("")) && !(file.equals("blank")  )){
					try {
						File fl=new File(file);
						FileInputStream fin=new FileInputStream(fl);						
						PreparedStatement st=Database.getConnection().prepareStatement("insert into image(id,name,image) values(?,?,?);");

						st.setInt(1,Integer.parseInt(id.getText()));
						st.setString(2, name.getText());
						st.setBinaryStream(3, (InputStream)fin,(int) fl.length());
						st.execute();
						reset();
						image.setIcon(icon1);
						Database.getConnection().close();
					} catch ( FileNotFoundException e1) {
						e1.printStackTrace();					
					}catch (SQLIntegrityConstraintViolationException e2) {
						System.err.println("Duplicate entry");
						reset();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		download.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(!(name.getText().equals("") && id.getText().equals("")) ){				

					try {
						FileOutputStream fout=new FileOutputStream(new File("E://"+name.getText()+"_"+id.getText()+".jpg"));
						String name1=name.getText();
						int id1=Integer.parseInt(id.getText());
						PreparedStatement st=Database.getConnection().prepareStatement("Select image from image where name=? and id=?;");
						st.setString(1, name1);
						st.setInt(2, id1);
						ResultSet rs=st.executeQuery();
						byte[] img=new byte[100000];
						while (rs.next()) {
							InputStream in=rs.getBinaryStream(1);
							in.read(img);
						}	
						icon=new ImageIcon(img);
						image.setIcon(icon);				
						fout.write(img);
						fout.flush();
						fout.close();

					} catch (SQLException | IOException e1) {
						e1.printStackTrace();
					}


				}
			}
		});
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!(name.getText().equals("") && id.getText().equals("")) ){

					try {
						String name1=name.getText();
						int id1=Integer.parseInt(id.getText());
						PreparedStatement st=Database.getConnection().prepareStatement("Select image from image where name=? and id=?;");
						st.setString(1, name1);
						st.setInt(2, id1);
						ResultSet rs=st.executeQuery();
						byte[] img=new byte[100000];
						while (rs.next()) {
							InputStream in=rs.getBinaryStream(1);
							in.read(img);
						}	
						icon=new ImageIcon(img);
						image.setIcon(icon);				


					} catch (SQLException | IOException e1) {
						e1.printStackTrace();
					}


				}
			}
		});


	}

	void reset(){
		name.setText("");
		id.setText("");
	}


	public static void main(String[] args) {
		new ImageStoring();
	}

}
