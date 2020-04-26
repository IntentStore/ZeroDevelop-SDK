package store.intent.zerodevelop.event;

public class Cancellable {

	public boolean cancelled;

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public static enum Type {
		PRE,
		POST;
	}
	
}
