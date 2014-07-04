package com.hashedin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "projects")
// @NamedQueries({ @NamedQuery(name = "Task.findAll", query =
// "SELECT t FROM Task t") })
public class Project {

	@Id
	@GeneratedValue
	private Long pId;
	private String pTitle;
	private String pDesc;
	private String pStatus;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="pId")
	private List<Task> tasks = new ArrayList<Task>();
	


	public String getpDesc() {
		return pDesc;
	}

	public Long getpId() {
		return pId;
	}

	public String getpStatus() {
		return pStatus;
	}

	public String getpTitle() {
		return pTitle;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	

}
