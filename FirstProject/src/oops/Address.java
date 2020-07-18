package oops;

public class Address {
	
	private short houseNo;
	private String city;
	private String state;
	private int pincode;
	private String landmark;
	
	public Address(int houseNo, String city, String state, int pincode, String landmark) {
		this.houseNo = (short) houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	
	public short getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(short houseNo) {
		if(houseNo > 0) this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		if(city != null && city != "") this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state != null && state != "") this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		if(String.valueOf(pincode).length() == 6) this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		if(landmark != null && landmark != "") this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", landmark=" + landmark + "]";
	}
	
}
