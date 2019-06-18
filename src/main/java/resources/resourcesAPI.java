package resources;

public class resourcesAPI {

	public static String resAddPet()
	{
		
		String res = "/pet";
		return res;
		
		
	}
	
	public static String resUpdatePet()
	{
		
		String res = "/pet";
		return res;
		
		
	}
	
	public static String resFindPetbyStatus()
	{
		
		String res = "/pet/findByStatus";
		return res;
		
		
	}
	
	public static String resFindPetbyID()
	{
		
		String res = "/pet/{petID}";
		return res;
		
		
	}
	
	public static String resUpdateNameStatusPet()
	{
		
		String res = "/pet/{petID}";
		return res;
		
		
	}
	
	public static String resDeletePet()
	{
		
		String res = "/pet/{petID}";
		return res;
		
		
	}
	
	public static String resUploadPetImage()
	{
		
		String res = "/pet/{petID}/uploadImage";
		return res;
		
///////////////////////////////////////////////////////////////////////////////////		
	}
	
	public static String resPetInventory()
	{
		
		String res = "/store/inventory";
		return res;
		
		
	}
	
	public static String resStoreOrder()
	{
		
		String res = "/store/order";
		return res;
		
		
	}
	
	public static String resFindOrderByID()
	{
		
		String res = "/store/order/{orderId}";
		return res;
		
		
	}
	
	public static String resDeleteOrder()
	{
		
		String res = "/store/order/{orderId}";
		return res;
		
		
	}
	
//////////////////////////////////////////////////////////////////////	
	public static String resCreateUser()
	{
		
		String res = "/user";
		return res;
		
		
	}
	
	public static String resCreateUserArray()
	{
		
		String res = "/user/createWithArray";
		return res;
		
		
	}
	
	public static String resCreateUserList()
	{
		
		String res = "/user/createWithList";
		return res;
		
		
	}
	
	public static String resUserLogin()
	{
		
		String res = "/user/login";
		return res;
		
		
	}
	
	public static String resUserLogOut()
	{
		
		String res = "/user/logout";
		return res;
		
		
	}
	
	public static String resGetUserByNamer()
	{
		
		String res = "/user/{username}";
		return res;
		
		
	}
	
	public static String resUpdateUser()
	{
		
		String res = "/user/{username}";
		return res;
		
		
	}
	
	public static String resDeleteUser()
	{
		
		String res = "/user/{username}";
		return res;
		
		
	}
	
	
	
}
