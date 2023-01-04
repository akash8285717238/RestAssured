package PoojaClassForSerializationAndDeSerialization;

public class AddPojoClass 
{
	{

		//Declare the Variable globally
		String Ename;
		String Eid;
		String Email;          //StringArray
		int PhoneNo;        //intArray
		String Address;
		
		//object
		
		//Create The Constructor For initialization
		public void AddPojoClassTest(String ename,String eid, String email , int phoneNo,String address) 
		{
		 super(); //We should use .this Class also
		Ename  =ename;
		Eid    =eid;
		Email  = email;
		PhoneNo = phoneNo;
		Address =address;
	}
		public EmployeeDetailsPojo()
		{
			
		}
		//Setter and Getter For Access
		
		public String getEname()
		{
			return Ename;
		}
		
		public void setEname(String ename) 
		{
			Ename = ename;
		}
		
		public String getEid()
		{
			return Eid;
		}
		public void setEid(String eid) 
		{
			Eid = eid;
		}
		
		
		public String getEmail()
		{
			return Email;
		}
		public void setEmail(String email) 
		{
			Email = email;
		}
		
		public int getPhoneNo()
		{
			return PhoneNo;
		}
		public void setPhoneNo(int phoneNo) 
		{
			PhoneNo = phoneNo;
		}
		
		public String Address()
		{
			return Address;
		}
		
		public void setAddress(String address) 
		{
			Address = address;
		}
		
		
	}

		
}	
		
		

