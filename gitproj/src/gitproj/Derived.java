package gitproj;

public class Derived extends Base{

	private int dvar1;
	private int dvar2;
	private int dvar3;
	private int total;
	
	
	public int dgetTotal() {
		return total;
	}
	public void dsetTotal(int total) {
		this.total = total;
	}
	
	public int sum(int dvar1, int dvar2,int dvar3)
	{
		return total=dvar1+dvar2+dvar3;
	}
	
	public int sum(int dvar1, int dvar2)
	{
		return total=dvar1+dvar2+2;
	}
}
