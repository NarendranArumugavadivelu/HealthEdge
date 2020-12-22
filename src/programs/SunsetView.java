package programs;

public class SunsetView {

	public static void main(String[] args) {
        int[] input = {3,7,8,3,6,1};
        int result = 1; 
        int currentBuildingHeight = input[input.length - 1]; 
        for (int i = input.length - 2; i >= 0; i--) { 
            if (input[i] > currentBuildingHeight) {
            	result++;
            	currentBuildingHeight = input[i];
            }
        } 
        System.out.println("Number of buildings: " + result);
       
	}
}
