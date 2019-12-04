package com.exercise41.app;
import com.exercise41.model.MiSingleton;

public class SingletonApp {

	public static void main(String[] args) {
		
		String urlServer="jdbc:mysql://localhost:3306/tienda";
		String user="root";
		String pass="admin";
		
		String urlServer2="jdbc:mysql://localhost:3306/tienda";
		String user2="root2";
		String pass2="admin2";
		
		String urlServer3="jdbc:mysql://localhost:3306/tienda";
		String user3="root3";
		String pass3="admin3";
		
		MiSingleton objMisingleton = MiSingleton.getInstance(urlServer,user,pass);
		MiSingleton objMisingleton2 = MiSingleton.getInstance(urlServer2,user2,pass2);
		MiSingleton objMisingleto3 = MiSingleton.getInstance(urlServer3,user3,pass3);
	}

}
