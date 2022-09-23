import java.util.*;
class incre {
	public static int minimumAnswer(List<Integer> A, int N) {
		int[] brr = new int[N];
		int l = 1;
		brr[0] = A.get(0);
		for (int i = 1; i < N; i++) {
			if (brr[l - 1] <= A.get(i)) {
				brr[l] = A.get(i);
				l++;
			}
		}
		return A.size()-l;
	}
	static public void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		int res=minimumAnswer(arr, n);
		System.out.println(res);
		sc.close();
	}
}
