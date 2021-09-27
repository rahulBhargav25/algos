
public class recurssionPileOfBoxes {
	static long i =10;
	public static void main(String[] args) throws Exception {
		recurssionPileOfBoxes rs = new recurssionPileOfBoxes();
		
		rs.cd(i);
		

	}
	
	public void cd(long i) throws Exception {
		System.out.println(i);
		if(i<=0) {
			
			cd(i-1);
			
		} else {
			cd(i-1);
		}
		
	} 


}
