

public class Whether {

	private int dom;
	private int hTemp;
	private int lTemp;
	private int rain;
	private int snow;
	
	public Whether() {
		dom=0;
		hTemp=999;
		lTemp=-999;
		rain=99;
		snow=99;
	}

	public int getDom() {
		return dom;
	}

	public void setDom(int dom) {
		this.dom = dom;
	}

	public int gethTemp() {
		return hTemp;
	}

	public void sethTemp(int hTemp) {
		this.hTemp = hTemp;
	}

	public int getlTemp() {
		return lTemp;
	}

	public void setlTemp(int lTemp) {
		this.lTemp = lTemp;
	}

	public int getRain() {
		return rain;
	}

	public void setRain(int rain) {
		this.rain = rain;
	}

	public int getSnow() {
		return snow;
	}

	public void setSnow(int snow) {
		this.snow = snow;
	}
	
	
}
