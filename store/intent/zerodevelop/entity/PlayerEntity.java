package store.intent.zerodevelop.entity;

public class PlayerEntity extends Entity {

	boolean isYou;
	
	public boolean isYou() {
		return isYou;
	}

	public void setYou(boolean isYou) {
		this.isYou = isYou;
	}

	public PlayerEntity(int id) {
		super(id);
	}

}
