
public class PileOfBoxes {

	public static void main(String[] args) {
		int[] SSBox1a = {0};
		int[] SSBox1b = {0};
		int[] SSBox2a = {0};
		int[] SSBox2b = {0};
		int[] SSBox2c = {0};
		int[] SSBox3a = {0};
		int[] SSBox3b = {0};
		int[] SSBox4a = {1};
		int[] SSBox4b = {0};
		int[] SSBox4c = {0};
		int[][] SBox1 = {SSBox1a , SSBox1b};
		int[][] SBox2 = {SSBox2a, SSBox2b, SSBox2c};
		int[][] SBox3 = {SSBox3a, SSBox3b};
		int[][] SBox4 = {SSBox4a, SSBox4b, SSBox4c};

		
		int[][][] BigBox = {SBox1, SBox2, SBox3, SBox4};
		for(int i = 0; i <BigBox.length; i++) {
			for(int j = 0; j < SBox1.length; j++) {
				for(int k = 0 ; k < SSBox1a.length; k++) {
					if(BigBox[i][j][k]==1) {
						System.out.println("found the key grandma at "+ i + " index of big box and " + j + " index of SBox " + k + " index of SSBox");
						break;
					} else if(BigBox[i][j][k]==0){
						continue;
					} else {
						System.out.println("item not found");
					}
				}
			}
		}

	}

}
