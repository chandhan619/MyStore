package com.chandhan;

public class MainApp {
public static void main(String[] args) {
	//
	// Use port identifier for acquiring the port
	//
	SerialPort port = null;
	try {
	    port = (SerialPort) portId.open(
	        "name", // Name of the application asking for the port 
	        10000   // Wait max. 10 sec. to acquire port
	    );
	} catch(PortInUseException e) {
	    System.err.println("Port already in use: " + e);
	    System.exit(1);
	}
	//
	// Now we are granted exclusive access to the particular serial
	// port. We can configure it and obtain input and output streams.
	//
}
}
