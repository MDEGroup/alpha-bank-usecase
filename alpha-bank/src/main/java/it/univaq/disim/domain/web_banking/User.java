package it.univaq.disim.domain.web_banking;

import java.util.Date;

public class User {

	private int UserId;
	private int PersId;
	private boolean Active;
	private int UnsucVerif;
	private int UserGrpId;
	private int SubsId;
	private int UserType;
	private boolean MustApprGlProf;
	private Date LastSignOnDateTime;
	private int LastSignOnChannelId;
	private int MaxSessionTime;
	private int MaxInactivityTime;
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getPersId() {
		return PersId;
	}
	public void setPersId(int persId) {
		PersId = persId;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
	}
	public int getUnsucVerif() {
		return UnsucVerif;
	}
	public void setUnsucVerif(int unsucVerif) {
		UnsucVerif = unsucVerif;
	}
	public int getUserGrpId() {
		return UserGrpId;
	}
	public void setUserGrpId(int userGrpId) {
		UserGrpId = userGrpId;
	}
	public int getSubsId() {
		return SubsId;
	}
	public void setSubsId(int subsId) {
		SubsId = subsId;
	}
	public int getUserType() {
		return UserType;
	}
	public void setUserType(int userType) {
		UserType = userType;
	}
	public boolean isMustApprGlProf() {
		return MustApprGlProf;
	}
	public void setMustApprGlProf(boolean mustApprGlProf) {
		MustApprGlProf = mustApprGlProf;
	}
	public Date getLastSignOnDateTime() {
		return LastSignOnDateTime;
	}
	public void setLastSignOnDateTime(Date lastSignOnDateTime) {
		LastSignOnDateTime = lastSignOnDateTime;
	}
	public int getLastSignOnChannelId() {
		return LastSignOnChannelId;
	}
	public void setLastSignOnChannelId(int lastSignOnChannelId) {
		LastSignOnChannelId = lastSignOnChannelId;
	}
	public int getMaxSessionTime() {
		return MaxSessionTime;
	}
	public void setMaxSessionTime(int maxSessionTime) {
		MaxSessionTime = maxSessionTime;
	}
	public int getMaxInactivityTime() {
		return MaxInactivityTime;
	}
	public void setMaxInactivityTime(int maxInactivityTime) {
		MaxInactivityTime = maxInactivityTime;
	}
}
