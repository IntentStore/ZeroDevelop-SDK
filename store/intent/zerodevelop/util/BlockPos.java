package store.intent.zerodevelop.util;

public class BlockPos {

	double x, y, z;

	public BlockPos(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public BlockPos(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public BlockPos add(double x, double y, double z) {
        return x == 0.0D && y == 0.0D && z == 0.0D ? this : new BlockPos((double)this.getX() + x, (double)this.getY() + y, (double)this.getZ() + z);
    }
	
	public BlockPos subtract(double x, double y, double z) {
        return x == 0.0D && y == 0.0D && z == 0.0D ? this : new BlockPos((double)this.getX() - x, (double)this.getY() - y, (double)this.getZ() - z);
    }
	
	public BlockPos add(int x, int y, int z) {
        return x == 0.0D && y == 0.0D && z == 0.0D ? this : new BlockPos((double)this.getX() + x, (double)this.getY() + y, (double)this.getZ() + z);
    }
	
	public BlockPos subtract(int x, int y, int z) {
        return x == 0.0D && y == 0.0D && z == 0.0D ? this : new BlockPos((double)this.getX() - x, (double)this.getY() - y, (double)this.getZ() - z);
    }

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

}
