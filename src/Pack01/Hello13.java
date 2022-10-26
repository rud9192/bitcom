package Pack01;

//다중 for 문
public class Hello13 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + i + " " + j + "]");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();

		int width = 4, height = 3;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(i * width + j);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.printf("%2d ", i * width + j);
			}
			System.out.println();
		}
		System.out.println();

		System.out.printf("호랑이\n");
		System.out.printf("코끼리\n");
		System.out.printf("코%d끼%d리%d\n", 777, 888, 999);
		System.out.printf("%d\n", 3);
		System.out.printf("%4d\n", 3);
		System.out.printf("%04d\n", 3);

		int a = 10, b = 20, c = 30;
		String s = String.format("무궁화:%d 소나무:%d 백합:%d", 10, 20, 30);
		System.out.println("output : " + s);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++)
				System.out.println("apple");
			System.out.println("banana");
		}

	}
}
