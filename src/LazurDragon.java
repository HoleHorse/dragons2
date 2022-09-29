
public class LazurDragon extends Dragon {

	public LazurDragon(String size, int age) {
		super(size, age);
		this.setFlyBehaviour(new FlyFloat());
		this.setAttackBehaviour(new AttackWithIce());
	}

	@Override
	public void getDragonInfo() {
		System.out.println("Dragon race: Lazur dragon, a dragon whose breath can make any most living thing freeze to death");
		System.out.println("Lazur dragons prefer to live in cold places, they can be seen flying in Northern areas");
		System.out.println("Age:" + this.getAge());
		System.out.println("Size:" + this.getSize());
	}

}
