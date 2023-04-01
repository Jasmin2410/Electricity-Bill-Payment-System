package Dto;

public class Consumer {
    private int id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String address;
    private String mobile_number;
    private String email;
    private String connection_status;
    private boolean is_deleted;

    public Consumer() {
    }

	public Consumer(int id, String first_name, String last_name, String username, String password, String address,
			String mobile_number, String email, String connection_status, boolean is_deleted) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobile_number = mobile_number;
		this.email = email;
		this.connection_status = connection_status;
		this.is_deleted = is_deleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConnection_status() {
		return connection_status;
	}

	public void setConnection_status(String connection_status) {
		this.connection_status = connection_status;
	}

	public boolean isIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	@Override
	public String toString() {
		return "Consumer [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", username="
				+ username + ", password=" + password + ", address=" + address + ", mobile_number=" + mobile_number
				+ ", email=" + email + ", connection_status=" + connection_status + ", is_deleted=" + is_deleted + "\n";
	}

    
}
