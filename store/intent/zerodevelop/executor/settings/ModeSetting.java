package store.intent.zerodevelop.executor.settings;

import java.util.Arrays;
import java.util.List;

public class ModeSetting extends Setting {

	public String current;
	public List<String> names;
	
	public ModeSetting(String name, String current, String... names) {
		super(name);
		this.current = current;
		this.names = Arrays.asList(names);
	}

	public ModeSetting(String name, String description, String current, String... names) {
		super(name, description);
		this.current = current;
		this.names = Arrays.asList(names);
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}
	
	public void cycle() {
		int index = names.indexOf(current) + 1;
		setCurrent(index >= names.size() ? names.get(0) : names.get(index));
	}

}
