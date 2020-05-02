package store.intent.zerodevelop.packet.server;

import java.util.List;

import store.intent.zerodevelop.packet.Packet;
import store.intent.zerodevelop.util.BlockPos;

public class PacketExplosion extends Packet {

	public double posX, posY, posZ;
	public float strength;
	public List<BlockPos> affectedBlockPositions;
    public float motionX, motionY, motionZ;

	public PacketExplosion() { }

	public PacketExplosion(double posX, double posY, double posZ, float strength, List<BlockPos> affectedBlockPositions, float motionX, float motionY, float motionZ) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.strength = strength;
		this.affectedBlockPositions = affectedBlockPositions;
		this.motionX = motionX;
		this.motionY = motionY;
		this.motionZ = motionZ;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getPosZ() {
		return posZ;
	}

	public void setPosZ(double posZ) {
		this.posZ = posZ;
	}

	public float getStrength() {
		return strength;
	}

	public void setStrength(float strength) {
		this.strength = strength;
	}

	public List<BlockPos> getAffectedBlockPositions() {
		return affectedBlockPositions;
	}

	public void setAffectedBlockPositions(List<BlockPos> affectedBlockPositions) {
		this.affectedBlockPositions = affectedBlockPositions;
	}

	public float getMotionX() {
		return motionX;
	}

	public void setMotionX(float motionX) {
		this.motionX = motionX;
	}

	public float getMotionY() {
		return motionY;
	}

	public void setMotionY(float motionY) {
		this.motionY = motionY;
	}

	public float getMotionZ() {
		return motionZ;
	}

	public void setMotionZ(float motionZ) {
		this.motionZ = motionZ;
	}
	
	
	
}
