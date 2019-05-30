
public class hellovar_02 {

	public static void main(String[] args) {

		int numl = 2147483647; // 2147483647
		
		// 연산 결과가 절대 (-)가 나올수 없는 상황인데
		// 결과가(-)로 표현되는 상황은
		// 기억장소에 저장할 수 있는 삾의 범위를 넘어선 오류 상황이다.
		System.out.println(numl + 1);

		// 맨끝에 영 소문자 L
		long num2 = 303450239939234931l;
		long num3 = 2147483647l;
		System.out.println(num3 + 1);
	}
}
