package com.hashedin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;


@XmlRootElement
@Entity
@Table(name = "tasks")
@NamedQueries({ @NamedQuery(name = "Task.findAll", query = "SELECT t FROM Task t"),
				@NamedQuery(name = "Task.findByUid", query = "SELECT t FROM Task t where t.tAssignedUser=:uId")})

public class Task
{

    @Id
    @GeneratedValue
    private Long tId;
    private String tName;
    private String tDesc;
    private String tCreateDate;
    @XmlInverseReference(mappedBy="uId")
    @ManyToOne
    private Collaborator tAssignedUser;
    private String tDueDate;
    private String tStatus;
    @XmlInverseReference(mappedBy="pId")
    @ManyToOne
    private Project pId;
	public Long gettId() {
		return tId;
	}
	public void settId(Long tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettDesc() {
		return tDesc;
	}
	public void settDesc(String tDesc) {
		this.tDesc = tDesc;
	}
	public String gettCreateDate() {
		return tCreateDate;
	}
	public void settCreateDate(String tCreateDate) {
		this.tCreateDate = tCreateDate;
	}
	public Collaborator gettAssignedUser() {
		return tAssignedUser;
	}
	public void settAssignedUser(Collaborator tAssignedUser) {
		this.tAssignedUser = tAssignedUser;
	}
	public String gettDueDate() {
		return tDueDate;
	}
	public void settDueDate(String tDueDate) {
		this.tDueDate = tDueDate;
	}
	public String gettStatus() {
		return tStatus;
	}
	public void settStatus(String tStatus) {
		this.tStatus = tStatus;
	}
	public Project getpId() {
		return pId;
	}
	public void setpId(Project pId) {
		this.pId = pId;
	}


   

}
