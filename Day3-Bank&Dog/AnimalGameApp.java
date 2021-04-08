package day3_task1;

import java.util.Scanner;

public class AnimalGameApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in.close();
		Dog d1 = new Dog();
		System.out.println("-----Dog App-----");
		while (true) {
			System.out.println("Enter your dog name");
			String name = in.next();
			System.out.println("Enter your dog age");
			int age = in.nextInt();
			System.out.println("Enter your dog weight");
			int weight = in.nextInt();
			d1.setName(name);
			d1.setAge(age);
			d1.setWeight(weight);
			System.out.println("Starting to play with " + d1.getName());
			while (true) {
				System.out.println("Enter your choice\n1.feed?\n2.play\n3.exit");
				int choice = in.nextInt();
				switch (choice) {
				case 1:
					d1.doFeedAnimal();
					System.out.println("Hurray!! your " + d1.getName() + " is now " + d1.getWeight() + "kgs");
					break;
				case 2:
					d1.playGames();
					break;
				case 3:
					System.out.println("Bye Bye...");
					System.exit(0);
				}
			}
		}

	}
}
