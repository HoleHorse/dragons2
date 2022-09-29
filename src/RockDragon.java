
public class RockDragon extends Dragon {

	public RockDragon(String size, int age) {
		super(size, age);
		this.setFlyBehaviour(new FlyNot());
		this.setAttackBehaviour(new AttackWithRocks());
	}

	@Override
	public void getDragonInfo() {
		System.out.println("Dragon race: Rock dragon, they are said to live mostly underground, since they can't fly, where they create comlicated labyrinths");
		System.out.println("To attack invaders or hunt, they store rocks in their stomach and release them out of their mouth with enormous speed");
		System.out.println("Age:" + this.getAge());
		System.out.println("Size:" + this.getSize());
	}

}
