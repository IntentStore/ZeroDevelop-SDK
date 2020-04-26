package store.intent.zerodevelop.api;

import java.util.List;

import store.intent.zerodevelop.entity.Entity;
import store.intent.zerodevelop.entity.PlayerEntity;

public interface World {

	List<Entity> getLoadedEntities();

	List<PlayerEntity> getLoadedPlayerEntities();
	
	void removeEntity(Entity entity);
	
}
