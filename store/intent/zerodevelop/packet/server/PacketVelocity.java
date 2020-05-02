package store.intent.zerodevelop.packet.server;

import store.intent.zerodevelop.packet.Packet;

public class PacketVelocity extends Packet {

    public int entityID, motionX, motionY, motionZ;

	public PacketVelocity() { }
	
	public PacketVelocity(int entityID, int motionX, int motionY, int motionZ) {
		this.entityID = entityID;
		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;
	}

	public int getEntityID() {
		return entityID;
	}

	public void setEntityID(int entityID) {
		this.entityID = entityID;
	}

	public int getMotionX() {
		return motionX;
	}

	public void setMotionX(int motionX) {
		this.motionX = motionX;
	}

	public int getMotionY() {
		return motionY;
	}

	public void setMotionY(int motionY) {
		this.motionY = motionY;
	}

	public int getMotionZ() {
		return motionZ;
	}

	public void setMotionZ(int motionZ) {
		this.motionZ = motionZ;
	}

}
