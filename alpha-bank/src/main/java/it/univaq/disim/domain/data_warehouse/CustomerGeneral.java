package it.univaq.disim.domain.data_warehouse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerGeneral {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;
	private long OBLG_GRP_ID;
	private String OBLG_GRP_CODE;
	private long OBLG_SVC_BR_ID;
	private long OBLG_TP_OF_ENT_ID;
	private long OBLG_CO_TP_ID;
	private long OBLG_CTF_TP_ID;
	private String OBLG_CDI_CODE;
	private String OBLG_IDENTN_NUM;
	private long OBLG_IDENTN_TP_ID;
	private String OBLG_IDENTN_TP_CODE;
	private String OBLG_IDENTN_TP_DSC;
	private String OBLG_TAX_NUM;
	private long OBLG_WHLSL_IND_ID;
	private String OBLG_WHLSL_IND_CODE;
	private String OBLG_WHLSL_IND_DSC;
	private String OBLG_CTF_CODE;
	private String OBLG_ISIN_CODE;
	private String OBLG_RGST_NM;
	private String OBLG_NM;
	private String OBLG_SURNM;
	private String OBLG_SHRT_NM;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getOBLG_GRP_ID() {
		return OBLG_GRP_ID;
	}

	public void setOBLG_GRP_ID(long oBLG_GRP_ID) {
		OBLG_GRP_ID = oBLG_GRP_ID;
	}

	public String getOBLG_GRP_CODE() {
		return OBLG_GRP_CODE;
	}

	public void setOBLG_GRP_CODE(String oBLG_GRP_CODE) {
		OBLG_GRP_CODE = oBLG_GRP_CODE;
	}

	public long getOBLG_SVC_BR_ID() {
		return OBLG_SVC_BR_ID;
	}

	public void setOBLG_SVC_BR_ID(long oBLG_SVC_BR_ID) {
		OBLG_SVC_BR_ID = oBLG_SVC_BR_ID;
	}

	public long getOBLG_TP_OF_ENT_ID() {
		return OBLG_TP_OF_ENT_ID;
	}

	public void setOBLG_TP_OF_ENT_ID(long oBLG_TP_OF_ENT_ID) {
		OBLG_TP_OF_ENT_ID = oBLG_TP_OF_ENT_ID;
	}

	public long getOBLG_CO_TP_ID() {
		return OBLG_CO_TP_ID;
	}

	public void setOBLG_CO_TP_ID(long oBLG_CO_TP_ID) {
		OBLG_CO_TP_ID = oBLG_CO_TP_ID;
	}

	public long getOBLG_CTF_TP_ID() {
		return OBLG_CTF_TP_ID;
	}

	public void setOBLG_CTF_TP_ID(long oBLG_CTF_TP_ID) {
		OBLG_CTF_TP_ID = oBLG_CTF_TP_ID;
	}

	public String getOBLG_CDI_CODE() {
		return OBLG_CDI_CODE;
	}

	public void setOBLG_CDI_CODE(String oBLG_CDI_CODE) {
		OBLG_CDI_CODE = oBLG_CDI_CODE;
	}

	public String getOBLG_IDENTN_NUM() {
		return OBLG_IDENTN_NUM;
	}

	public void setOBLG_IDENTN_NUM(String oBLG_IDENTN_NUM) {
		OBLG_IDENTN_NUM = oBLG_IDENTN_NUM;
	}

	public long getOBLG_IDENTN_TP_ID() {
		return OBLG_IDENTN_TP_ID;
	}

	public void setOBLG_IDENTN_TP_ID(long oBLG_IDENTN_TP_ID) {
		OBLG_IDENTN_TP_ID = oBLG_IDENTN_TP_ID;
	}

	public String getOBLG_IDENTN_TP_CODE() {
		return OBLG_IDENTN_TP_CODE;
	}

	public void setOBLG_IDENTN_TP_CODE(String oBLG_IDENTN_TP_CODE) {
		OBLG_IDENTN_TP_CODE = oBLG_IDENTN_TP_CODE;
	}

	public String getOBLG_IDENTN_TP_DSC() {
		return OBLG_IDENTN_TP_DSC;
	}

	public void setOBLG_IDENTN_TP_DSC(String oBLG_IDENTN_TP_DSC) {
		OBLG_IDENTN_TP_DSC = oBLG_IDENTN_TP_DSC;
	}

	public String getOBLG_TAX_NUM() {
		return OBLG_TAX_NUM;
	}

	public void setOBLG_TAX_NUM(String oBLG_TAX_NUM) {
		OBLG_TAX_NUM = oBLG_TAX_NUM;
	}

	public long getOBLG_WHLSL_IND_ID() {
		return OBLG_WHLSL_IND_ID;
	}

	public void setOBLG_WHLSL_IND_ID(long oBLG_WHLSL_IND_ID) {
		OBLG_WHLSL_IND_ID = oBLG_WHLSL_IND_ID;
	}

	public String getOBLG_WHLSL_IND_CODE() {
		return OBLG_WHLSL_IND_CODE;
	}

	public void setOBLG_WHLSL_IND_CODE(String oBLG_WHLSL_IND_CODE) {
		OBLG_WHLSL_IND_CODE = oBLG_WHLSL_IND_CODE;
	}

	public String getOBLG_WHLSL_IND_DSC() {
		return OBLG_WHLSL_IND_DSC;
	}

	public void setOBLG_WHLSL_IND_DSC(String oBLG_WHLSL_IND_DSC) {
		OBLG_WHLSL_IND_DSC = oBLG_WHLSL_IND_DSC;
	}

	public String getOBLG_CTF_CODE() {
		return OBLG_CTF_CODE;
	}

	public void setOBLG_CTF_CODE(String oBLG_CTF_CODE) {
		OBLG_CTF_CODE = oBLG_CTF_CODE;
	}

	public String getOBLG_ISIN_CODE() {
		return OBLG_ISIN_CODE;
	}

	public void setOBLG_ISIN_CODE(String oBLG_ISIN_CODE) {
		OBLG_ISIN_CODE = oBLG_ISIN_CODE;
	}

	public String getOBLG_RGST_NM() {
		return OBLG_RGST_NM;
	}

	public void setOBLG_RGST_NM(String oBLG_RGST_NM) {
		OBLG_RGST_NM = oBLG_RGST_NM;
	}

	public String getOBLG_NM() {
		return OBLG_NM;
	}

	public void setOBLG_NM(String oBLG_NM) {
		OBLG_NM = oBLG_NM;
	}

	public String getOBLG_SURNM() {
		return OBLG_SURNM;
	}

	public void setOBLG_SURNM(String oBLG_SURNM) {
		OBLG_SURNM = oBLG_SURNM;
	}

	public String getOBLG_SHRT_NM() {
		return OBLG_SHRT_NM;
	}

	public void setOBLG_SHRT_NM(String oBLG_SHRT_NM) {
		OBLG_SHRT_NM = oBLG_SHRT_NM;
	}
}
