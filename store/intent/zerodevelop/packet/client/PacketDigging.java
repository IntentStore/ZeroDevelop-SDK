package store.intent.zerodevelop.packet.client;

import store.intent.zerodevelop.packet.Packet;
import store.intent.zerodevelop.util.BlockPos;
import store.intent.zerodevelop.util.EnumFacing;

public class PacketDigging extends Packet {

	public BlockPos position;
	public EnumFacing facing;
	public Action action;
	
	public PacketDigging(BlockPos position, EnumFacing facing, Action action) {
		this.position = position;
		this.facing = facing;
		this.action = action;
	}

	public BlockPos getPosition() {
		return position;
	}

	public void setPosition(BlockPos position) {
		this.position = position;
	}

	public EnumFacing getFacing() {
		return facing;
	}

	public void setFacing(EnumFacing facing) {
		this.facing = facing;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public static enum Action {
        START_DESTROY_BLOCK,
        ABORT_DESTROY_BLOCK,
        STOP_DESTROY_BLOCK,
        DROP_ALL_ITEMS,
        DROP_ITEM,
        RELEASE_USE_ITEM;
    }
	
}
