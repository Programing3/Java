package com.greedy.section05.typecasting;

public class Application2 {

	public static void main(String[] args) {
		
		/* 강제 형변환 */
		/* 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
		 * 예) (바꿀자료형) 값
		 * */
		
		/* 자동 형변환 규칙의 반대 상황이 강제 형변환이 필욯나 상황이다.
		 * 1. 강제 형변환 규칙
		 * 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
		 * 1-2. 실수를 정수로 변경할 때 강제 형변환이 필요하다.
		 * 1-3. 문자형을 int 미만 크기의 변수에 저장할 대 강제 형변환이 필요하다.
		 * 1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
		 * */
		
		/* 1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
		 * 1-1-1. 정수 끼리 강제 형변환 */
		long lnum = 8L;
		int inum = (int) lnum;		//데이터 손실 가능성을 컴파일러가 알려준다. 하지만 (int)로 강제 형변환 하면 (int)형으로 변경된다.
		short snum = (short) inum;
		
		/* 1-1-2. 실수끼리의 강제 형변환 */
		double dnum = 8.0;
		float fnum = (float) dnum;
		
		/* 1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다. */
		float fnum2 = 4.0f;
		long lnum2 = (long) fnum2;	//float는 4byte, long은 8byte임에도 자동 형변환 불가(소수점 자리 이하 데이터 손실)
		
		double dnum2 = 10.5;
		int inum2 = (int) dnum2;
		
		System.out.println("inum2 : " + inum2);
		
		/* 1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다. */
		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) ch;	//동일한 2byte이지만 부호비트로 인해 값의 최대값 최소값 범위가 다르다.
		
		int num = 97;
		
		char ch2 = (char) num;
		
		System.out.println("ch2 : " + ch2);
		
		/* 1-4. 논리형은 강제 형변환 규칙에서도 제외된다. */
//		boolean isTrue = true;
//		byte b = (byte) isTrue;
//		short s = (short) isTrue;
//		int i = (int) isTrue;
//		float f = (float) isTrue;
//		double d = (double) isTrue;
//		char c = (char) isTrue;
		
		
	}

}
