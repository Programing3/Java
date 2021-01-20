package com.greedy.section01.literal;

public class Application3 {

	public static void main(String[] args) {
		
		/*문자열 합치기(concat) 테스트 */
		System.out.println("============ 두개의 문자열 합치기 ============");
		System.out.println(9 + 9);
		System.out.println("9" + 9);
		System.out.println(9 + "9");
		System.out.println("9" + "9");
		
		System.out.println("============ 세 개의 문자열 합치기 ============");
		System.out.println(9 + 9 + "9");
		System.out.println(9 + "9" + 9);
		System.out.println("9" + 9 + 9);
		
		/* 괄호 안의 연산을 먼저 수행한다. */
		System.out.println("9" + (9 + 9));
		
		System.out.println("============ 10과 20의 사칙 연산 결과 ==========");
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		System.out.println(10 / 20);
		System.out.println(10 % 20);
		
		/* 문자열 합치기 응용 */
		System.out.println("============ 10과 20의 사직연산 결과 보기 좋게 출력 ===========");
		/* 10과 20의 합 : 30
		 * 10과 20의 차 : -10
		 * 10과 20의 곱 : 200
		 * 10과 20의 나누기한 몫 : 0
		 * 10과 20의 나누기한 나머지 : 10
		 * 
		 * 이렇게 출력 되도록 작성해 보세요.
		 * */
		int sum = 10 + 20;
		int minus = 10 - 20;
		int multiple = 10 * 20;
		int divide = 10 / 20;
		int per = 10 % 20;
		
		System.out.println("10과 20의 합 : " + sum);
		System.out.println("10과 20의 차 : " + minus);
		System.out.println("10과 20의 곱 : " + multiple);
		System.out.println("10과 20의 나누기한 몫 : " + divide);
		System.out.println("10과 20의 나누기한 나머지 : " + per);
	}

}
