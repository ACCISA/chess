
public class arraysEco {

	public static void main(String[] args) {
		
		int[] dataArr = {2,4,6,8,10,12,14,16};
		int[] studScores1 = dataArr;
		int[] studScores2 = new  int[dataArr.length + 10];
		
		for (int i = 0; i<dataArr.length; i++) {
			studScores2[i] = dataArr[i];
		}
		
		dataArr[2] = 1000;
		
		for (int element: studScores2) {
			System.out.println(element);
		}
		
		
	}
	

	
}

