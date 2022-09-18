package org.joonzis.ex;

public class Ex08_parsing {
	public static void main(String[] args) {
		/*
		 * 
		 */

		
		String strAge = "20";
		String strHeight = "190.5";
		
		// 위 두 변수를 각각 정수 및 실수로 변환하여 출력
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
	
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");

		// 문자열의 비교는 "==" 으로 비교하지 않는다.
		// equals 메소드를 이용해서 비교한다.
		
		String s1 = "aaa";
		String s2 = s1;
		String s3 = new String("aaa");
		
		if(s1==s2) {
			System.out.println("같다!");	
		}else {
			System.out.println("다르다");
		}
		
		if(s1==s3) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다");
		}
		
		//문자열만! 주소값을 물어보는게 아니라 값을 물어보는 메소드, equals//
		if(s1.equals(s3)) {
			System.out.println("같다!");
		}else {
			System.out.println("다르다");
		}
		
		/*
		 * == 연산자의 경우 객체의 주소 값을 비교
		 * .equals() 메소드의 경우 대상의 값 자체를 비교
		 *   
		 * CBV(Call By Value) - 원시 데이터 타입(주소 값을 가지지 않는다)
		 * CBR(Call By Reference) - 참조 객체(클래스 등)
		 *   
		 */
		
		
	}

}
