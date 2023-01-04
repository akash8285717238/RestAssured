package PoojaClassForSerializationAndDeSerialization;

public class SpouseClass 
{
	public class EmployeeDetailsPojo {

		//Declare the Variable globally
		String EName;
		String Eid;
		String Email;          //StringArray
		int    PhoneNo;        //intArray
		String Address;
		
		//object
		
		//Create The Constructor For initialization
		public EmployeeDetailsPojo(String ename,String eid, String email , int phoneNo,String address) 
		{
		 super();
		EName  =ename;
		Eid    =eid;
		Email  = email;
		PhoneNo = phoneNo;
		Address =address;
	}
		//Setter and Getter For Access
		
		public String getEname()
		{
			return EName;
		}
		
		public void setEname(String ename) 
		{
			EName = ename;
		}
		
		public String getEid()
		{
			return Eid;
		}
		public void setEid(String eid) 
		{
			EName = eid;
		}
		
		
		public String getEmail()
		{
			return Email;
		}
		public void setEmail(String email) 
		{
			EName = email;
		}
		
		public int getPhoneNo()
		{
			return PhoneNo;
		}
		public void setPhoneNo(String phoneNo) 
		{
			EName = phoneNo;
		}
		
		public String Address()
		{
			return Address;
		}
		
		public void setAddress(String address) 
		{
			address = address;
		}
		
		
		
    }

}
