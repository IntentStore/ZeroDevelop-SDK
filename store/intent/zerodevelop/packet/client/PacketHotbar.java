package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.packet.Packet;

public class PacketHotbar extends Packet {

	public int slot;
	
	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public PacketHotbar() { }
	
	public PacketHotbar(int slot) {
		this.slot = slot;
	}

}
