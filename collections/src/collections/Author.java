package collections;

public class Author {
	
	private String authorname;
	private int mobno;
	private String address;
	@Override
	public String toString() {
		return "Author [authorname=" + authorname + ", mobno=" + mobno + ", address=" + address + "]";
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
