package teaChat;

import java.io.*;
/*
 * This class defines the different type of messages that will be exchanged between the
 * Clients and the Server.
 * When talking from a Java Client to a Java Server a lot easier to pass Java objects, no
 * need to count bytes or to wait for a line feed at the end of the frame
 */
public class ChatMessage implements Serializable {
 
protected static final long serialVersionUID = 1112122200L;
 
    // The different types of message sent by the Client
    // WHOISIN to receive the list of the users connected
    // MESSAGE an ordinary message
    // LOGOUT to disconnect from the Server

    static final int WHOISIN = 0, MESSAGE = 1, LOGOUT = 2;
    private int type;
    private String message;
    private String cor;

	public int iCripto;
    private byte[] bMsg;
     
    // constructor SEM Criptografia
    ChatMessage(int type, String message, String cor, int iCripto) {
        this.type = type;
        if(iCripto==0) { this.message = message;}
        else {this.bMsg = bMsg;}
    }
    
    // constructor COM Criptografia
    ChatMessage(int type, String message, byte[] bMsg, String cor, int iCripto) {
        this.type = type;
        if(iCripto==0) { this.message = message;}
        else {this.bMsg = bMsg;}
    }
    
    // getters
    int getType() {
        return type;
    }
    
    String getMessage() {
    	System.out.println("Entrei");
    	System.out.println(iCripto);
    	if(iCripto==0){ return message;} 	// Sem criptografia
    	else { return "@#@"; }

    }

	// Mensagem Criptografada
	byte[] getbMessage() {
		return this.bMsg;		
	}
}