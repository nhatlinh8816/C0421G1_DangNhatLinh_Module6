package assigment2;

import java.util.ArrayList;
import java.util.List;

public class Certificate {
	private int certificatedID;
	private String certificateName;
	private String certificateRank;
	private String certificateDate;
	
	protected Certificate() {
	}

	public Certificate(int certificatedID, String certificateName, String certificateRank, String certificateDate) {
		this.certificatedID = certificatedID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificateDate = certificateDate;
	}

	public int getCertificatedID() {
		return certificatedID;
	}

	public void setCertificatedID(int certificatedID) {
		this.certificatedID = certificatedID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateRank() {
		return certificateRank;
	}

	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	@Override
	public String toString() {
		return "Certificate [certificatedID=" + certificatedID + ", certificateName=" + certificateName
				+ ", certificateRank=" + certificateRank + ", certificateDate=" + certificateDate + "]";
	}
	
	
	
	
}
