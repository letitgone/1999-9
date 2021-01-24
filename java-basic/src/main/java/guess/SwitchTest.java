package guess;

/**
 * @Author ZhangGJ
 * @Date 2021/01/24 20:45
 */
public class SwitchTest {

	public static void main(String[] args) {
		int a = 1;
		switch (a) {
			case 2:
				System.out.println("print 2 ");
			case 1:
				System.out.println("print 1 ");
			default:
				System.out.println("first default print");
			case 3:
				System.out.println("print 3");
		}

		String param = null;
		switch (param) {
			case "param":
				System.out.println("print param");
				break;
			case "String":
				System.out.println("print String");
				break;
			case "null":
				System.out.println("print null");
				break;
			default:
				System.out.println("second default print");
		}
	}
}
