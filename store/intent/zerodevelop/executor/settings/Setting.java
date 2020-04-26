package store.intent.zerodevelop.executor.settings;

public class Setting {

	public String name, description;

	public Setting(String name) {
		this.name = name;
	}

	public Setting(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
