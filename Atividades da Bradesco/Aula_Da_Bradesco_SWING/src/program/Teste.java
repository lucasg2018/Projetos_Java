package program;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setLayout(null);

		JButton button = new JButton("Bot�o");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bot�o acionado");
				
			}
		});
		
		button.setBounds(40, 130, 250, 20);
		frame.add(button);
		
		frame.setVisible(true);
	}

}
