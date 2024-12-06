package presentation;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example1 {
	@Test

	@Parameters({"Reviewer_1", "Reviewer_2"})

	    public void check_if_shortlisted(float marks_1, float marks_2)

	    {
		 float sum=(marks_1 +marks_2);
		 System.out.println(marks_1+" + "+marks_2+ "="+(marks_1+marks_2));

	       float average = (marks_1 + marks_2)/2;

	       System.out.println("The average achieved by the writer is " + average);

	    }

	}

