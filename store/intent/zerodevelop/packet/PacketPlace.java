package store.intent.zerodevelop.packet;

import store.intent.zerodevelop.util.BlockPos;
import store.intent.zerodevelop.util.ItemStack;

public class PacketPlace extends Packet {

	public static BlockPos NULL = new BlockPos(-1, -1, -1);
	public BlockPos position;
	public ItemStack stack;
	public float facingX, facingY, facingZ;
	public int placeDirection;
	
	public PacketPlace(ItemStack stack) {
		this(NULL, stack, 0.0F, 0.0F, 0.0F, 255);
	}
	
	public PacketPlace(BlockPos position, ItemStack stack, float facingX, float facingY, float facingZ, int placeDirection) {
		this.position = position;
		this.stack = stack;
		this.facingX = facingX;
		this.facingY = facingY;
		this.facingZ = facingZ;
		this.placeDirection = placeDirection;
	}

	public BlockPos getPosition() {
		return position;
	}

	public void setPosition(BlockPos position) {
		this.position = position;
	}

	public ItemStack getStack() {
		return stack;
	}

	public void setStack(ItemStack stack) {
		this.stack = stack;
	}

	public float getFacingX() {
		return facingX;
	}

	public void setFacingX(float facingX) {
		this.facingX = facingX;
	}

	public float getFacingY() {
		return facingY;
	}

	public void setFacingY(float facingY) {
		this.facingY = facingY;
	}

	public float getFacingZ() {
		return facingZ;
	}

	public void setFacingZ(float facingZ) {
		this.facingZ = facingZ;
	}

	public int getPlaceDirection() {
		return placeDirection;
	}

	public void setPlaceDirection(int placeDirection) {
		this.placeDirection = placeDirection;
	}
	
}
