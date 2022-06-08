package loop;

public class Star4 {

	public static void main(String[] args) {
		/*		*
		 * 	   ***
		 *    *****
		 *   *******
		 * */
		//1.4줄 만들어주기
		for(int i = 1; i <= 4; i++) {
			//2.공백  3 2 1
			for(int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			//3.별이 1 3 5 7개 출력 될 수 있게 만들기
			for(int k = 1; k<=(i*2-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
