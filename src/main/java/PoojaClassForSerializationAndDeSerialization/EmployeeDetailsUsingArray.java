package PoojaClassForSerializationAndDeSerialization;

public class EmployeeDetailsUsingArray 
{
	//Declare the Variable globally
		String[] Ename;
		String[] Eid;
		String[] Email;          //StringArray
		int[] PhoneNo;        //intArray
		String[] Address;
		
		//object
		
		//Create The Constructor For initialization
		public void EmployeeDetailsPojo(String[] ename,String[] eid, String[] email , int[] phoneNo,String[] address) 
		{
		 
		this.Ename  =ename;
		this.Eid    =eid;
		this.Email  = email;
		this.PhoneNo = phoneNo;
		this.Address=address;
		
	}
		//Setter and Getter For Access
		
		public String[] getEname()
		{
			return Ename;
		}
		
		public void setEname(String[] ename) 
		{
			Ename = ename;
		}
		
		public String[] getEid()
		{
			return Eid;
		}
		public void setEid(String[] eid) 
		{
			Ename = eid;
		}
		
		
		public String[] getEmail()
		{
			return Email;
		}
		public void setEmail(String[] email) 
		{
			Ename = email;
		}
		
		public int[] getPhoneNo()
		{
			return PhoneNo;
		}
		public void setPhoneNo(String[] phoneNo) 
		{
			Ename = phoneNo;
		}
		
		public String[] Address()
		{
			return Address;
		}
		
		public void setAddress(String[] address) 
		{
			Address = address;
		}
		
		
		
}
