package com.capg.stud.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class certifications {
	
	@Column(name="Technical")
	private int certificateId;
	private String certificateName;
	public int getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public certifications(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}
	public certifications() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "certifications [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}
	
	
	

}
