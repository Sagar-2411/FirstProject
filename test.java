package ArrayBesic;

public class test {

	public static void main(String[] args) {
		
		int arr[]= new int[5];
		arr[0]=11;
		arr[1]=22;
		arr[2]=33;
		arr[3]=44;
		arr[4]=55;
		
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	
	
	//OR
	
	for(int i=0; i<5;i++) {
		System.out.println(arr[i]);
	}
		//OR  for loop
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
				}
		
		// OR  for each loop
		for (int i : arr) {
			System.out.println(i);
		}

}
}
