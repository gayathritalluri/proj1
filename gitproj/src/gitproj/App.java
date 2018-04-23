package gitproj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Base b=new Base();
    	int basesum=b.sum(12,23);
    	System.out.println(basesum);
    	Derived d=new Derived();
    	int derivedsum=d.sum(12,23);
    	d.dgetTotal();
    	System.out.println(derivedsum);

    	
    	
    }
}
