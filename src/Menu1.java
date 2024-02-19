import java.awt.Color;
import java.awt.EventQueue;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 window = new Menu1();
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
	public Menu1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 707, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuItem opcion1, opcion2, opcion3, rojo, verde, blanco;
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Menu");
		JMenu subJMenu = new JMenu("Sub Menu");
		opcion1 = new JMenuItem("opcion 1");
		opcion2 = new JMenuItem("opcion 2");
		opcion3 = new JMenuItem("opcion 3");
		rojo = new JMenuItem("Color rojo");
		verde = new JMenuItem("Color verde");
		blanco = new JMenuItem("Color blanco");
		
		//Añadimos al menu sus opciones
		menu.add(opcion1);
		menu.add(opcion2);
		menu.add(opcion3);
		
		//Añadimos al submenu sus opciones
		subJMenu.add(rojo);
		subJMenu.add(verde);
		subJMenu.add(blanco);
		
		//Al menu principal le añadimos el submenu
		menu.add(subJMenu);
		
		//Añadimos el menu a la barra menu
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		ActionListener colorAction = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem item = (JMenuItem)e.getSource();
				if (item.getText().equals("Color rojo")) {
					System.out.println(item.getText());
					frame.getContentPane().setBackground(new Color(255,0,0));
				}
				if(item.getText()=="Color verde") {
					frame.getContentPane().setBackground(new Color(0,255,0));
				}
				if(item.getText()=="Color blanco") {
					frame.getContentPane().setBackground(null);
				}
				
			}
		};
		rojo.addActionListener(colorAction);
		verde.addActionListener(colorAction);
		blanco.addActionListener(colorAction);
		
		
	}
}
