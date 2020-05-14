package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.packet.Packet;

public class PacketInput extends Packet {

	public float strafeSpeed, forwardSpeed;
	public boolean jumping, sneaking;
	
	public PacketInput() { }
	
	public PacketInput(float strafeSpeed, float forwardSpeed, boolean jumping, boolean sneaking) {
        this.strafeSpeed = strafeSpeed;
        this.forwardSpeed = forwardSpeed;
        this.jumping = jumping;
        this.sneaking = sneaking;
    }

	public float getStrafeSpeed() {
		return strafeSpeed;
	}

	public void setStrafeSpeed(float strafeSpeed) {
		this.strafeSpeed = strafeSpeed;
	}

	public float getForwardSpeed() {
		return forwardSpeed;
	}

	public void setForwardSpeed(float forwardSpeed) {
		this.forwardSpeed = forwardSpeed;
	}

	public boolean isJumping() {
		return jumping;
	}

	public void setJumping(boolean jumping) {
		this.jumping = jumping;
	}

	public boolean isSneaking() {
		return sneaking;
	}

	public void setSneaking(boolean sneaking) {
		this.sneaking = sneaking;
	}
	
}
