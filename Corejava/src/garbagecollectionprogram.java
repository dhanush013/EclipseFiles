
public class garbagecollectionprogram {
	
	public static void main(String[] args) {
		
		String s[]=new String[10000000];
		Runtime rt=Runtime.getRuntime();
		
		System.out.println("Before array initialisation");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		
		for(int i=0; i<s.length; i++) {
			s[i]=new String("hello world");
		}
		
		System.out.println("after array initialisation");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		
		for(int i=0; i<s.length; i++) {
			s[i]=null;
		}
		
		rt.gc();
		
		System.out.println("After Garbage Collection");
		System.out.println(rt.freeMemory());
		System.out.println(rt.totalMemory());
		

		
	}

}
