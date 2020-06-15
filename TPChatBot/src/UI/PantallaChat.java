package UI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PantallaChat extends JFrame{
	
	private JPanel contentPane;
	private JTextArea areaChat;
	private JTextArea areaEscribir;
	private JButton botonIngresar;
	private JScrollPane scroll;
	

	public PantallaChat() {
		super("Chat Bot");
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		areaChat= new JTextArea(20,50);
		areaChat.setEditable(false);
		
		areaEscribir= new JTextArea(1,40);
		
		botonIngresar= new JButton("Enviar");
		
		scroll= new JScrollPane(
			areaChat,
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
		);
		
		contentPane= new JPanel();
		contentPane.add(scroll);
		contentPane.add(areaEscribir);
		contentPane.add(botonIngresar);
		contentPane.setBackground(Color.RED);
		getContentPane().add(contentPane);
		
		setVisible(true);
	}
}
