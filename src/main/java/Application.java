import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("=========== Play Game ================");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.nextLine();
			if(input.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
		}
		
	}
}
