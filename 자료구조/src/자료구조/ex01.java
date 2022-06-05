package 자료구조;

import java.util.Scanner;

public class ex01 {
	
	public static int  gauss2(int a) {
		
		int result;		//결과물을 담을 변수
		
		result=(1+a)*(a/2);   //맨앞과 맨끝 정수의 합을 구하는 방식
		
		
		//계산할 정수 개수가 짝수일때: 결과값 = ( 맨 끝 숫자 + 1 ) * ( 전체 정수 개수 / 2 )
		if(a%2!=0) {
			result+=(a+1)/2;
		}
		
		/*
		 * 1~6까지의 합이라면 ( 1 + 6 ) * ( 6 / 2 ) = 21 가 된다.

 

만약 나열된 정수 개수가 홀수면 가운데 한 개의 숫자가 남는다.

 

그래서 이렇게 남은 한 개의 숫자는 if문을 통해 추가해줄 수 있도록 만들었다.

 
		 * 
		 */
		return result;
		
	}

	public static void main(String[] args) {
		
	
	System.out.println(gauss2(5));
		
	}

}
