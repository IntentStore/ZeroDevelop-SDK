package store.intent.zerodevelop.packet;

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
