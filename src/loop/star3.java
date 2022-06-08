package loop;

public class star3 {

	public static void main(String[] args) {
		/*
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 * */
		//일단 4줄
		for (int i = 1; i <= 4; i++) {
			//공백이 1 2 3 4 필요하다
			for (int j = 1; j <= i; j++) {    
				System.out.print(" ");
			//아까 별찍기 처럼 4 3 2 1 조건식 만들어주기
			}	for (int k = 4; k >= i; k--) {    
				System.out.print("*");
		}
				System.out.println(); //줄바꿈
		
		}//for	
	}

}
