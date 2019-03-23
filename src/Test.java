
public class Test {

	public static void main(String[] args) {
		
	String r ="";	
	String s = "mam" ; 
	
	char a[] = s.toCharArray();
	
	for (int i = a.length-1; i > 0; i++) {
	
		r = r+ a[i];
	}
	
	if(r.equals(s)) {
		System.out.println("palindrom");
	}
	else
		System.out.println("not palindrom");
	}

}
