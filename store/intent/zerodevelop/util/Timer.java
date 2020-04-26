package store.intent.zerodevelop.util;

public class Timer {

	public long lastMS;
	
	public Timer() {}
	
	public boolean hasTimeElapsed(int ms, boolean reset) {
		long currentTime = getCurrentTime();
		
		if(lastMS == 0)
			lastMS = currentTime;
		
		boolean elapsed = currentTime - lastMS > ms;
		
		if(elapsed && reset)
			reset();
		
		return elapsed;
	}
	
	public long getCurrentTime() {
		return System.nanoTime() / 1000000;
	}
	
	public long getElapsedTime() {
		return getCurrentTime() - lastMS;
	}
	
	public void reset() {
		lastMS = getCurrentTime();
	}

}
