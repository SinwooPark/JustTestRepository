package array;

public class Test9 {

	public static void main(String[] args) {
		int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
		int[] max = new int[4];
		int[] min = new int[4];
		int tmpMax = Integer.MIN_VALUE;
		int tmpMin = Integer.MAX_VALUE;
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array[i].length ; j++) {
				if(array[i][j] > tmpMax) {
					tmpMax = array[i][j];
				}
				if(array[i][j] < tmpMin) {
					tmpMin = array[i][j];
				}
			}
		}
		System.out.println("가장 큰 값 : " + tmpMax);
		System.out.println("가장 작은 값 : " + tmpMin);
		/*for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length -1; j++) {
				if(array[i][j] > array[i][j+1]) {
					if(max[i] < array[i][j]) {
						max[i] = array[i][j];
					}
				} else {
					if(max[i] < array[i][j+1]) {
						max[i] = array[i][j+1];
					}
				}
			}
		}
		for(int i = 0; i < max.length; i++) {
			if(tmpMax < max[i]) {
				tmpMax = max[i];
			}
		}
		
		for(int i = 0; i < min.length; i++) {
			min[i] = tmpMax;
		}
		int tmpMin = tmpMax;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length -1; j++) {
				if(array[i][j] > array[i][j+1]) {
					if(min[i] > array[i][j+1]) {
						min[i] = array[i][j+1];
					}
				} else {
					if(min[i] > array[i][j]) {
						min[i] = array[i][j];
					}
				}
			}
		}
		for(int i = 0; i < min.length; i++) {
			if(tmpMin > min[i]) {
				tmpMin = min[i];
			}
		}
		System.out.println(tmpMax);
		System.out.println(tmpMin);*/
	}
}
