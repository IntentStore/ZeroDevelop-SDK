package store.intent.zerodevelop.entity;

public class Entity {

	public int entityId;
	public double health;
	public String name, unformattedName;
	public double posX, posY, posZ, lastTickPosX, lastTickPosY, lastTickPosZ, height;
	public float rotationYaw, rotationPitch;
	public boolean visible;
	
	public Entity(int id) {
		entityId = id;
	}

	public double getLastTickPosX() {
		return lastTickPosX;
	}

	public void setLastTickPosX(double lastTickPosX) {
		this.lastTickPosX = lastTickPosX;
	}

	public double getLastTickPosY() {
		return lastTickPosY;
	}

	public void setLastTickPosY(double lastTickPosY) {
		this.lastTickPosY = lastTickPosY;
	}

	public double getLastTickPosZ() {
		return lastTickPosZ;
	}

	public void setLastTickPosZ(double lastTickPosZ) {
		this.lastTickPosZ = lastTickPosZ;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnformattedName() {
		return unformattedName;
	}

	public void setUnformattedName(String unformattedName) {
		this.unformattedName = unformattedName;
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

	public float getRotationYaw() {
		return rotationYaw;
	}

	public void setRotationYaw(float rotationYaw) {
		this.rotationYaw = rotationYaw;
	}

	public float getRotationPitch() {
		return rotationPitch;
	}

	public void setRotationPitch(float rotationPitch) {
		this.rotationPitch = rotationPitch;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public double getDistanceToEntity(double x, double y, double z) {
		double xDiff = getPosX() - x;
		double yDiff = getPosY() - y;
		double zDiff = getPosZ() - z;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff);
    }

}
