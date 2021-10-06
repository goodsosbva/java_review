package concreteClass;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

}
