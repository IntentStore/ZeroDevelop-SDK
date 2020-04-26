package store.intent.zerodevelop.packet;

public class PacketChat extends Packet {

    public String message;
    
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PacketChat() { }
    
	public PacketChat(String message) { 
		this.message = message;
	}

}
