
public abstract class Dragon {
	private int age;
	private String size;
	private FlyBehaviour flyBehaviour;
	private AttackBehaviour attackBehaviour;
	
	public Dragon(String size, int age) {
		this.age = age;
		this.size = size;
	}
	
	public void performfly() {
		flyBehaviour.fly();
	}
	
	public void performAttack() {
		attackBehaviour.attack();
	}
	
	public abstract void getDragonInfo();

	public int getAge() {
		return age;
	}
	public String getSize() {
		return size;
	}
	public FlyBehaviour getFlyBehaviour() {
		return flyBehaviour;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	public void setAttackBehaviour(AttackBehaviour attackBehaviour) {
		this.attackBehaviour = attackBehaviour;
	}
}
