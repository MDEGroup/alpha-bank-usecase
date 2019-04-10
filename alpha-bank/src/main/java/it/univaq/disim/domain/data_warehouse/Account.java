package it.univaq.disim.domain.data_warehouse;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Account {
	@Id
	private long AC_ID;
	private long AC_CTR_ID;
	private long AC_PROD_ID;
	private long AC_OBLG_ID;
	private long AC_LOAN_AC_ID;
	private long AC_MNT_SVC_BR_ID;
	private long AC_WHLSL_DNCMT_ID;
	private String AC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM;
	private String AC_OBLG_CDI_CODE;
	private String AC_OBLG_IDENTN_NUM;
	private String AC_OBLG_IDENTN_TP_DSC;
	private String AC_LMT_CODE;
	private Date AC_OPN_DT;
	private Date AC_CLS_DT;
	private String AC_SVC_TP_DSC;
	private String AC_HOST_CODE;
	private String AC_INT_CLCN_IN_ADV;
	private String AC_APL_NUM;
	private String AC_SYND_IND;
	
	public long getAC_ID() {
		return AC_ID;
	}
	public void setAC_ID(long aC_ID) {
		AC_ID = aC_ID;
	}
	public long getAC_CTR_ID() {
		return AC_CTR_ID;
	}
	public void setAC_CTR_ID(long aC_CTR_ID) {
		AC_CTR_ID = aC_CTR_ID;
	}
	public long getAC_PROD_ID() {
		return AC_PROD_ID;
	}
	public void setAC_PROD_ID(long aC_PROD_ID) {
		AC_PROD_ID = aC_PROD_ID;
	}
	public long getAC_OBLG_ID() {
		return AC_OBLG_ID;
	}
	public void setAC_OBLG_ID(long aC_OBLG_ID) {
		AC_OBLG_ID = aC_OBLG_ID;
	}
	public long getAC_LOAN_AC_ID() {
		return AC_LOAN_AC_ID;
	}
	public void setAC_LOAN_AC_ID(long aC_LOAN_AC_ID) {
		AC_LOAN_AC_ID = aC_LOAN_AC_ID;
	}
	public long getAC_MNT_SVC_BR_ID() {
		return AC_MNT_SVC_BR_ID;
	}
	public void setAC_MNT_SVC_BR_ID(long aC_MNT_SVC_BR_ID) {
		AC_MNT_SVC_BR_ID = aC_MNT_SVC_BR_ID;
	}
	public long getAC_WHLSL_DNCMT_ID() {
		return AC_WHLSL_DNCMT_ID;
	}
	public void setAC_WHLSL_DNCMT_ID(long aC_WHLSL_DNCMT_ID) {
		AC_WHLSL_DNCMT_ID = aC_WHLSL_DNCMT_ID;
	}
	public String getAC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM() {
		return AC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM;
	}
	public void setAC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM(String aC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM) {
		AC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM = aC_DNCMT_WHLSL_COLL_DEPT_FILE_NUM;
	}
	public String getAC_OBLG_CDI_CODE() {
		return AC_OBLG_CDI_CODE;
	}
	public void setAC_OBLG_CDI_CODE(String aC_OBLG_CDI_CODE) {
		AC_OBLG_CDI_CODE = aC_OBLG_CDI_CODE;
	}
	public String getAC_OBLG_IDENTN_NUM() {
		return AC_OBLG_IDENTN_NUM;
	}
	public void setAC_OBLG_IDENTN_NUM(String aC_OBLG_IDENTN_NUM) {
		AC_OBLG_IDENTN_NUM = aC_OBLG_IDENTN_NUM;
	}
	public String getAC_OBLG_IDENTN_TP_DSC() {
		return AC_OBLG_IDENTN_TP_DSC;
	}
	public void setAC_OBLG_IDENTN_TP_DSC(String aC_OBLG_IDENTN_TP_DSC) {
		AC_OBLG_IDENTN_TP_DSC = aC_OBLG_IDENTN_TP_DSC;
	}
	public String getAC_LMT_CODE() {
		return AC_LMT_CODE;
	}
	public void setAC_LMT_CODE(String aC_LMT_CODE) {
		AC_LMT_CODE = aC_LMT_CODE;
	}
	public Date getAC_OPN_DT() {
		return AC_OPN_DT;
	}
	public void setAC_OPN_DT(Date aC_OPN_DT) {
		AC_OPN_DT = aC_OPN_DT;
	}
	public Date getAC_CLS_DT() {
		return AC_CLS_DT;
	}
	public void setAC_CLS_DT(Date aC_CLS_DT) {
		AC_CLS_DT = aC_CLS_DT;
	}
	public String getAC_SVC_TP_DSC() {
		return AC_SVC_TP_DSC;
	}
	public void setAC_SVC_TP_DSC(String aC_SVC_TP_DSC) {
		AC_SVC_TP_DSC = aC_SVC_TP_DSC;
	}
	public String getAC_HOST_CODE() {
		return AC_HOST_CODE;
	}
	public void setAC_HOST_CODE(String aC_HOST_CODE) {
		AC_HOST_CODE = aC_HOST_CODE;
	}
	public String getAC_INT_CLCN_IN_ADV() {
		return AC_INT_CLCN_IN_ADV;
	}
	public void setAC_INT_CLCN_IN_ADV(String aC_INT_CLCN_IN_ADV) {
		AC_INT_CLCN_IN_ADV = aC_INT_CLCN_IN_ADV;
	}
	public String getAC_APL_NUM() {
		return AC_APL_NUM;
	}
	public void setAC_APL_NUM(String aC_APL_NUM) {
		AC_APL_NUM = aC_APL_NUM;
	}
	public String getAC_SYND_IND() {
		return AC_SYND_IND;
	}
	public void setAC_SYND_IND(String aC_SYND_IND) {
		AC_SYND_IND = aC_SYND_IND;
	}
	
	
}
