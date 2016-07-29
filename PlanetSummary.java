package ORCONOUTSIDEGAME;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PlanetSummary extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3369821680103545767L;
	public static JTextArea jta;
	private Planet currentPlanet;

	public PlanetSummary(){
		jta = new JTextArea(10,10);
		add(jta);
		/*
		 * In this area we need to code all the elements that we want to see in the planet summary box.
		 * Namely, name, variables food and credits, 5 slider bars for the planet areas of focus,
		 * (construction,security,finance,agriculture,research)
		 * a transport troops button, maybe a graphic of the planet and a way to choose what you are building
		 * with construction
		 */
	}


	
/*
 * room for a bunch of getter and setter features
 * 
 * 
 * 
 */
public static void setJTA(String s){
	jta.setText(s);
}



/*
 * 
 * Handlers for controlling all the buttons, sliders and such
 *  
 * 
 */










}

