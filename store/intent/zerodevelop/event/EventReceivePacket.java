package store.intent.zerodevelop.event;

import store.intent.zerodevelop.packet.Packet;

public class EventReceivePacket extends Cancellable {

	public Packet packet;
	public Type type;

	public EventReceivePacket(Packet packet, Type type) {
		this.packet = packet;
		this.type = type;
	}
	
	public Packet getPacket() {
		return packet;
	}
	
	public void setPacket(Packet packet) {
		this.packet = packet;
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
