package opps_concepts.interface_part;

import static  opps_concepts.interface_part.PhysicalConstants.grav_Const;
import static  opps_concepts.interface_part.PhysicalConstants.Sp_light_In_vacc;
import static  opps_concepts.interface_part.PhysicalConstants.std_Grav_Acc;
public class PhysConstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PhysConsts obj = new PhysConsts();
//		
//		obj.EnergyMC();
//		obj.ForceG();
//		obj.distOfFallingObj();
		
		//------using static import and without interface implementation-----
		StaticImport stimp = new StaticImport();
		
		stimp.EnergyMC();
		stimp.ForceG();
		stimp.distOfFallingObj();
	}

}
//class PhysConsts implements PhysicalConstants{
//	
//	void EnergyMC() {
//		double m = 30;
//		double E =  m * (Sp_light_In_vacc*Sp_light_In_vacc);
//		System.out.println("Energy: "+ E + " ");
//	}
//	void ForceG() {
//		
//		double m1 = 100;
//		double m2 = 50;
//		double radius = 20;
//		double sqrOf = radius * radius;
//		double F = grav_Const*(m1 * m2)/sqrOf;
//		
//		System.out.println("Force: "+ F +" ");
//	}
//	void distOfFallingObj() {
//		
//		double d = 0.5 * std_Grav_Acc;
//		System.out.println("Distance of Falling Object: " + d +"");
//	}
//}
class StaticImport {
	
	void EnergyMC() {
		double m = 30;
		double E =  m * (Sp_light_In_vacc*Sp_light_In_vacc);
		System.out.println("Energy: "+ E + " ");
	}
	void ForceG() {
		
		double m1 = 100;
		double m2 = 50;
		double radius = 20;
		double sqrOf = radius * radius;
		double F = grav_Const*(m1 * m2)/sqrOf;
		
		System.out.println("Force: "+ F +" ");
	}
	void distOfFallingObj() {
		
		double d = 0.5 * PhysicalConstants.std_Grav_Acc;
		System.out.println("Distance of Falling Object: " + d +"");
	}
}