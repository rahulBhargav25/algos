
public class recurssionPileOfBoxes {
	static int i =10;
	public static void main(String[] args) {
		recurssionPileOfBoxes rs = new recurssionPileOfBoxes();
		
		rs.cd(i);
		

	}
	
	public void cd(int i) {
		
		if(i>=0) {
			System.out.println(i);
			cd(i-1);
		} else {
			cd(i-1);
		}
		
	} 


}
