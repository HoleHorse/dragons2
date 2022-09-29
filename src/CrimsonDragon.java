
public class CrimsonDragon extends Dragon {

	public CrimsonDragon(String size, int age) {
		super(size, age);
		this.setFlyBehaviour(new FlyWithWings());
		this.setAttackBehaviour(new AttackWithFire());
	}

	@Override
	public void getDragonInfo() {
		System.out.println("Dragon race: Crimson dragon, a mighty dragon, who can fly and has fiery breath that can melt rocks with ease");
		System.out.println("Usually they nest in mountain's caves in a hot or warm areas and hunt animals or even other dragons");
		System.out.println("Age:" + this.getAge());
		System.out.println("Size:" + this.getSize());
	}

}
