package lifesuggestion;

public class UltravioletRayIndex {
	/**
	 * ���
	 */
	private String brf;
	/**
	 * ����
	 */
	private String txt;
	
	public String getBrf() {
		return brf;
	}
	public void setBrf(String brf) {
		this.brf = brf;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public UltravioletRayIndex(String brf, String txt) {
		super();
		this.brf = brf;
		this.txt = txt;
	}
	public UltravioletRayIndex() {
		super();
	}
	@Override
	public String toString() {
		return "UltravioletRayIndex [brf=" + brf + ", txt=" + txt + "]";
	}
	
}
