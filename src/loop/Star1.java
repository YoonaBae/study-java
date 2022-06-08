package loop;

public class Star1 {

	public static void main(String[] args) {
		/*
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 *
		 * */
		for (int i = 1; i <= 4; i++) {			//바깥 for문으로 4줄 만들기
			for (int j = 1; j <= i; j++) {		//안쪽 for문으로 * 찍기인데 *이 1~4까지 갯수가 많아 져야한다.
				System.out.print("*");			//그래서 1~4를 만족하는 조건식 넣어주었다.
			}
			System.out.println(); // 줄바꿈
		}
	}

}
