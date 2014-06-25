package util;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class graph extends Woordveld implements ActionListener {
	private JPanel jp;
	private JPanel wf;
	private JPanel size;
	private JPanel veldd;
	private JButton cf;
	private JTextField tf;
	private JButton sw;
	private JTextField col;
	private JTextField row;
	private JFrame jf;
	private JTextField[][] veld;


	public graph(){

		jf = new JFrame();
		jf.setBounds(0,0,765,650);									// create screen
		Container c = jf.getContentPane();
		c.setBackground(Color.orange);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);


		jp = new JPanel(new GridLayout(2,1));
		jp.setBounds(600,0,150,100);
		tf = new JTextField();
		sw = new JButton("Search Word");					// create button and field to search word
		jp.add(tf);
		jp.add(sw);
		jf.add(jp);

		size = new JPanel(new GridLayout(1,2));
		size.setBounds(600,100,150,50);
		row = new JTextField();								// create field for making the wordpuzzle field
		col = new JTextField();
		size.add(row);
		size.add(col);
		jf.add(size);

		wf = new JPanel(new GridLayout(1,1));
		wf.setBounds(600,150,150,50);
		cf = new JButton("Create field");					// create button to create word puzzle field
		wf.add(cf);
		jf.add(wf);

		jf.setVisible(true);


		cf.addActionListener(this);
		sw.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ex) {
		Object source = ex.getSource();
		if(source == cf){
			int coll = (int) Double.parseDouble(col.getText());
			int roww = (int) Double.parseDouble(row.getText());
			try {
				readFile(roww,coll);
				Woordboom s = new Woordboom();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			veldd = new JPanel();
			veldd.setLayout(new GridLayout(roww,coll));
			veldd.setBounds(0,0,600,600);
			veldd.setBackground(Color.orange);
			veld = new JTextField[roww][coll];
			for(int i=0; i<res.length; i++){
				for(int j=0; j<res[0].length; j++){
					veld[i][j] = new JTextField(String.valueOf(res[i][j]));
					veld[i][j].setHorizontalAlignment(JTextField.CENTER);
					veld[i][j].setEditable(false);
					veldd.add(veld[i][j]);
				}
			}


			jf.add(veldd);
			jf.setVisible(true);

		}
		if(source == sw){
			String L = tf.getText();
			
			try {
				Zoeken.Start(L);
				if(Zoeken.ycoord != null && Zoeken.xcoord != null){
				for(int j=0; j<Zoeken.ycoord.length; j++){
				veld[Zoeken.ycoord[j]][Zoeken.xcoord[j]].setBackground(Color.green);
                                }
    }
			}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}



	public static void main(String[] args) {
		new graph();

	}




}
