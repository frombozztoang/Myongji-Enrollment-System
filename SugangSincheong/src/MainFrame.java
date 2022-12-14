import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		// attributes
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// components
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);		
		
		SugnasincheongPanel sugnasincheongPanel = new SugnasincheongPanel();
		this.add(sugnasincheongPanel, BorderLayout.CENTER);
		
		LoginDialog loginPanel = new LoginDialog(this, "Login Dialog", "아이디와 비밀번호를 입력해 주세요.");
		loginPanel.setVisible(true);

	}
}
