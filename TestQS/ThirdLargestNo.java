package JavaPrograms.TestQS;


    //3rd largest no in Array
public class ThirdLargestNo{  

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int max = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {

				if (a[i]>a[j]) {
					max = a[j];
					a[j] = a[i];
					a[i] = max;
				                  }
		                                                         	}
		                                                      }
		for (int i : a) {
			System.out.println(i);
		
		}
		System.out.println();
		System.out.println(a.length-2);
	}}

}
