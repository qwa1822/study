package �ڷᱸ��;

import java.util.Scanner;

public class ex01 {
	
	public static int  gauss2(int a) {
		
		int result;		//������� ���� ����
		
		result=(1+a)*(a/2);   //�Ǿհ� �ǳ� ������ ���� ���ϴ� ���
		
		
		//����� ���� ������ ¦���϶�: ����� = ( �� �� ���� + 1 ) * ( ��ü ���� ���� / 2 )
		if(a%2!=0) {
			result+=(a+1)/2;
		}
		
		/*
		 * 1~6������ ���̶�� ( 1 + 6 ) * ( 6 / 2 ) = 21 �� �ȴ�.

 

���� ������ ���� ������ Ȧ���� ��� �� ���� ���ڰ� ���´�.

 

�׷��� �̷��� ���� �� ���� ���ڴ� if���� ���� �߰����� �� �ֵ��� �������.

 
		 * 
		 */
		return result;
		
	}

	public static void main(String[] args) {
		
	
	System.out.println(gauss2(5));
		
	}

}
