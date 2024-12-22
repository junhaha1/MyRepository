package gitBranchTest;

public class A {
	private String _testname = "test";
	private int _testnumber = 1;
	private int _sumnumber = 0;
	
	public void printMember(String str) {
		System.out.println(str);
	}

	public void saveSumNumber(int a, int b) {
		this._sumnumber = a + b;
	}
}
