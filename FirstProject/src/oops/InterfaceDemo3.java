package oops;

interface Player{
	public final static int MAX_POWER = 100;
	int MIN_POWER = 10;
	
	public static void showCharacteristics() {
		System.out.println("Max power is " + MAX_POWER);
		System.out.println("Min power is " + MIN_POWER);
	}
	
	public abstract void kick();
	void punch();
	void attack();
	void defense();
	
	default void entry() {
		System.out.println("Player will enter walking in some style");
	}
	default void startPower() {
		System.out.println("Starting health of each player will be " + MAX_POWER);
	}
}

interface StarPlayer{
	int MAX_POWER = 100;
	void hide();
	void fly();
}

interface HybridPlayer extends Player, StarPlayer{
	default void testHybridPlayer() {
		System.out.println(Player.MAX_POWER);
		System.out.println(StarPlayer.MAX_POWER);
	}
}

class Bison implements Player, StarPlayer{
	
	int power;

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Dhalsim implements Player{
	
	int power;

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}

class Ryu implements Player{
	
	int power;

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		Bison bison = new Bison();
		bison.getClass().getSimpleName();
	}

}
