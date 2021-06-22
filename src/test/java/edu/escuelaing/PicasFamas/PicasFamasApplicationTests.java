package edu.escuelaing.PicasFamas;

import edu.escuelaing.PicasFamas.Game.PicasYFamasGame;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class PicasFamasApplicationTests {
	@Test
	public void testShouldGetPicas(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("4321");
		game.checkNumber();
		assertTrue(game.getPicas()==1);
	}

	@Test
	public void testShouldGetPicas2(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("4301");
		game.checkNumber();
		assertTrue(game.getPicas()==2);
	}

	@Test
	public void testShouldGetFamas(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("3222");
		game.checkNumber();
		assertTrue(game.getFamas()==1);
	}

	@Test
	public void testShouldGetFamas2(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("3022");
		game.checkNumber();
		assertTrue(game.getFamas()==2);
	}

	@Test
	public void testShouldGetWinsate(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("3000");
		game.checkNumber();
		assertTrue(game.isWinState());
	}

	@Test
	public void testShouldNotGetWinSate(){
		PicasYFamasGame game= new PicasYFamasGame();
		game.setTryNumber("3000");
		game.setNumber("3222");
		game.checkNumber();
		assertTrue(!game.isWinState());
	}
}

