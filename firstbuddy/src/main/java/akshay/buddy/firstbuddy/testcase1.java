package akshay.buddy.firstbuddy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class testcase1 {
  @Test
  public void f() {
	  System.out.println("inside test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside before");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside after");
  }
  

}
