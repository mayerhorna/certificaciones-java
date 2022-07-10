package com.limati.javat_jdbc_demo_distritos.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class SolucionFrame extends JFrame {

	public SolucionFrame() {

		add(new Escritorio());

		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu();
		JMenuItem menuFileExit = new JMenuItem();

		menuFile.setText("Archivo");
		menuFileExit.setText("Salir");

		// Add action listener.for the menu button
		menuFileExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolucionFrame.this.windowClosed();
			}
		});
		menuFile.add(menuFileExit);
		menuBar.add(menuFile);

		setTitle("SolucionFrame");
		setJMenuBar(menuBar);
		setSize(new Dimension(750, 430));

		// Add window listener.
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				SolucionFrame.this.windowClosed();
			}
		});
	}

	/**
	 * Shutdown procedure when run as an application.
	 */
	protected void windowClosed() {

		// TODO: Check if it is safe to close the application

		// Exit application.
		System.exit(0);
	}
}
