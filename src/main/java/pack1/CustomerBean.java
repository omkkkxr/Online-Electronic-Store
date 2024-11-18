package pack1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable{
	private String cuname,cpass,cfname,clname,caddr,cmail,cphno;

	public String getCuname() {
		return cuname;
	}

	public void setCuname(String cuname) {
		this.cuname = cuname;
	}

	public String getCpass() {
		return cpass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public String getCfname() {
		return cfname;
	}

	public void setCfname(String cfname) {
		this.cfname = cfname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCaddr() {
		return caddr;
	}

	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}

	public String getCphno() {
		return cphno;
	}

	public void setCphno(String cphno) {
		this.cphno = cphno;
	}
	public CustomerBean() {

	}
}
