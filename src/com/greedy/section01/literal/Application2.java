package com.greedy.section01.literal;

public class Application2 {

	public static void main(String[] args) {
		
		/* 값을 직접 연산하여 출력할 수 있다.
		 * 값의 형태에 따라 사용할 수 있는 연산자의 종류가 달라진다.
		 * */
		
		/* 1. 숫자와 숫자의 연산 */
		/* 1-1. 정수와 정수의 연산 */
		/* 수학에서 사용하는 사칙연산이 다 사용 가능하다. 나머지를 구하는 연산 mod를 추가로 사용할 수 있다. */
		System.out.println("===================== 정수와 정수의 연산 ================== ");
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		
		/* 1-2. 실수와 실수의 연산 */
		/* 실수끼리의 연산도 정수끼리의 연산과 동일한 연산을 수행할 수 있다. */
		System.out.println("====================== 실수와 실수의 연산 ==================");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		
		/* 1-3. 정수와 실수의 연산 */
		/* 정수와 실수의 연산은 모든 산술연산자 사용 가능하다. 
		 * 결과는 무조건 실수가 나온다. */
		System.out.println("====================== 정수와 실수의 연산 ===================");
		System.out.println(123 + 1.0);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		/* 2. 문자의 연산 */
		/* 문자는 내부적으로 숫자로 인식하기 때문에 모든 산술 연산 사용이 가능하다. */
		System.out.println("====================== 문자와 문자의 연산 ====================");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		
		/* 2-2. 문자와 정수의 연산 */
		System.out.println("====================== 문자와 정수의 연산 =====================");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2);
		
		/* 2-3. 문자와 실수의 연산 */
		System.out.println("====================== 문자와 실수의 연산 ======================");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0);
		
		/* 3. 문자열의 연산 */
		/* 3-1. 문자열과 문자열의 연산 */
		/* 문자열은 '+' 연산외에 다른 연산을 사용하지 못한다.
		 * 문자열의 '+' 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
		 * */
		System.out.println("====================== 문자열과 문자열의 연산 ====================");
		System.out.println("hello" + "world");
//		System.out.println("hello" - "world");  에러 발생
//		System.out.println("hello" * "world");  에러 발생
//		System.out.println("hello" / "world");  에러 발생
//		System.out.println("hello" % "world");  에러 발생
		
		/* 3-2. 문자열과 다른 형태의 값 연산 */
		/* 연산 결과는 문자열 이어 붙이기가 된다. */
		System.out.println("====================== 문자열과 다른 형태의 값 연산 =================");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		/* 주의사항 */
		/* 숫자로된 문자열의 + 연산은 더하기가 아닌 문자열 이어 붙이기가 된다. */
		System.out.println(123 + 123);
		System.out.println("123" + "123");
		
		/* 4. 논리 형태의 값 연산 */
		/* 논리값과 논리값에 대한 연산 */
		/* 논리값은 산술 연산이 불가능하다. */
//		System.out.println(true + false);  에러남
//		System.out.println(true - false);  에러남
//		System.out.println(true * false);  에러남
//		System.out.println(true / false);  에러남
//		System.out.println(true % false);  에러남
		
		/* 논리값과 다른 자료형의 연산 */
//		System.out.println(true + 1);  에러남
//		System.out.println(true + 1.0);  에러남
//		System.out.println(true + 'a');  에러남
		System.out.println(true + "a");
		System.out.println("a" + true);
	}

}












