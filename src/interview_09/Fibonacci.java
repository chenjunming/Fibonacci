package interview_09;
/**
 * 
 * @ClassName: Fibonacci 
 * @Description:斐波那契数列
 * @author cjm
 * @date 
 */
public class Fibonacci {
	public static long fibonacci(int n) {
		int[] array = {0,1};
		if(n<0)throw new RuntimeException("n不能为0");
		if(n<2) {
			return array[n];
		}
		// n>=2
		long first = 0;
		long two = 1;
		long result = 0;
		for(int i=2;i<=n;i++) {
			result = first+two;
			first = two;
			two = result;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(100));
	}
}
