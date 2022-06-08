package loop;

public class Star2 {

	public static void main(String[] args) {
		/*
		 * 	****
		 * 	***
		 * 	**
		 *  *
		 *     	
		 * */
		for (int i = 4; i >= 1; i--) {		// 아까와 반대로 4 3 2 1 줄어 들어야한다.
			for (int j = 1; j <= i; j++) {  // 그래서 i의 값을 줄어들게 하고 j는 커지게 만들어주었다.
				System.out.print("*");
			} 
			System.out.println();
		}
	}

}
