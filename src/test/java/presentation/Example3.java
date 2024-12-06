package presentation;

import org.testng.annotations.Test;

import Utils.DataProviderSupplier;

public class Example3 {
	
		
		   @Test(dataProvider = "ThreeInputs",dataProviderClass = DataProviderSupplier.class)
		    public void check_if_shortlisted(String m1, String m2,String m3)

		    {
			 //float amount=Float.parseFloat(strAmount)
			   float m1_f=Float.parseFloat(m1);
			   float m2_f=Float.parseFloat(m2);
			   float m3_f=Float.parseFloat(m3);
			 System.out.println("\n1st value="+m1+"\t 2nd value="+m2+"\t 3rd value"+m3);

		      System.out.println("sum="+(m1_f+m2_f+m3_f)+"avaerage="+(m1_f+m2_f+m3_f)/3);

		    }
	}

