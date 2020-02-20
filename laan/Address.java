package laan;

public class Address {
	String cityName;
    int phoneno;
    int pin;
   
     @Override
	public String toString() {
		return "Address [cityName=" + cityName + ", phoneno=" + phoneno + ", pin=" + pin + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
     Address(String cityName,int phoneno,int pin)
     {
    	 this.cityName=cityName;
    	 this.phoneno=phoneno;
    	 this.pin=pin;
     }
	
     public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin)a {
		this.pin = pin;
		
	}
	
}
