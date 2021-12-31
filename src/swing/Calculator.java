package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	double num1, num2, tempResult;
	String operation, answer;
	private JFrame frame;
	private JTextField textField;
	private JButton btnEtoTheX, btn1overX, btnSine, btnCosine, btnTangent, btnArcSine, btnArcCosine, btnArcTangent, btnClear, btnDot, btnBackSpace,
		btnPlus, btnSub, btnMult, btnDiv, btnEquals, btnLOG, btnLN, btnCustomPower, btnPercent, btnCubed, btnSquared, btnSqrt, btnFactorial, btnPosOrNeg,
		btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 403, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(87, 0, 220, 20);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		textField.setBounds(38, 20, 315, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnSqrt = new JButton("\u221A");
		btnSqrt.setEnabled(false);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnSqrt.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSqrt.setBounds(35, 74, 62, 40);
		frame.getContentPane().add(btnSqrt);
		
		btnEtoTheX = new JButton("e^x");
		btnEtoTheX.setEnabled(false);
		btnEtoTheX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnEtoTheX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEtoTheX.setBounds(99, 74, 62, 40);
		frame.getContentPane().add(btnEtoTheX);
		
		btnSine = new JButton("Sin"); //done in radians
		btnSine.setEnabled(false);
		btnSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnSine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSine.setBounds(163, 74, 62, 40);
		frame.getContentPane().add(btnSine);
		
		btnCosine = new JButton("Cos"); //done in radians
		btnCosine.setEnabled(false);
		btnCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnCosine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCosine.setBounds(227, 74, 62, 40);
		frame.getContentPane().add(btnCosine);
		
		btnTangent = new JButton("Tan"); //done in radians
		btnTangent.setEnabled(false);
		btnTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnTangent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTangent.setBounds(291, 74, 62, 40);
		frame.getContentPane().add(btnTangent);
		
		btnArcSine = new JButton("Sinh"); //done in radians
		btnArcSine.setEnabled(false);
		btnArcSine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnArcSine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnArcSine.setBounds(163, 116, 62, 40);
		frame.getContentPane().add(btnArcSine);
		
		btnClear = new JButton("Clr");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBounds(163, 158, 62, 40);
		frame.getContentPane().add(btnClear);
		
		btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(163, 200, 62, 40);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(163, 242, 62, 40);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(163, 284, 62, 40);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(227, 284, 62, 40);
		frame.getContentPane().add(btn3);
		
		btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) {
		          textField.setText(textField.getText() + btnDot.getText());
		        }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(227, 326, 62, 40);
		frame.getContentPane().add(btnDot);
		
		btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(227, 242, 62, 40);
		frame.getContentPane().add(btn6);
		
		btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(227, 200, 62, 40);
		frame.getContentPane().add(btn9);
		
		btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if (textField.getText().length() > 0) {
				StringBuilder string = new StringBuilder(textField.getText());
				string.deleteCharAt(textField.getText().length() - 1);
				backSpace = string.toString();
				textField.setText(backSpace);
				
			}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnBackSpace.setBounds(227, 158, 62, 40);
		frame.getContentPane().add(btnBackSpace);
		
		btnArcCosine = new JButton("Cosh"); //done in radians
		btnArcCosine.setEnabled(false);
		btnArcCosine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnArcCosine.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnArcCosine.setBounds(227, 116, 62, 40);
		frame.getContentPane().add(btnArcCosine);
		
		btnArcTangent = new JButton("Tanh"); //done in radians
		btnArcTangent.setEnabled(false);
		btnArcTangent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnArcTangent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnArcTangent.setBounds(291, 116, 62, 40);
		frame.getContentPane().add(btnArcTangent);
		
		btnDiv = new JButton("/");
		btnDiv.setEnabled(false);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv.setBounds(291, 158, 62, 40);
		frame.getContentPane().add(btnDiv);
		
		btnMult = new JButton("*");
		btnMult.setEnabled(false);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(291, 200, 62, 40);
		frame.getContentPane().add(btnMult);
		
		btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(291, 242, 62, 40);
		frame.getContentPane().add(btnSub);
		
		btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(291, 284, 62, 40);
		frame.getContentPane().add(btnPlus);
		
		btnEquals = new JButton("=");
		btnEquals.setEnabled(false);
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//the result of operations are rounded to 5 decimal places
				if (operation=="+") {
					num2 = Double.parseDouble(textField.getText());
					tempResult = num1 + num2;
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer);
				}
				else if (operation=="-") {
					num2 = Double.parseDouble(textField.getText());
					tempResult = num1 - num2;
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer);
				}
				else if (operation=="*") {
					num2 = Double.parseDouble(textField.getText());
					tempResult = num1 * num2;
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer);
				}
				else if (operation=="/") {
					num2 = Double.parseDouble(textField.getText());
					tempResult = num1 / num2;
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer);
				}
				else if (operation=="%") {
					tempResult = num1/100;
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer); 
				}
				else if (operation=="x^y") {
					num2 = Double.parseDouble(textField.getText());
					tempResult = Math.pow(num1, num2);
					answer = String.format("%.5f", tempResult); //format rounds to 5 decimal places
					textField.setText(answer);
				}
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(291, 326, 62, 40);
		frame.getContentPane().add(btnEquals);
		
		btn1overX = new JButton("1/x");
		btn1overX.setEnabled(false);
		btn1overX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				double temp = 1 / num1;
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btn1overX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn1overX.setBounds(35, 158, 62, 40);
		frame.getContentPane().add(btn1overX);
		
		btnLOG = new JButton("Log"); //log base 10
		btnLOG.setEnabled(false);
		btnLOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnLOG.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLOG.setBounds(35, 116, 62, 40);
		frame.getContentPane().add(btnLOG);
		
		btnCustomPower = new JButton("x^y");
		btnCustomPower.setEnabled(false);
		btnCustomPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
				
			}
		});
		btnCustomPower.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCustomPower.setBounds(35, 200, 62, 40);
		frame.getContentPane().add(btnCustomPower);
		
		btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("Hit '='");
				operation="%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPercent.setBounds(99, 158, 62, 40);
		frame.getContentPane().add(btnPercent);
		
		btnCubed = new JButton("x^3");
		btnCubed.setEnabled(false);
		btnCubed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				temp = temp * temp * temp;
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnCubed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCubed.setBounds(35, 242, 62, 40);
		frame.getContentPane().add(btnCubed);
		
		btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(99, 200, 62, 40);
		frame.getContentPane().add(btn7);
		
		btnSquared = new JButton("x^2");
		btnSquared.setEnabled(false);
		btnSquared.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				temp = temp * temp;
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnSquared.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSquared.setBounds(35, 284, 62, 40);
		frame.getContentPane().add(btnSquared);
		
		btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(99, 242, 62, 40);
		frame.getContentPane().add(btn4);
		
		btnFactorial = new JButton("n!");
		btnFactorial.setEnabled(false);
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(textField.getText());
				double factorial = 1;
				while (temp > 1) {
					factorial = factorial * temp;
					temp--;
				}
				textField.setText("");
				textField.setText(textField.getText() + factorial);
			}
		});
		btnFactorial.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFactorial.setBounds(35, 326, 62, 40);
		frame.getContentPane().add(btnFactorial);
		
		btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(99, 284, 62, 40);
		frame.getContentPane().add(btn1);
		
		btnPosOrNeg = new JButton("+/-");
		btnPosOrNeg.setEnabled(false);
		btnPosOrNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Double.parseDouble(String.valueOf(textField.getText())); //another way this could be accomplished is: 																						Double.parseDouble(textField.getText());
				temp = temp * -1;
				textField.setText("");
				textField.setText(String.valueOf(temp)); // if the other method was used, this would have to be textField.setText(textField.getText() + temp);
			}
		});
		btnPosOrNeg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPosOrNeg.setBounds(99, 326, 62, 40);
		frame.getContentPane().add(btnPosOrNeg);
		
		btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
				 
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(163, 326, 62, 40);
		frame.getContentPane().add(btn0);
		
		JRadioButton rdbtnON = new JRadioButton("ON");
		rdbtnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn0.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnPlus.setEnabled(true);
				btnSub.setEnabled(true);
				btnMult.setEnabled(true);
				btnDiv.setEnabled(true);
				btnEquals.setEnabled(true);
				btnLOG.setEnabled(true);
				btnLN.setEnabled(true);
				btnCustomPower.setEnabled(true);
				btnFactorial.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnSquared.setEnabled(true);
				btnCubed.setEnabled(true);
				btnPercent.setEnabled(true);
				btnPosOrNeg.setEnabled(true);
				btnDot.setEnabled(true);
				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				btnSine.setEnabled(true);
				btnCosine.setEnabled(true);
				btnTangent.setEnabled(true);
				btnArcSine.setEnabled(true);
				btnArcCosine.setEnabled(true);
				btnArcTangent.setEnabled(true);
				btnEtoTheX.setEnabled(true);
				btn1overX.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnON);
		rdbtnON.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnON.setBounds(33, 52, 41, 20);
		frame.getContentPane().add(rdbtnON);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				btn0.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnPlus.setEnabled(false);
				btnSub.setEnabled(false);
				btnMult.setEnabled(false);
				btnDiv.setEnabled(false);
				btnEquals.setEnabled(false);
				btnLOG.setEnabled(false);
				btnLN.setEnabled(false);
				btnCustomPower.setEnabled(false);
				btnFactorial.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnSquared.setEnabled(false);
				btnCubed.setEnabled(false);
				btnPercent.setEnabled(false);
				btnPosOrNeg.setEnabled(false);
				btnDot.setEnabled(false);
				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				btnSine.setEnabled(false);
				btnCosine.setEnabled(false);
				btnTangent.setEnabled(false);
				btnArcSine.setEnabled(false);
				btnArcCosine.setEnabled(false);
				btnArcTangent.setEnabled(false);
				btnEtoTheX.setEnabled(false);
				btn1overX.setEnabled(false);
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 10));
		rdbtnOff.setBounds(70, 54, 45, 17);
		frame.getContentPane().add(rdbtnOff);
		
		btnLN = new JButton("ln"); //natural log
		btnLN.setEnabled(false);
		btnLN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double temp = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText() + temp);
			}
		});
		btnLN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLN.setBounds(99, 116, 62, 40);
		frame.getContentPane().add(btnLN);
	}
}
