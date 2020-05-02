package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.packet.Packet;

public class PacketKeepAlive extends Packet {

	public int key;
	
	public PacketKeepAlive() { }

	public PacketKeepAlive(int key) {
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

}
