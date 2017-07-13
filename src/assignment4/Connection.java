package assignment4;

public class Connection {

	@Override
	public String toString() {
		return "Connection [driverName=" + driverName + ", username="
				+ username + ", password=" + password + ", url=" + url + "]";
	}
	
	private String driverName,username,password,url;
	
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getDriverName() {
		return driverName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getUrl() {
		return url;
	}
	
}
