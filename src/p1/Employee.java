package p1;

public class Employee 
{
	private int empid;
	private String ename;
	private Address addr;
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public Address getAddr() {
		return addr;
	}
	
	
}
