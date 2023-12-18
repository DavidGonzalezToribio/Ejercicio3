package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.Component;

public class ejercicio1Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEdes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio1Frame frame = new ejercicio1Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio1Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JTextArea txtrWefwefwef = new JTextArea();
		txtrWefwefwef.setText("Nombre");
		contentPane.add(txtrWefwefwef);
		
		txtEdes = new JTextField();
		txtEdes.setText("EDES");
		txtEdes.setToolTipText("");
		contentPane.add(txtEdes);
		txtEdes.setColumns(10);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		splitPane.setResizeWeight(1.0);
		contentPane.add(splitPane);
	}

}
