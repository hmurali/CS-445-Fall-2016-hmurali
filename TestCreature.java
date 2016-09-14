import java.util.Scanner;
public class TestCreature {
    public static final int THING_COUNT = 10; 
	public static final int CREATURE_COUNT = 6; 
	
	public static void main(String[] args) {
		System.out.println("Things: ");
		Scanner input = new Scanner(System.in);
		String[] thing_arr = new String[THING_COUNT];
		
		for(int j = 0; j < THING_COUNT; j++){
			System.out.print("Enter a thing: ");
			thing_arr[j] = input.nextLine();
		}
		
		for(int j = 0; j < thing_arr.length; j++){
			System.out.println(thing_arr[j]);
		}
		
		System.out.println("Creatures: ");
		Scanner scan = new Scanner(System.in);
		String[] creature_arr = new String[CREATURE_COUNT];
		
		for(int i = 0; i < CREATURE_COUNT; i++){
			System.out.print("Name a creature: ");
			creature_arr[i] = scan.nextLine();
		}
		
		for(int i = 0; i < creature_arr.length; i++){
			System.out.println(creature_arr[i]);
		}
	}
}
