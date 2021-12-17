import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="BMI.class" width="900" height="900"></applet>*/
public class BMI extends Applet implements ActionListener{
	TextField t1 = new TextField(10);
	TextField t2 = new TextField(10);
	Label l1 = new Label("Please enter your weight in kg: ");
	Label l2 = new Label("Please enter your height in cm: ");
	Button b1 =new Button("Calculate my BMI");
	Label l3 = new Label("");

	public void init(){
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent  ae){
		if(ae.getSource()==b1){
			float n1 = Float.parseFloat(t1.getText());
			float n2 = Float.parseFloat(t2.getText());
			 l3.setLocation(200,200);
			l3.setSize(600,600);
			 l3.setFont(new Font("TimesRoman", Font.BOLD, 25));
		float bmi = (100*100*n1)/(n2*n2);
		if(bmi < 18.5) {
			 l3.setForeground(Color.blue);
				l3.setText("Your BMI is: "+bmi+" You are underweight");
			}else if (bmi < 25) {
			 l3.setForeground(Color.green);
				l3.setText("Your BMI is: "+bmi+" You are normal");
			}else if (bmi < 30) {
			 l3.setForeground(Color.yellow);
				l3.setText("Your BMI is: "+bmi+" You are overweight");
			}else {
			 l3.setForeground(Color.red);
				l3.setText("Your BMI is: "+bmi+" You are obese");
			}
		}
	}
}
