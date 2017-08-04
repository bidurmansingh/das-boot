package com.boot.datamock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@Configuration
public class MockData implements CommandLineRunner {
	@Autowired
	private ShipwreckRepository shipwreckRepository;

	@Override
	public void run(String... arg0) throws Exception {
		Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
		Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12,
				138.44, 1994);
		Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef",
				"FAIR", 50, 44.12, 138.44, 1994);
		this.shipwreckRepository.save(Arrays.asList(a, b, c));

	}

	/*
	 * private static Map<Long, Shipwreck> wrecks = new HashMap<Long,
	 * Shipwreck>(); private static Long idIndex = 3L;
	 * 
	 * //populate initial wrecks static { Shipwreck a = new Shipwreck(1L,
	 * "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
	 * wrecks.put(1L, a); Shipwreck b = new Shipwreck(2L, "Thistlegorm",
	 * "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
	 * wrecks.put(2L, b); Shipwreck c = new Shipwreck(3L, "S.S. Yongala",
	 * "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50,
	 * 44.12, 138.44, 1994); wrecks.put(3L, c);
	 * 
	 * }
	 * 
	 * public static List<Shipwreck> list() { return new
	 * ArrayList<Shipwreck>(wrecks.values()); }
	 * 
	 * public static Shipwreck create(Shipwreck wreck) { idIndex += idIndex;
	 * wreck.setId(idIndex); wrecks.put(idIndex, wreck); return wreck; }
	 * 
	 * public static Shipwreck get(Long id) { return wrecks.get(id); }
	 * 
	 * public static Shipwreck update(Long id, Shipwreck wreck) { wrecks.put(id,
	 * wreck); return wreck; }
	 * 
	 * public static Shipwreck delete(Long id) { return wrecks.remove(id); }
	 */
}
