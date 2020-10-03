package store.intent.zerodevelop.api;

public interface Client {

	void enable(String name);
	
	void disable(String name);
	
	void toggle(String name);
	
	boolean isEnabled(String name);
	
	String getName();
	
	String getVersion();
	
}
