
public class unionFind {
	
	
	static int id[] = {0,1,2,3,4,5,6,7,8,9};
	public static void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i = 0; i < id.length;i++) {
			if (id[i]==pid) id[i]=qid;
		}
		
		 
	}
	public boolean connected(int p , int q) {
		if(id[p]==id[q]) {
			System.out.println("True");
			return true;
		} else {
			System.out.println("False");
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		union(2,3);
		union(1,2);
		for(int i=0;i<id.length;i++) {
			int arr = id[i];
			System.out.println(arr);
		}
		unionFind uf = new unionFind();
		uf.connected(1, 2);
	}
}
