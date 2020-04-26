package store.intent.zerodevelop.event;

import store.intent.zerodevelop.packet.Packet;

public class EventSendPacket extends Cancellable {

	public Packet packet;
	
	public EventSendPacket(Packet packet) {
		this.packet = packet;
	}
	
	public Packet getPacket() {
		return packet;
	}
	
	public void setPacket(Packet packet) {
		this.packet = packet;
	}

}
