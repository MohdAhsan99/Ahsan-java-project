import java.util.Objects;
import java.util.Scanner;

public class Bookmain {

	public static void main(String[] args) {
		Book[] bk = new Book[5];
		int cnt = 0;
		int choice;
		// int choice1;
		do {
			System.out.println("1.Add Records");
			System.out.println("2.Display");
			System.out.println("3.Modify");
			System.out.println("4.Delete");
			System.out.println("5.Search");
			System.out.println("6.Count");
			System.out.println("0.Exit");

			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				int id = sc.nextInt();
				String name = sc.next();
				double price = sc.nextDouble();
				bk[cnt] = new Book(id, name, price);
				cnt++;
				break;

			case 2:
				for (int i = 0; i < cnt; i++) {
					// if(!(Objects.isNull(bk[i])))

					System.out.println(bk[i]);
				}
				break;

			case 3:
				System.out.println("Enter Book id");
				int id1 = sc.nextInt();
				int set = 0;
				for (int i = 0; i < cnt; i++) {
					if (bk[i].getBid() == id1) {
						set = i;
					}

					else {
						System.out.println("id not found");
					}
				}

				int choice1;
				do {

					System.out.println("1.book Id");
					System.out.println("2.Book Name");
					System.out.println("3.Book Price");
					System.out.println("0.Exit");
					choice1 = sc.nextInt();

					switch (choice1) {
					case 1:
						int id2 = sc.nextInt();
						bk[set].setBid(id2);
						break;

					case 2:
						String name2 = sc.next();
						bk[set].setBname(name2);
						break;
					case 3:
						double price2 = sc.nextDouble();
						bk[set].setPrice(price2);
						break;
					}

				} while (choice1 != 0);
				break;

			case 4:
				System.out.println("Enter Book id");
				int id3 = sc.nextInt();
				Book temp = null;
				for (int i = 0; i < cnt; i++) {
					if (bk[i].getBid() == id3) {
						temp = bk[i];
						bk[i] = bk[i + 1];
						bk[i + 1] = temp;
						cnt--;
					}
				}
				break;

			case 5:
				System.out.println("Enter Book id");
				int id4 = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (bk[i].getBid() == id4) {
						System.out.println(bk[i]);
					}
				}
				break;
			case 6:
				System.out.println(cnt);
				break;
			}
		} while (choice != 0);
	}
}
