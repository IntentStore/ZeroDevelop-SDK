package store.intent.zerodevelop.packet;

public class PacketPlayer extends Packet {

	public double x;
	public double y;
	public double z;
    public float yaw;
    public float pitch;
    public boolean onGround;
    public boolean moving;
    public boolean rotating;
	
    public PacketPlayer() { }
    
    public PacketPlayer(boolean onGround) {
    	this.onGround = onGround;
    }
    
    public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public boolean isOnGround() {
		return onGround;
	}

	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	public boolean isMoving() {
		return moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public boolean isRotating() {
		return rotating;
	}

	public void setRotating(boolean rotating) {
		this.rotating = rotating;
	}
    
	public static class Position extends PacketPlayer {
		
		public Position() {
			this.moving = true;
		}
		
		public Position(double x, double y, double z, boolean onGround) {
            this.x = x;
            this.y = y;
            this.z = z;
	    	this.onGround = onGround;
            this.moving = true;
	    }
		
	}
	
	public static class Rotation extends PacketPlayer {
		
		public Rotation() {
			this.rotating = true;
		}
		
		public Rotation(float yaw, float pitch, boolean onGround) {
			this.yaw = yaw;
			this.pitch = pitch;
	    	this.onGround = onGround;
            this.rotating = true;
	    }
		
	}
	
	public static class PositionRotation extends PacketPlayer {
		
		public PositionRotation() {
			this.rotating = true;
			this.moving = true;
		}
		
		public PositionRotation(double x, double y, double z, float yaw, float pitch, boolean onGround) {
            this.x = x;
            this.y = y;
            this.z = z;
			this.yaw = yaw;
			this.pitch = pitch;
	    	this.onGround = onGround;
            this.rotating = true;
            this.moving = true;
	    }
		
	}
	
}
