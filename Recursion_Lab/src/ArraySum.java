
public class ArraySum {

	public int sumOfArray(Integer[] myArray, int index) {
		if(index==0) {
			return myArray[index];
			}
			int NumOfArrayToSum=(sumOfArray(myArray, index-1)+ myArray[index]);
			
			return NumOfArrayToSum;
	}

}
