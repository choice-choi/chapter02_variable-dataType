package org.joonzis.ex;

public class Ex07_castingEx {
	public static void main(String[] args) {
		
		// 1. 줄 바꿈
		System.out.println();
		
		// 2. 숫자 + 연산자 : 산술 연산자
		System.out.println(1 + 1);
        System.out.println(1.5 + 1);

        // 3. 문자열 + 연산자 : 연결 연산자
        System.out.println("Hello " + "World");
		
        // 4. 숫자 문자 + 연산자 : 연결 연산자(순서대로 진행)
        System.out.println(100 + "원"); 
        System.out.println(100 + 100 + "원"); 
        System.out.println("$" + 100); 
        System.out.println("$"+ 100 + 100);
        // 문자열이 먼저 나오면 뒤 숫자도 문자열로 인식
        
	}

}
