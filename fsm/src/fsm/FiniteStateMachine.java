package fsm;

import java.util.Scanner;

public class FiniteStateMachine {

	Scanner sc = new Scanner(System.in);

	private states state;
	private int comparator;
	private int floorNumber;

	void start() throws InterruptedException {
		state = states.first_floor;
		comparator = 1;

		while (true) {
			
			System.out.println("Enter the floor you want to go:");
			floorNumber = sc.nextInt();
			init();

			/* switch (state) {

			case first_floor:
				init();
				//comparator = 1;
				break;

			case second_floor:
				init();
				//comparator = 2;
				break;

			} */
		}
	}

	void init() throws InterruptedException {
		if (floorNumber == comparator) {
			System.out.println("Lift already in " + comparator + " floor");

		} else {
			if (floorNumber == 2) {
				state = states.second_floor;
				goToSecondFloor();
				comparator = 2;

			} else {
				state = states.first_floor;
				goToFirstFloor();
				comparator = 1;

			}
		}
	}

	void goToFirstFloor() throws InterruptedException {

		System.out.println("Go to first floor");
		Thread.sleep(2000);
	}

	void goToSecondFloor() throws InterruptedException {
		System.out.println("Go to second floor");
		Thread.sleep(2000);
		
	}

}
