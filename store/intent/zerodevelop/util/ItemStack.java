package store.intent.zerodevelop.util;

public class ItemStack {

	public int id, size, meta;
	public String name, hashCode;

	public ItemStack(int id, int size, int meta, String name, String hashCode) {
		this.id = id;
		this.size = size;
		this.meta = meta;
		this.hashCode = hashCode;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMeta() {
		return meta;
	}

	public void setMeta(int meta) {
		this.meta = meta;
	}

	public String getHashCode() {
		return hashCode;
	}

	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}

}
