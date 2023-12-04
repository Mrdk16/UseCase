package in.co.rays.Bundle;

import java.util.ResourceBundle;

public class TestBundle {
	
	
public static void main(String[] args) throws Exception {
	
    ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.App");	
	
	System.out.println(rb.getString("Driver"));
	System.out.println(rb.getString("url"));
	System.out.println(rb.getString("user"));
    System.out.println(rb.getString("Password"));
	System.out.println(Integer.parseInt(rb.getString("Initial")));
	System.out.println(Integer.parseInt(rb.getString("Acquire")));
	System.out.println(Integer.parseInt(rb.getString("maximum")));
	
	

	
}

}
