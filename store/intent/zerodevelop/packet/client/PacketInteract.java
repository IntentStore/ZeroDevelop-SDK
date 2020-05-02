package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.entity.Entity;
import store.intent.zerodevelop.packet.Packet;
import store.intent.zerodevelop.util.Vec3;

public class PacketInteract extends Packet {

	public int entityId;
	public Action action;
	public Vec3 hitVec;

	public PacketInteract() { }
	
	public PacketInteract(int entity, Action action) {
        this.entityId = entity;
        this.action = action;
    }

    public PacketInteract(int entity, Vec3 hitVec) {
        this(entity, Action.INTERACT_AT);
        this.hitVec = hitVec;
    }
	
	public PacketInteract(Entity entity, Action action) {
        this.entityId = entity.getEntityId();
        this.action = action;
    }

    public PacketInteract(Entity entity, Vec3 hitVec) {
        this(entity, Action.INTERACT_AT);
        this.hitVec = hitVec;
    }

    public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Vec3 getHitVec() {
		return hitVec;
	}

	public void setHitVec(Vec3 hitVec) {
		this.hitVec = hitVec;
	}
    
	public static enum Action {
        INTERACT,
        ATTACK,
        INTERACT_AT;
    }
	
}
