package Study02;

public class Customer {
	public long getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getBirth() {
		return birth;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	private long no;
	private String name;
	private int birth;
	public Customer(long no, String name, int birth) {
		super();
		this.no = no;
		this.name = name;
		this.birth = birth;
	}

}
