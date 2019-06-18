package resources;

public class payLoad {
	
	public static String addNewPet()
	{
		
		String b = "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}";
		
		return b;
		
	}
	
	public static String updateNewPet()
	{
		
		String b = "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"category\": {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"name\": \"string\"\r\n" + 
				"  },\r\n" + 
				"  \"name\": \"doggie\",\r\n" + 
				"  \"photoUrls\": [\r\n" + 
				"    \"string\"\r\n" + 
				"  ],\r\n" + 
				"  \"tags\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 0,\r\n" + 
				"      \"name\": \"string\"\r\n" + 
				"    }\r\n" + 
				"  ],\r\n" + 
				"  \"status\": \"available\"\r\n" + 
				"}";
		
		return b;
		
	}
	
	public static String placeOrder()
	{
		
		String b = "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"petId\": 0,\r\n" + 
				"  \"quantity\": 0,\r\n" + 
				"  \"shipDate\": \"2019-06-18T08:06:18.942Z\",\r\n" + 
				"  \"status\": \"placed\",\r\n" + 
				"  \"complete\": false\r\n" + 
				"}";
		
		return b;
		
	}

	public static String createUser()
	{
		
		String b = "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"username\": \"string\",\r\n" + 
				"  \"firstName\": \"string\",\r\n" + 
				"  \"lastName\": \"string\",\r\n" + 
				"  \"email\": \"string\",\r\n" + 
				"  \"password\": \"string\",\r\n" + 
				"  \"phone\": \"string\",\r\n" + 
				"  \"userStatus\": 0\r\n" + 
				"}";
		
		return b;
		
	}
	
	public static String createArrayUser()
	{
		
		String b = "[\r\n" + 
				"  {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"username\": \"string\",\r\n" + 
				"    \"firstName\": \"string\",\r\n" + 
				"    \"lastName\": \"string\",\r\n" + 
				"    \"email\": \"string\",\r\n" + 
				"    \"password\": \"string\",\r\n" + 
				"    \"phone\": \"string\",\r\n" + 
				"    \"userStatus\": 0\r\n" + 
				"  }\r\n" + 
				"]";
		
		return b;
		
	}
	
	public static String createListUser()
	{
		
		String b = "[\r\n" + 
				"  {\r\n" + 
				"    \"id\": 0,\r\n" + 
				"    \"username\": \"string\",\r\n" + 
				"    \"firstName\": \"string\",\r\n" + 
				"    \"lastName\": \"string\",\r\n" + 
				"    \"email\": \"string\",\r\n" + 
				"    \"password\": \"string\",\r\n" + 
				"    \"phone\": \"string\",\r\n" + 
				"    \"userStatus\": 0\r\n" + 
				"  }\r\n" + 
				"]";
		
		return b;
		
	}
	
	public static String updateUser()
	{
		
		String b = "{\r\n" + 
				"  \"id\": 0,\r\n" + 
				"  \"username\": \"string\",\r\n" + 
				"  \"firstName\": \"string\",\r\n" + 
				"  \"lastName\": \"string\",\r\n" + 
				"  \"email\": \"string\",\r\n" + 
				"  \"password\": \"string\",\r\n" + 
				"  \"phone\": \"string\",\r\n" + 
				"  \"userStatus\": 0\r\n" + 
				"}";
		
		return b;
		
	}
	
}
