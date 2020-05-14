package store.intent.zerodevelop.custom;

import store.intent.zerodevelop.event.EventMotion;
import store.intent.zerodevelop.event.EventMove;
import store.intent.zerodevelop.event.EventReceivePacket;
import store.intent.zerodevelop.event.EventSendPacket;
import store.intent.zerodevelop.executor.Module;
import store.intent.zerodevelop.executor.settings.ModeSetting;
import store.intent.zerodevelop.executor.settings.NumberSetting;
import store.intent.zerodevelop.executor.settings.ToggleSetting;
import store.intent.zerodevelop.util.Version;

public class Template extends Module {

	public NumberSetting number = new NumberSetting("Number", "This setting doesn't do anything", 10, 1, 20, 1);
	public ToggleSetting toggle = new ToggleSetting("Boolean", "This setting also doesn't do anything", true);
	public ModeSetting mode = new ModeSetting("Mode", "This is a mode setting", "One", new String[] {"One", "Two", "Three"});

	@Override
	public void registerSettings() {
		addSetting(number);
		addSetting(toggle);
		addSetting(mode);
	}
	
	@Override
	public Version getBuildVersion() {
		/**Return 1.2.0 because that is the version of the SDK we're using.
		   It will help us evaluate compatibility when newer versions are available */
		
		return new Version(1, 2, 0);
	}

	@Override
	public Category getCategory() {
		return Category.COMBAT;
	}

	@Override
	public String getDescription() {
		return "The module description";
	}
	
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onTick() {
		
	}
	
	@Override
	public void onUpdate() {
		
	}
	
	@Override
	public void onMotion(EventMotion event) {
		
	}

	@Override
	public void onSend(EventSendPacket event) {
		
	}

	@Override
	public void onReceive(EventReceivePacket event) {
		
	}

	@Override
	public void onMove(EventMove event) {
		
	}

}
