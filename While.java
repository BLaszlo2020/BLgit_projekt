package hu.ekeck.bednarik;

public class While 
{

	public void Prog( String args[] ) 
	{
	    int n = 1;
	    
	    while( n <= 20 ) 
	    {
	      System.out.println( n );
	      n ++;
	    }
	 }

	  public static void main( String args[] ) 
	  {
		  While sz = new While();
		  sz.Prog( args );
	  }	
}
