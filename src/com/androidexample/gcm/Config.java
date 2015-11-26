package com.androidexample.gcm;

public interface Config {

	  
	// CONSTANTS
	static final String YOUR_SERVER_URL =  "http://10.0.2.2/gcm_server_files/register.php";
	// YOUR_SERVER_URL : Server url where you have placed your server files
    // Google project id 
	     
    static final String GOOGLE_SENDER_ID = "247826708004";  // Place here your Google project id
    /**
     * Tag used on log messages. 
     */ 
    static final String TAG = "GCM Project";
  
    static final String DISPLAY_MESSAGE_ACTION =
            "com.androidexample.gcm.DISPLAY_MESSAGE";

    static final String EXTRA_MESSAGE = "message";
		
	
}
