package immutableClassExample;

/*sx
1234
false
immutableClassExample.MyImmutableClass@7de26db8
sx
1234
true
immutableClassExample.MyImmutableClass@1175e2db
sx
1234
false
immutableClassExample.MyImmutableClass@7de26db8

*/

public class Main {
	static MyImmutableClass immu = new MyImmutableClass();
	
	public static void main(String[] args) {
		System.out.println(immu);
		System.out.println(immu.modifyName());
		System.out.println(immu);

	}

}
