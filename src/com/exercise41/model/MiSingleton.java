package com.exercise41.model;

public class MiSingleton {
	//Paso 2- Instancia Privada Estatica
	private static MiSingleton Mysingle=null;
	
	private static String urlServer;
	private static String user;
	private static String pass;
	
	//Paso 1-Constructor Privado
	private MiSingleton()
	{
		
	}
	
	//Paso 3-Método getInstance público estático
	public static MiSingleton getInstance(String url, String username, String password)
	{
		if(Mysingle==null)
		{
			urlServer=url;
			user=username;
			pass=password;
			Mysingle=new MiSingleton();
		}
		else
		{
			System.out.println("No se puede crear este objeto porque ya está instanciado");
			System.out.println("URL del Servidor: "+urlServer);
			System.out.println("Username: "+user);
			System.out.println("Pass: "+pass);
			
		}
		
		return Mysingle;
	}
}
