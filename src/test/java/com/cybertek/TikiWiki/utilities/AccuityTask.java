package interviewTasks;

public class AccuityTask {

	public static void steps(int t, int e) {
		boolean noMatch = true;
		int outputFlag=0;
		outer: for (int x = 0; x <= t; x++) {
			for (int y = 0; 2 * y <= t; y++) {
				int steps = 2 * y + x;
				if ((2 * x + y == t) && ((x + y) % e == 0)) {
					System.out.println(x + y);
					outputFlag++;
					break outer;
				}
			}
		}
		if (outputFlag==0) {
			System.out.println("-1");
		}

	}
	
	
	public static void increase() {
		int n=4, d=2;
		int couter=0;
		int[]a= {1,3,5,0};
		for(int i=0;i<n-1;i++) {
			if(a[i]>=a[i+1]) {
				while(a[i+1]<=a[i]) {
					a[i+1]+= d;
					couter++;
				}
			}
		}
		System.out.println(couter);
	}

	public static void main(String[] args) {
//		steps(10, 2);
		//increase();
		String a = new String("abc");
		String b = new String("abc");
		System.out.println(a.equals(b));
	}

}
