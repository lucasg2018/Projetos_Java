package program;

import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Meu frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setLayout(null);

		// JFileChooser - Permite que o usuário escolha um ou mais arquivos
		/*
		 * JFileChooser fileChooser = new JFileChooser(); int retorno =
		 * fileChooser.showOpenDialog(null);
		 * 
		 * if(retorno == JFileChooser.APPROVE_OPTION) { File file =
		 * fileChooser.getSelectedFile(); System.out.println(file.toString()); }else {
		 * System.out.println("Nenhum arquivo foi selecionado"); }
		 */

		// JProgressBar - Marca o progresso
		/*
		 * JProgressBar progressBar = new JProgressBar(JProgressBar.HORIZONTAL, 1, 100);
		 * progressBar.setValue(50); progressBar.setBounds(20, 130, 300, 20);
		 * frame.add(progressBar);
		 */

		// JScrollBar - Cria uma barra de rolagem
		/*
		 * JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 1, 0, 100);
		 * scrollBar.setBounds(20, 130, 300, 20); frame.add(scrollBar);
		 */

		// JOptionPane - Abre uma janela
		/*
		 * JOptionPane.showMessageDialog(null, "Olá usuário!");
		 */

		// JTextArea - Semelhante ao JTextField, só que com mais linhas
		/*
		 * JTextArea textArea = new JTextArea(); textArea.setBounds(20, 130, 300, 40);
		 * frame.add(textArea);
		 */

		// JComboBox - Semelhante ao Jlist, mas só permite selecionar um item
		/*
		 * String[] itens = { "item1", "item2" }; JComboBox comboBox = new
		 * JComboBox(itens); comboBox.setBounds(20, 130, 300, 20); frame.add(comboBox);
		 */

		// JList - Criando uma lista
		/*
		 * String[] itens = { "item1", "item2" }; JList list = new JList(itens);
		 * list.setBounds(20, 130, 300, 40); frame.add(list);
		 */

		// JRadioButton - Cria um votões de rádio
		/*
		 * JRadioButton radioButton = new JRadioButton("radioButton");
		 * radioButton.setBounds(20, 130, 300, 20); frame.add(radioButton);
		 */

		// JCheckBox - Cria uma caixinha pra marcar
		/*
		 * JCheckBox checkBox = new JCheckBox("checkBox:"); checkBox.setBounds(20, 130,
		 * 300, 20); frame.add(checkBox);
		 */

		// JMenuBar - Cria a barra do menu
		// JMenu - Cria a um menu
		// JMenuItem - Cria um item dentro do menu
		/*
		 * JMenuBar menuBar = new JMenuBar(); JMenu menu = new JMenu("Menu"); JMenuItem
		 * menuItem = new JMenuItem("Olá");
		 * 
		 * menu.add(menuItem); menuBar.add(menu);
		 * 
		 * frame.setJMenuBar(menuBar);
		 */

		// JButton - Criando um botão
		/*
		 * JButton button = new JButton("Botão"); button.setBounds(40, 130, 300, 20);
		 * frame.add(button);
		 */

		// JPasswordField - Criando caixa texto escondidas por asterisco.
		/*
		 * JPasswordField password = new JPasswordField(); password.setBounds(40, 130,
		 * 300, 20); frame.add(password);
		 */

		// JText - Para inserir uma caixa de texto
		/*
		 * JTextField textField = new JTextField(); textField.setBounds(40, 130, 360,
		 * 40); frame.add(textField);
		 */

		// Label - JLabel
		/*
		 * JLabel label = new JLabel("Hello World", JLabel.CENTER); label.setBounds(40,
		 * 130, 360, 40); frame.add(label);
		 */

		frame.setVisible(true);
	}
}