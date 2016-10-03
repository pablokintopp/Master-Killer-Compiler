import java.awt.Dimension;
import java.awt.Scrollbar;

import java.awt.List;

import java.awt.Rectangle;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;

public class tokenGUI extends JFrame {
	private List lstLog = new List();

	private String msg = "";

	public tokenGUI() {
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(400, 300));
		this.setTitle("Leitor de Tokens");
		this.setVisible(true);
		lstLog.setBounds(new Rectangle(5, 5, 385, 260));
		this.getContentPane().add(lstLog, null);

	}

	public static void main(String args[]) {
		new tokenGUI();
	}

	public void setMsg(String msg) {
		this.msg = msg;
		if (!msg.equals("")) {
			lstLog.add(msg);
			setMsg("");
		}
	}
}
