package com.greedy.section04.overflow;

public class Application1 {

	public static void main(String[] args) {
		
		/* 오버플로우 */
		/* 자료형 별 값의 최대 범위를 벗어나는 경우
		 * 발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
		 * */
		byte num1 = 127;
		
		System.out.println("num1 : " + num1);				//127 : byte의 최대 저장 범위
		
		num1++;												//1 증가
		
		System.out.println("num1 overflow : " + num1);		//-128 : byte의 최소 저장 범위
		
		/* 언더플로우 */
		/* 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다. */
		byte num2 = -128;
		
		System.out.println("num2 : " + num2);				//-128 : byte의 최소 저장 범위
		
		num2--;												//1감소
		
		System.out.println("num2 underflow : " + num2);		//127 : byte의 최대 저장 범위
		
		/* 이러한 오버플로우 혹은 언더플로우가 발생한다고 해서 컴파일 에러나 런타임 에러가 발생하지는 않는다. (논리적 에러)
		 * 그렇기에 최대값 혹은 최소값 범위를 고려해서 코드를 작성해야 한다.
		 * */
		
		int firstNum = 1000000;
		int secondNum = 700000;
		int multi = firstNum * secondNum;
		
		System.out.println("firstnum * secondNum = " + multi);
		
		/* 해결 방법 */
		/* 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
		long longMulti = firstNum * secondNum;
		
		System.out.println("longMulti : " + longMulti);
		
		long result = (long) firstNum * secondNum;
		
		System.out.println("result : " + result);
	}

}















