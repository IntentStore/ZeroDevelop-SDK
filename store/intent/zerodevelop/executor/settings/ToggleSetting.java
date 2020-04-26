package store.intent.zerodevelop.executor.settings;

public class ToggleSetting extends Setting {

	public boolean enabled;
	
	public ToggleSetting(String name, boolean enabled) {
		super(name);
		this.enabled = enabled;
	}

	public ToggleSetting(String name, String description, boolean enabled) {
		super(name, description);
		this.enabled = enabled;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
