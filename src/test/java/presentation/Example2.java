package presentation;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.DataProviderSupplier;



public class Example2 {
	
	   @Test(dataProvider = "datapro",dataProviderClass = DataProviderSupplier.class)
	    public void check_if_shortlisted(float m1, float m2,float m3)

	    {
		 System.out.println("1st value="+m1+"\n 2nd value="+m2+"\n 3rd value"+m3);

	       System.out.println("sum="+(m1+m2+m3));

	    }
}
//String strAmount=String.valueOf(amount);
//convertedInt = Integer.parseInt(str_variable); 