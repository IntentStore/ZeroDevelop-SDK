package store.intent.zerodevelop.api;

import java.util.List;

import store.intent.zerodevelop.entity.Entity;
import store.intent.zerodevelop.entity.PlayerEntity;
import store.intent.zerodevelop.util.BlockPos;

public interface World {

	List<Entity> getLoadedEntities();

	List<PlayerEntity> getLoadedPlayerEntities();
	
	void removeEntity(Entity entity);
	
	boolean matchesBlockId(BlockPos position, int id);
	
	boolean isLiquid(BlockPos position);
	
	boolean isSolid(BlockPos position);
	
	boolean isOpaque(BlockPos position);
	
	boolean isTranslucent(BlockPos position);
	
}
