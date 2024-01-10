package buisness;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.util.ArrayList;


import business.Buergeramt;

public class BuergeramtTest {
	 private Buergeramt buergeramt;

	    @BeforeEach
	    void ausfuellen() throws Exception {
	        buergeramt = new Buergeramt("Bürgerbüro", 9.00f, 17.00f, "Querenburg Höhe 256", new String[]{"Hauptwohnsitz", "Nebenwohnsitz"});
	    }
	   @Test
	    void TextBuergeramt() {
	    	assertTrue(()->this.buergeramt.getGeoeffnetVon()==9.00f);
	    	assertTrue(this.buergeramt.getGeoeffnetBis()==17.00f);
	    	assertTrue(this.buergeramt.getStrasseHNr().equals("Querenburg Höhe 256"));
	    	
//	    	
//	    	ArrayList<String> dienstleistungen = buergeramt.getDienstleistungen();
//	        assertEquals(2, dienstleistungen.size());
//	        assertEquals("Service1", dienstleistungen);
//	        assertEquals("Service2", dienstleistungen);
	        
	    }
}
