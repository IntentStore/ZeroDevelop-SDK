package store.intent.zerodevelop.api;

import java.util.UUID;

import store.intent.zerodevelop.entity.Entity;
import store.intent.zerodevelop.packet.Packet;
import store.intent.zerodevelop.util.EnumFacing;
import store.intent.zerodevelop.util.ItemStack;
import store.intent.zerodevelop.util.NotificationType;

public interface Player {

	void postNotification(String title, String description, long duration, NotificationType type);
	
	void gotoPosition(int x, int y, int z);
	
	void gotoLevel(int y);
	
	void moveForward(double distance);
	
	void followPlayer(String name);
	
	void setMotionX(double motion);

	void setMotionY(double motion);

	void setMotionZ(double motion);

	void setPosX(double x);

	void setPosY(double y);

	void setPosZ(double z);

	void setRotationYaw(float yaw);

	void setRotationPitch(float pitch);

	float getRotationYaw();

	float getRotationPitch();

	float getFallDistance();

	void setFallDistance(float fallDist);

	float getStepHeight();

	void setStepHeight(float stepHeight);

	double getMotionX();

	double getMotionY();

	double getMotionZ();

	double getPosX();

	double getPosY();

	double getPosZ();

	boolean isDead();

	boolean isOnGround();

	void setOnGround(boolean onGround);

	boolean isSprinting();

	void setSprinting(boolean sprinting);

	boolean isSneaking();

	void setSneaking(boolean sneaking);
	
	boolean isEating();

	boolean isNoClip();

	void setNoClip(boolean noClip);
	
	void setFlying(boolean flying);
	
	boolean getFlying();
	
	void setFlySpeed(float speed);
	
	float getFlySpeed();

	float getMoveForward();

	float getMoveStrafing();

	void setMoveForward(float forward);

	void setMoveStrafing(float strafing);
	
	void setSpeed(float speed);
	
	float getSpeed();
	
	float getDirection();
	
	boolean isInLiquid();
	
	boolean isOnLiquid();
	
	boolean isMoving();
	
	void respawnPlayer();
	
	void swingItem();
	
	void setPositionAndUpdate(double x, double y, double z);
	
	UUID getUniqueID();
	
	void jump();
	
	boolean isSwingInProgress();
	
	boolean isBurning();
	
	int getTicksExisted();
	
	float getHealthLevel();
	
	int getFoodLevel();
	
	void sendPacket(Packet packet);
	
	void sendPacketBypassEvent(Packet packet);
	
	void setPosition(double x, double y, double z);
	
	boolean isOnLadder();
	
	int getHurtTime();
	
	boolean isInsideBlock();
	
	void setJumpMovementFactor(float factor);
	
	float getJumpMovementFactor();
	
	void setTimerSpeed(float speed);
	
	float getTimerSpeed();
	
	boolean isBlocking();
	
	boolean isUsingItem();

	ItemStack getHoldingItem();
	
	int getHeldItemId();
	
	String getHeldItemName();
	
	void syncCurrentPlayItem();
	
	void sendChatMessage(String message);
	
	void addChatMessage(String message);
	
	void addChatZeroDayMessage(String message);
	
	int getItemInUseCount();
	
	void setItemInUseCount(int count);
	
	void attack(Entity entity);
	
	String getName();
	
	double getBaseMoveSpeed();
	
	int getJumpBoostAmplifier();
	
	int getSpeedAmplifier();
	
	float[] getRotations(double targetX, double targetY, double targetZ, 
			double targetLastTickX, double targetLastTickY, double targetLastTickZ, 
			double targetHeight, double yawRandMin, double yawRandMax, double pitchRandMin, double pitchRandMax);
	
	float[] getRotations(double targetX, double targetY, double targetZ, 
			double targetLastTickX, double targetLastTickY, double targetLastTickZ, 
			double targetHeight);
	
	float[] getRotationsBlock(double targetX, double targetY, double targetZ, EnumFacing face);
	
	float[] getRotationsBlockCenter(double targetX, double targetY, double targetZ);
	
	float[] getRotations(double targetX, double targetY, double targetZ, double randMin, double randMax);
	
	float[] getRotations(double targetX, double targetY, double targetZ, double targetHeight);
	
	double normalize(double value, double start, double end);
	
}
