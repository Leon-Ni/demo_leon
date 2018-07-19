package sort;

public class QuickSort {

	public void Qsort(int a[], int low, int high) {
		if (low >= high) {
			return;
		}
		int first = low;
		int last = high;
		int key = a[first];/* 用字表的第一个记录作为枢轴 */

		while (first < last) {
			while (first < last && a[last] >= key) {
				--last;
			}
			a[first] = a[last];/* 将比第一个小的移到低端 */

			while (first < last && a[first] <= key) {
				++first;
			}
			a[last] = a[first];/* 将比第一个大的移到高端 */
		}
		
		a[first] = key;/* 枢轴记录到位 */
		Qsort(a, low, first - 1);/* 递归左边*/
		Qsort(a, first + 1, high);/* 递归右边*/
	}

	public static void main(String[] args) {

		int a[] = { 11, 33, 22, 55, 44, 77, 66, 88 };
		QuickSort quickSort = new QuickSort();
		quickSort.Qsort(a, 0, 7);
		for(int i=0;i<8;i++) {
			System.out.println(a[i]);
		}
	}

}
