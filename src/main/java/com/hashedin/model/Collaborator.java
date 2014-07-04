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

@Entity
public class Collaborator {

	@Id
	@GeneratedValue
	
	private Long uId;
	private String tName;
	private String uDesig;
	private String uImgUrl;
	@OneToMany(fetch=FetchType.EAGER,mappedBy="tAssignedUser")
	private List<Task> tasks = new ArrayList<Task>();
	
	public String gettName() {
		return tName;
	}

	public String getuDesig() {
		return uDesig;
	}

	public Long getuId() {
		return uId;
	}

	public String getuImgUrl() {
		return uImgUrl;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public void setuDesig(String uDesig) {
		this.uDesig = uDesig;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public void setuImgUrl(String uImgUrl) {
		this.uImgUrl = uImgUrl;
	}

}
