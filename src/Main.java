import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] Dtypes = {"Rock", "Lazur", "Crimson"};
		Scanner input = new Scanner(System.in);
		String drgnType = insertDrgnType(input, Dtypes);
		Dragon dragon = createDragon(input, drgnType);
		play(input, dragon);
	}
	
	public static Dragon createDragon(Scanner input, String drgnType) {
		Dragon dragon = null;
		System.out.println("Enter age of your dragon");
		int age = Integer.parseInt(input.nextLine());
		System.out.println("Enter size of your dragon (Enter 'Big' or 'Middle' or 'Small')");
		String size = input.nextLine();
		if(drgnType.equals("Crimson")) {
			dragon = new CrimsonDragon(size, age);
		} else if(drgnType.equals("Lazur")) {
			dragon = new LazurDragon(size, age);
		} else if(drgnType.equals("Rock")) {
			dragon = new RockDragon(size, age);
		}
		return dragon;
	}
	
	public static void play(Scanner input, Dragon dragon) {
		while(true) {
			System.out.println("Choose action to perform (Enter 'Attack' or 'Fly' or Details)");
			System.out.println("Or enter 'exit' to stop the program");
			String action = input.nextLine();
			if(action.equals("Attack")) {
				dragon.performAttack();
			} else if(action.equals("Fly")) {
				dragon.performfly();
			} else if(action.equals("exit")) {
				exitGame();
			} else if (action.equals("Details")) {
				dragon.getDragonInfo();
			} else {
				System.out.println("I can't " + action);
			}
			
		}
	}
	
	public static String insertDrgnType(Scanner input, String[] Dtypes) {
		boolean isDragon = false;
		String drgnType = null;
		while(!isDragon) {
			System.out.println("Choose your dragon! (Enter 'Crimson' or 'Lazur' or 'Rock')");
			drgnType = input.nextLine();
			if(drgnType.equals("exit")) {
				exitGame();
			}
			for (int i = 0; i < Dtypes.length; i++) {
				if(Dtypes[i].equals(drgnType)) {
					isDragon = true;
				}
			}
			if(!isDragon) {
				System.out.println("No such dragon, try again or enter 'exit'");
			}
		}
		return drgnType;
	}
	
	public static void exitGame() {
		System.exit(0);
	}

}
