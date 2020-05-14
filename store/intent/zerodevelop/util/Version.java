package store.intent.zerodevelop.util;

public class Version {

	public int major, minor, patch;

	//TODO KEEP API UP TO DATE
	/**
	 * Current API version is 1.2.0
	 * @param major Major Version
	 * @param minor Minor Version
	 * @param patch Patch Version
	 */
	public Version(int major, int minor, int patch) {
		this.major = major;
		this.minor = minor;
		this.patch = patch;
	}
	
	/**
	 * @param compare Version to compare to
	 * @return Whether or not the compare parameter is an older version
	 */
	public boolean isOlder(Version compare) {
		if(compare.major < major) {
			return true;
		}else if(compare.minor < minor) {
			return true;
		}else if(compare.patch < patch) {
			return true;
		}
		return false;
	}
	
	public boolean isEqual(Version compare) {
		return compare.getMajor() == major && compare.getMinor() == minor && compare.getPatch() == patch;
	}
	
	/**
	 * @param compare Version to compare to
	 * @return Whether or not the compare parameter is a newer version
	 */
	public boolean isNewer(Version compare) {
		if(compare.major > major) {
			return true;
		}else if(compare.minor > minor) {
			return true;
		}else if(compare.patch > patch) {
			return true;
		}
		return false;
	}

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		this.major = major;
	}

	public int getMinor() {
		return minor;
	}

	public void setMinor(int minor) {
		this.minor = minor;
	}

	public int getPatch() {
		return patch;
	}

	public void setPatch(int patch) {
		this.patch = patch;
	}
	
	@Override
	public String toString() {
		return "Version [" + getVersion() + "]";
	}

	public String getVersion() {
		return major + "." + minor + "." + patch;
	}

}
