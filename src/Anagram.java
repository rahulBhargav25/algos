
public class Anagram {

	public static void main(String[] args) {
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		String s1 = "apple";
		String s2 = "elapp";

		int flag = 1;
		for(int i=0;i<s1.length();i++) {
			count1[s1.charAt(i)-'a']++;
			
		}
		for(int i=0;i<s2.length();i++) {
			count2[s2.charAt(i)-'a']++;
			
		}
		for(int i=0;i<26;i++) {
			if(count1[i]!=count2[i]) {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("You got an anagram");
		} else {
			System.out.println("no this is not an anagram");
		}
		

	}

}
