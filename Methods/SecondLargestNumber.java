package javainterviewquestiones.array;

public class SecondLargestNumber {

	public static int seclargest(int arr[]) {
		int largest = -1;
		int seclarge = -1;
		for (int num : arr) {
			if (num > largest) {
				seclarge = largest;
				largest = num;
			} else if (num > seclarge && num < largest) {
				seclarge = num;
			}

		}
		return seclarge;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,56,98,55};
		System.out.println("Second largest number is "+ seclargest(a));

	}

}
