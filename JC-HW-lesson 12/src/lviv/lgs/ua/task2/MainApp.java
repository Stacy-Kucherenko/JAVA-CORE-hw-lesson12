package lviv.lgs.ua.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
	enum Seasons {
		WINTER, SPRING, SUMMER, FALL;
	}

	enum Months {

		DECEMBER(Seasons.WINTER, 31), JANUARY(Seasons.WINTER, 30), FEBRUARY(Seasons.WINTER, 28),
		MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30), MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30),
		JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31), SEPTEMBER(Seasons.FALL, 30), OCTOBER(Seasons.FALL, 31),
		NOVEMBER(Seasons.FALL, 30);

		Seasons seasons;
		int days;

		private Months(Seasons seasons, int days) {
			this.seasons = seasons;
			this.days = days;
		}

		public Seasons getSeasons() {
			return seasons;
		}

		public int getDays() {
			return days;
		}

	}

	static void menu() {

		System.out.println("Натисніть 1, щоб пеевірити чи існує такий місяць ");
		System.out.println("Натисніть 2, щоб вивести всі місяці які мають таку саму кількість днів ");
		System.out.println("Натисніть 3, щоб вивести на екран всі місяці які мають меншу кількість днів ");
		System.out.println("Натисніть 4, щоб вивести на екран всі місяці які мають більшу кількість днів ");
		System.out.println("Натисніть 5, щоб вивести на екран наступну пору року ");
		System.out.println("Натисніть 6, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 7, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 8, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");

	}

	public static void main(String[] args) {
//		Months[] mas = Months.values();
		ArrayList <Months> arrayMonthList = new ArrayList <Months>();
		Scanner sc = new Scanner(System.in);
		
		for  (Months monthsValue : Months.values()) {
			arrayMonthList.add(monthsValue);
		}
		
		ArrayList <Seasons> arraySeasonList = new ArrayList <Seasons>();
		
		for (Seasons seasonsValue : Seasons.values()) {
			arraySeasonList.add(seasonsValue);
		}

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Enter month ");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = areMonthsExist(arrayMonthList, months);
				if (!flag) {
					System.out.println("Month dosen't exist ");
				}
				break;
			}
			case "2": {
				System.out.println("Enter number of days per month ");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = false;

				for (Months m : arrayMonthList) {
					if (m.getDays() == days) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month wich has such number of the days dosen't exist");
				}
				break;

			}
			case "3": {
				System.out.println("Enter number of the days  ");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = false;

				for (Months m : arrayMonthList) {
					if (m.getDays() < days) {
						System.out.println(m);
						flag = true;
					}
					if (!flag) {
						System.out.println("Month with less amount of the days dosen't exist");
					}
					break;
				}
			}
			case "4": {
				System.out.println("Enter number of the days  ");
				sc = new Scanner(System.in);
				int days = sc.nextInt();

				boolean flag = false;

				for (Months m : arrayMonthList) {
					if (m.getDays() > days) {
						System.out.println(m);
						flag = true;
					}
					if (!flag) {
						System.out.println("Month with bigger amount of the days dosen't exist");
					}

				}

			}
			case "5": {
				System.out.println("Enter season  ");
				sc = new Scanner(System.in);
				String seasons = sc.nextLine().toUpperCase();
				//Seasons[] season = Seasons.values();
				Seasons season1 = Seasons.valueOf(seasons);
				int ordinal = season1.ordinal();

				if (ordinal == arraySeasonList.size()) {
					ordinal = -1;
				}
				System.out.println(arraySeasonList.get(ordinal + 1));

			}
			case "6": {
				System.out.println("Enter season  ");
				sc = new Scanner(System.in);
				String seasons = sc.nextLine().toUpperCase();
				//Seasons[] season = Seasons.values();
				Seasons season1 = Seasons.valueOf(seasons);
				int ordinal = season1.ordinal();

				if (ordinal == arraySeasonList.size()-1) {
					ordinal = 0;
				}
				System.out.println(arraySeasonList.get(ordinal - 1));

			}

			case "7": {

				System.out.println("Months with paired number of days: ");

				for (Months m : arrayMonthList) {
					if (m.getDays() % 2 == 0) {

						System.out.println(m);

					}
				}
			}
			case "8": {

				System.out.println("Months with unpaired number of days: ");

				for (Months m : arrayMonthList) {
					if (m.getDays() % 2 != 0) {

						System.out.println(m);

					}
				}
			}
			case "9": {

				System.out.println("Enter month ");
				sc = new Scanner(System.in);
				String months = sc.next().toUpperCase();

				boolean flag = false;
				for (Months m : arrayMonthList) {
					if (m.toString().equals(months) && m.getDays() % 2 == 0) {
						System.out.println("This month has paired number of days ");
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("This month has unpaired number of days ");
				}
			}

			}
		}
	}

	private static boolean areMonthsExist(ArrayList<Months> arrayMonthList, String months) {
		boolean flag = false;

		for (Months m : arrayMonthList) {
			if (m.name().equals(months)) {
				System.out.println("Month is exist ");
				flag = true;
			}
		}
		return flag;
	}

}
