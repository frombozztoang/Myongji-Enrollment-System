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
	
	public LoginDialog(Frame parent) {
		super(parent);
		
		LayoutManager layoutManager = new GridLayout(3, 2);
		this.setLayout(layoutManager);
				
		JLabel lbId = new JLabel("���̵�");
		this.add(lbId);
		
		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		this.add(this.tfId);
		
		JLabel lbPassword = new JLabel("��й�ȣ");
		this.add(lbPassword);
		
		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		this.add(this.tfPassword);
		
		JButton btLogin = new JButton("�α���");
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