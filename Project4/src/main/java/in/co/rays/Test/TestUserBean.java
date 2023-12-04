package in.co.rays.Test;

import java.util.Iterator;
import java.util.List;

import in.co.rays.Bean.UserBean;
import in.co.rays.Model.UserModel;

public class TestUserBean {
	
	
	

	public static void main(String[] args) throws Exception {

			testAdd();
	     //	 testdelete();
		//testsearch();
		
		}

		
	

	private static void testsearch() throws Exception {
		
		
		
		UserBean bean = new UserBean();
		
		
	   	bean.setId(2);
     
		
		UserModel m = new UserModel();
		
		List l = m.search(bean,1,5);
		
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			
			bean = (UserBean) it.next();
			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getFirstName());
			System.out.print("\t" + bean.getLastName());
			System.out.print("\t" + bean.getLoginId());
			System.out.print("\t" + bean.getPassword());
			
			System.out.print("\t" + bean.getAddress());
			
			
		}
				
		
	}




	private static void testdelete() throws Exception {
		
		UserModel model = new UserModel();
		
		model.delete(7);
		
	}




	

	private static void testAdd() throws Exception {
		
		 UserBean bean = new UserBean();
		  
		    bean.setId(5);;
		    bean.setFirstName("Sachin");
		    bean.setLastName("Jat");
		    bean.setLoginId("Sachin@gmail.com");
		    bean.setPassword("Sachin@123");
		    bean.setAddress("Shajapur");
		   



		    UserModel model = new UserModel();

		    model.add(bean);
		    	
		
		 
   

   
	}
}

