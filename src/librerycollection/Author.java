package librerycollection;

public class Author {
	String auhtorname;
	String emailid;
	String place;
	int date;
	public String getAuhtorname() {
		return auhtorname;
	}
	public void setAuhtorname(String auhtorname) {
		this.auhtorname = auhtorname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Author [auhtorname=" + auhtorname + ", emailid=" + emailid + ", place=" + place + ", date=" + date
				+ "]";
	}

}
