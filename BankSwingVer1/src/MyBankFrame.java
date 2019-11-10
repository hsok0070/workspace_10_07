import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyBankFrame extends JFrame {

	private JButton savingBtn;
	private JButton loamBtn;
	private JButton myBankCheckBtn;
	private JTextField textField;
	private CardLayout cardLayout;
	private JPanel savingCreatPane;
	private JPanel loamCreatPane;
	private JPanel myBankCreatPane;
	private JPanel centerCardLayoutJPanel;
//	private ActionListener btnHandle = new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			
//		}
//	};
	
	public MyBankFrame() {
		super("MyBank 환영");
		savingBtn = new JButton();
		loamBtn = new JButton();
		myBankCheckBtn = new JButton();
		textField = new JTextField();
		cardLayout = new CardLayout();
		centerCardLayoutJPanel = new JPanel(cardLayout); //CardLayout
		//3개의 panel
		savingCreatPane = new SavingCreatePanel();
		loamCreatPane = new loamCreatePanel();
		myBankCreatPane = new myBankCheckPanel();
			centerCardLayoutJPanel.add(savingCreatPane,"1");
			centerCardLayoutJPanel.add(loamCreatPane,"2");
			centerCardLayoutJPanel.add(myBankCreatPane,"3");
			
		
		JPanel leftPanel = new JPanel(new GridLayout(3, 1));
		leftPanel.add(savingBtn);
		leftPanel.add(loamBtn);
		leftPanel.add(myBankCheckBtn);

		
		this.add(BorderLayout.WEST, leftPanel);
		//this.add(textField);
		this.add(centerCardLayoutJPanel);
		
		savingBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//textField.setText(savingBtn.getText());
						//textField.setText(e.getActionCommand());
						cardLayout.show(centerCardLayoutJPanel, "1");
					}
				});
		loamBtn.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						textField.setText(e.getActionCommand());
					}
				});
		myBankCheckBtn.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						textField.setText(e.getActionCommand());
					}
				});
		
		init();
	};
	
	
	
	private void init() { //초기화버튼
		setBounds(10, 10, 500, 400);
		savingBtn.setText("적금통장개설");
		loamBtn.setText("대출통장개설");
		myBankCheckBtn.setText("내통장조회");
		textField.setText(savingBtn.getText());
	};
	
	public class SavingCreatePanel extends JPanel{
		public SavingCreatePanel() {
			add(new Label("SavingCreatePanel"));
		}
	}
	
	public class loamCreatePanel extends JPanel{
		public loamCreatePanel() {
			add(new TextField("SavingCreatePanel"));
		}
	}
	
	public class myBankCheckPanel extends JPanel{
		public myBankCheckPanel() {
			add(new TextArea("SavingCreatePanel"));
		}
	}

	public static void main(String[] args) {
		MyBankFrame fream = new MyBankFrame();
		fream.setVisible(true);
	}

}

