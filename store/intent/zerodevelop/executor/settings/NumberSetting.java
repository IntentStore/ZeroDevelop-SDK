package store.intent.zerodevelop.executor.settings;

public class NumberSetting extends Setting {

	public double value, minimum, maximum, increment;
	
	public NumberSetting(String name, double value, double minimum, double maximum, double increment) {
		super(name);
		this.value = value;
		this.minimum = minimum;
		this.maximum = maximum;
		this.increment = increment;
	}

	public NumberSetting(String name, String description, double value, double minimum, double maximum, double increment) {
		super(name, description);
		this.value = value;
		this.minimum = minimum;
		this.maximum = maximum;
		this.increment = increment;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getMinimum() {
		return minimum;
	}

	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public void setMaximum(double maximum) {
		this.maximum = maximum;
	}

	public double getIncrement() {
		return increment;
	}

	public void setIncrement(double increment) {
		this.increment = increment;
	}

}
