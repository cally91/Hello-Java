
public class HeilloString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ""(큰따옴표, DQM)로 몪여있는 모든것들은
		// 문자열이라고 부른다.
		// 코딩용어에서는 (string literal)이라고한다.
		// 문자열은 보이는그대로가 값(식이 아니다)이다

		// 30 +40은 숫자 30과 40을 덧셈하라는 식이다.
		// "30+40"은 문자열 30+40 인 값 이다.

		// 아래 명령문은 30+40의 연산결과인 70을 콘솔에 표현
		System.out.println(30 + 40);
		// 아래 명령문은 30+40 이라는 문자열을 콘솔에 표현
		System.out.println("30+40");

		System.out.println("대한민국만세");
		// 문자열끼리는 유일하게 덧셈연산을 수행할수 있는데
		// 문자열들을 연결하라는 것이다.
		System.out.println("대한민국" + "만세");
	}

}
