package it.univaq.disim.domain.web_banking;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import it.univaq.disim.domain.data_warehouse.CustomerGeneral;

@Document
public class Subscription {
	@Id
	private String id;
	private int subType;
	private boolean active;
	private int compId;
	private int contPersId;
	private Date productLastChanged;
	private int langId;
	private int applicationProvId;
	private String applicationBranch;
	private Date creationDate;
	private Date signDate;
	private int signProvId;
	private String signBranch;
	private long basicProdId;
	private String personalCompName;
	private String personalCompTitle;
	private int deactivatedTransId;
	private int maxApprLevel;
	private int maxApprLevelForSubsMaintenance;
	private String administrtationUnit;
	private long customerGeneralID;
	@Transient
	private CustomerGeneral customerGeneral;
	
	public String getId() {
		return id;
	}
	public void setId(String subsId) {
		this.id = subsId;
	}
	public int getSubType() {
		return subType;
	}
	public void setSubType(int subType) {
		this.subType = subType;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public int getContPersId() {
		return contPersId;
	}
	public void setContPersId(int contPersId) {
		this.contPersId = contPersId;
	}
	public Date getProductLastChanged() {
		return productLastChanged;
	}
	public void setProductLastChanged(Date productLastChanged) {
		this.productLastChanged = productLastChanged;
	}
	public int getLangId() {
		return langId;
	}
	public void setLangId(int langId) {
		this.langId = langId;
	}
	public int getApplicationProvId() {
		return applicationProvId;
	}
	public void setApplicationProvId(int applicationProvId) {
		this.applicationProvId = applicationProvId;
	}
	public String getApplicationBranch() {
		return applicationBranch;
	}
	public void setApplicationBranch(String applicationBranch) {
		this.applicationBranch = applicationBranch;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getSignDate() {
		return signDate;
	}
	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}
	public int getSignProvId() {
		return signProvId;
	}
	public void setSignProvId(int signProvId) {
		this.signProvId = signProvId;
	}
	public String getSignBranch() {
		return signBranch;
	}
	public void setSignBranch(String signBranch) {
		this.signBranch = signBranch;
	}
	public long getBasicProdId() {
		return basicProdId;
	}
	public void setBasicProdId(long basicProdId) {
		this.basicProdId = basicProdId;
	}
	public String getPersonalCompName() {
		return personalCompName;
	}
	public void setPersonalCompName(String personalCompName) {
		this.personalCompName = personalCompName;
	}
	public String getPersonalCompTitle() {
		return personalCompTitle;
	}
	public void setPersonalCompTitle(String personalCompTitle) {
		this.personalCompTitle = personalCompTitle;
	}
	public int getDeactivatedTransId() {
		return deactivatedTransId;
	}
	public void setDeactivatedTransId(int deactivatedTransId) {
		this.deactivatedTransId = deactivatedTransId;
	}
	public int getMaxApprLevel() {
		return maxApprLevel;
	}
	public void setMaxApprLevel(int maxApprLevel) {
		this.maxApprLevel = maxApprLevel;
	}
	public int getMaxApprLevelForSubsMaintenance() {
		return maxApprLevelForSubsMaintenance;
	}
	public void setMaxApprLevelForSubsMaintenance(int maxApprLevelForSubsMaintenance) {
		this.maxApprLevelForSubsMaintenance = maxApprLevelForSubsMaintenance;
	}
	public String getAdministrtationUnit() {
		return administrtationUnit;
	}
	public void setAdministrtationUnit(String administrtationUnit) {
		this.administrtationUnit = administrtationUnit;
	}
	public long getCustomerGeneralID() {
		return customerGeneralID;
	}
	public void setCustomerGeneralID(long customerGeneralID) {
		this.customerGeneralID = customerGeneralID;
	}
	public CustomerGeneral getCustomerGeneral() {
		return customerGeneral;
	}
	public void setCustomerGeneral(CustomerGeneral customerGeneral) {
		this.customerGeneral = customerGeneral;
	}
	
	
	

}
