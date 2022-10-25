import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;
	
	private SLogin sLogin;
	
	public LoginDialog(Frame parent, String title, String msg) {
		super(parent, title, true); //model dialog 
		this.setLayout(null);
		this.setSize(300, 350);
		
		
		LayoutManager layoutManager = new FlowLayout(); // 행, 열, 수직 간격, 수평 간격
		this.setLayout(layoutManager);
		
		JPanel loginInputPanel = new JPanel();
		loginInputPanel.setLayout(new GridLayout (2, 2, 3, 3));
		
		JLabel lbId = new JLabel("아이디");
		loginInputPanel.add(lbId);
		
		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		loginInputPanel.add(this.tfId);
		
		JLabel lbPassword = new JLabel("비밀번호");
		
		loginInputPanel.add(lbPassword);
	
		
		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		loginInputPanel.add(this.tfPassword);
		
		loginInputPanel.setVisible(true);
		this.getContentPane().add(loginInputPanel); // 부모에다가 panel 추가 
		
		JButton btLogin = new JButton("로그인");
		this.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		
	
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		
		VLogin vLogin = sLogin.login(id);
		if (vLogin == null) {
			// ���̵� ���ų� ��й�ȣ�� Ʋ�Ƚ��ϴ�.
		}

	}
	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}
