package resources;

public class resourcesAPI {

	public static String resAddPet()
	{
		
		String res = "/pet/json";
		return res;
		
		
	}
	
	public static String resUpdatePet()
	{
		
		String res = "/pet/json";
		return res;
		
		
	}
	
	public static String resFindPetbyStatus()
	{
		
		String res = "/pet/findByStatus/json";
		return res;
		
		
	}
	
	public static String resFindPetbyID()
	{
		
		String res = "/pet/{petID}/json";
		return res;
		
		
	}
	
	public static String resUpdateNameStatusPet()
	{
		
		String res = "/pet/{petID}/json";
		return res;
		
		
	}
	
	public static String resDeletePet()
	{
		
		String res = "/pet/{petID}/json";
		return res;
		
		
	}
	
	public static String resUploadPetImage()
	{
		
		String res = "/pet/{petID}/uploadImage/json";
		return res;
		
///////////////////////////////////////////////////////////////////////////////////		
	}
	
	public static String resPetInventory()
	{
		
		String res = "/store/inventory/json";
		return res;
		
		
	}
	
	public static String resStoreOrder()
	{
		
		String res = "/store/order/json";
		return res;
		
		
	}
	
	public static String resFindOrderByID()
	{
		
		String res = "/store/order/{orderId}/json";
		return res;
		
		
	}
	
	public static String resDeleteOrder()
	{
		
		String res = "/store/order/{orderId}/json";
		return res;
		
		
	}
	
//////////////////////////////////////////////////////////////////////	
	public static String resCreateUser()
	{
		
		String res = "/user/json";
		return res;
		
		
	}
	
	public static String resCreateUserArray()
	{
		
		String res = "/user/createWithArray/json";
		return res;
		
		
	}
	
	public static String resCreateUserList()
	{
		
		String res = "/user/createWithList/json";
		return res;
		
		
	}
	
	public static String resUserLogin()
	{
		
		String res = "/user/login/json";
		return res;
		
		
	}
	
	public static String resUserLogOut()
	{
		
		String res = "/user/logout/json";
		return res;
		
		
	}
	
	public static String resGetUserByNamer()
	{
		
		String res = "/user/{username}/json";
		return res;
		
		
	}
	
	public static String resUpdateUser()
	{
		
		String res = "/user/{username}/json";
		return res;
		
		
	}
	
	public static String resDeleteUser()
	{
		
		String res = "/user/{username}/json";
		return res;
		
		
	}
	
	
	
}
