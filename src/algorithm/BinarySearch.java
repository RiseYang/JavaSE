package algorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arry = new int[] { 1, 3, 5, 7, 8, 9 };
		int resultPosition = binary_search(arry, 5);
		System.out.println("5�������λ�ã�" + resultPosition);

	}

	public static int binary_search(int[] arry, int dest) {
		// ���������͵� �ߵ�
		int low = 0;
		int high = arry.length - 1;
		// �Ƚϸߵʹ�С
		while (low < high) {
			// ȡ�м�ֵ
			int mid = low + (high - low) / 2;
			if (arry[mid] < dest) {
				high = mid - 1;
			} else if (arry[mid] > dest) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
