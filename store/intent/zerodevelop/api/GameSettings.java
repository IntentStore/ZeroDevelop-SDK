package store.intent.zerodevelop.api;

import store.intent.zerodevelop.util.KeyBind;

public interface GameSettings {

	boolean isKeyDown(KeyBind key);

	void setKeyDown(KeyBind key, boolean pressed);

	boolean isViewBobbing();

	void setViewBobbing(boolean enabled);

	boolean isGuiHidden();

	void setHideGui(boolean enabled);

	boolean isShowingDebugMenu();

	void setShowDebugMenu(boolean enabled);

	int getFrameRateLimit();

	void setFrameRateLimit(int fps);

	int getThirdPersonViewState();

	void setThirdPersonViewState(int id);

	float getMouseSensitivity();

	void setMouseSensitivity(float multiplier);

	float getChatOpacity();

	void setChatOpacity(float opacity);
	
}
