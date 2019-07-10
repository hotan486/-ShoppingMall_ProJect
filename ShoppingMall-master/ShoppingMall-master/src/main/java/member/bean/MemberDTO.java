package member.bean;

public class MemberDTO {

	private String id;
	private String password;
	private String name;
	private String insdate;
	private String useyn;
	
	@Override
	public String toString() {
		return "LoginDTO [id=" + id + ", password=" + password + ", name=" + name + ", insdate=" + insdate + ", useyn="
				+ useyn + "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInsdate() {
		return insdate;
	}
	public void setInsdate(String insdate) {
		this.insdate = insdate;
	}
	public String getUseyn() {
		return useyn;
	}
	public void setUseyn(String useyn) {
		this.useyn = useyn;
	}
	
}
