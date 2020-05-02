package store.intent.zerodevelop.packet.server;

import store.intent.zerodevelop.packet.Packet;

public class PacketKeepAlive extends Packet {

	public int id;

	public PacketKeepAlive() { }

	public PacketKeepAlive(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
