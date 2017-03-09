package ufoabstract;

import static org.junit.Assert.*;

import org.junit.Test;

import ufoabstract.EnemyShip;
import ufoabstract.EnemyShipFactory;
import ufoabstract.UFOEnemyShip;
import ufoabstract.UFOEnemyShipFactory;

public class UFOEnemyShipBuildingTest {

	@Test
	public void testMakeEnemyUFOShip() {
		EnemyShip theEnemyShip = null;
		EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
		assertNotNull ("Should not be null", shipPartsFactory);
		theEnemyShip = new UFOEnemyShip(shipPartsFactory);
		theEnemyShip.setName("UFO Grunt Ship");
	}

}
