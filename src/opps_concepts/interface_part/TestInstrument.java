package opps_concepts.interface_part;

public class TestInstrument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Playable interf = null;
			
			interf = new Guitar();
			interf.play();
			
			interf = new Piano();
			interf.play();
	}

}
