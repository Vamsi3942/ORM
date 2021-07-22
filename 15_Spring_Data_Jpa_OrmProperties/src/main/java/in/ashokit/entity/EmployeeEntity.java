package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Employee_Tbl")
public class EmployeeEntity 
{
	@Id
	@Column(name="EMP_ID")
	private Integer eid;
	@Column(name="EMP_NAME")
	private String ename;
	@Column(name="EMP_SAL")
	private Double esal;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	
	
	
}
