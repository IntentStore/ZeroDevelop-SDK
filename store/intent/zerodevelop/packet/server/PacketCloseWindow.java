package store.intent.zerodevelop.packet.server;

import store.intent.zerodevelop.packet.Packet;

public class PacketCloseWindow extends Packet {

	public int windowId;

	public PacketCloseWindow() { }

	public PacketCloseWindow(int windowId) {
		this.windowId = windowId;
	}

	public int getWindowId() {
		return windowId;
	}

	public void setWindowId(int windowId) {
		this.windowId = windowId;
	}
	
}
