package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.packet.Packet;

public class PacketAction extends Packet {

	public Action action;
	
	public PacketAction() { }
	
	public PacketAction(Action action) { 
		this.action = action;
	}

    public static enum Action {
        START_SNEAKING,
        STOP_SNEAKING,
        STOP_SLEEPING,
        START_SPRINTING,
        STOP_SPRINTING,
        RIDING_JUMP,
        OPEN_INVENTORY;
    }
    
	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}
	
}
