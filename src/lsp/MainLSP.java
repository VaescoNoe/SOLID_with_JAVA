package lsp;

import java.util.ArrayList;
import java.util.List;

public class MainLSP {

	public static void main(String[] args) {
		testGrassCourt();
	}

	public static void testGrassCourt() {
		List<GrassCourt> courts = new ArrayList<GrassCourt>();
		courts.add(new WimblendonCourt());
		courts.add(new MallorcaOpen());
		
		for (GrassCourt court : courts) {
			court.cutGrass();
		}
	}
	
	/*
	 * ERROR:
	public static void testCourt() {
		List<Court> courts = new ArrayList<Court>();
		courts.add(new WimblendonCourt());
		courts.add(new AustraliaOpenCourt());
		courts.add(new RolandGarrosCourt());

		for (Court court : courts) {
			court.cutGrass();
		}
	}
	*/
}
