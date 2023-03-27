package opps_concepts.polymorphismMain;

//----Run Time Polymorhpism-----using
//----Using type Super/parent Class reference refers to Sub/Child Class Reference

import opps_concepts.polymorphismBean.Compartment;
import opps_concepts.polymorphismBean.SecondAcCompartment;
import opps_concepts.polymorphismBean.SleeperCompartment;
import opps_concepts.polymorphismBean.ThirdAcCompartment;

public class RailCoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  SleeperCompartment  s1 = new SleeperCompartment ();
		  SleeperCompartment  s2 = new SleeperCompartment ();
		  SleeperCompartment  s3 = new SleeperCompartment ();
		  SleeperCompartment  s4 = new SleeperCompartment ();

		  ThirdAcCompartment  b1 = new ThirdAcCompartment();
		  ThirdAcCompartment  b2 = new ThirdAcCompartment();
		  ThirdAcCompartment  b3 = new ThirdAcCompartment();

		  SecondAcCompartment  a1 = new SecondAcCompartment();
		  SecondAcCompartment  a2 = new SecondAcCompartment();


		    Compartment[] compartments = new Compartment[7];

		     compartments[0] = s1;
		     compartments[1] = s2;
		     compartments[2] = s3;
		     compartments[3] = s4;
		     compartments[4] = b1;
		     compartments[5] = b2;
		     compartments[6] = a1;

		    for(Compartment c: compartments) {
		    	c.display();
		     }

	}

}
