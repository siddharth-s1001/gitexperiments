package Assignment1;

class SmallestLargest {
	public static void main(String[] args) {
		int arr[] = { 10, 4, 9, 17, 24 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println("The Smallest Number = " + arr[0]);
		System.out.println("The Largest Number = " + arr[length - 1]);
	}
}
