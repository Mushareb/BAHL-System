package org.bahl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BankChequeTL")
@NamedQueries({ @NamedQuery(name = "findAll", query = "select bc from BankChequeTL bc"),
		@NamedQuery(name = "findById", query = "SELECT bc FROM BankChequeTL bc WHERE bc.id = :id") })
public class BankChequeTL {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String ISS_BRN_CD;
	private String APP_NO;
	private String APP_YEAR;
	private String BNKCHQ_NO;
	private String BNKCHQ_YEAR;
	private String ISS_DATE;
	private String RENEW_DT;
	private String STATUS;
	private String DUPLICATE_STS;
	private String BNKCHQ_AMOUNT;
	private String CR_BRN_CD;
	private String CR_CUST_NO;
	private String CR_AC_TYPE;
	private String CR_RUN_NO;
	private String CR_CHK_DIGT;
	private String IBCA_NO;
	private String NIC_NO;
	private String BENEF_NAME;
	private String BENEF_ADD1;
	private String BENEF_ADD2;
	private String BENEF_ADD3;
	private String PICKUP_NAME;
	private String PICKUP_CNIC;
	private String PICKUP_CELL_NO;
	private String PRESS_PRINT_NO;
	private String ORIG_PO_YEAR;
	private String ORIG_PO_NO;
	private String PREV_PO_YEAR;
	private String PREV_PO_NO;
	private String SUB_BRN_CD;
	private String TOT_CHARG_IB;
	private String VOUCH_NO;
	private String VOUCH_YEAR;
	private String POST_DT;
	private String POST_BY;
	private String AUTH_DT;
	private String AUTH_BY;
	private String REMARKS;
	private String PRINT_STS;
	private String REPRINT_STATUS;
	private String BENEF_NO;
	private String NO_OF_PRINT;
	private String CR_MODE;
	private String CR_VOUCH_NO;
	private String CR_VOUCH_YEAR;
	private String PAY_IBCA_NO;
	private String PRSNTNG_BRN_CD;
	private String PAY_REF_NO;
	private String PAY_REF_YEAR;
	private String ISS_REF_NO;
	private String ISS_REF_YEAR;
	private String TOTAL_CHG;
	private String STOP_CHRGS;
	private String STOP_VOUCH_NO;
	private String STOP_VOUCH_YEAR;
	private String LOCK_STS;
	private String LOCK_BY;
	private String ISS_REV_REF_NO;
	private String ISS_REV_REF_YEAR;
	private String ISSUED_BY;
	private String LOCK_BRN;
	private String BEF_NAME1;
	private String BEF_NAME2;
	private String BEF_CELL_NO;
	private String CR_CNIC_NO;
	private String APP_REQ_MODE;
	private String QR_BAR_CD;
	private String BENEF_TYPE;
	private String ID_DOC_TYPE;
	private String ID_DOC_NO;
	private String PURPOSE;
	private String BENEF_RELATION;
	private String OTHER_PURPOSE;
	private String OTHER_BENEF_RELATION;
	
	public BankChequeTL() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankChequeTL(String iSS_BRN_CD, String aPP_NO, String aPP_YEAR, String bNKCHQ_NO, String bNKCHQ_YEAR,
			String iSS_DATE, String rENEW_DT, String sTATUS, String dUPLICATE_STS, String bNKCHQ_AMOUNT,
			String cR_BRN_CD, String cR_CUST_NO, String cR_AC_TYPE, String cR_RUN_NO, String cR_CHK_DIGT,
			String iBCA_NO, String nIC_NO, String bENEF_NAME, String bENEF_ADD1, String bENEF_ADD2, String bENEF_ADD3,
			String pICKUP_NAME, String pICKUP_CNIC, String pICKUP_CELL_NO, String pRESS_PRINT_NO, String oRIG_PO_YEAR,
			String oRIG_PO_NO, String pREV_PO_YEAR, String pREV_PO_NO, String sUB_BRN_CD, String tOT_CHARG_IB,
			String vOUCH_NO, String vOUCH_YEAR, String pOST_DT, String pOST_BY, String aUTH_DT, String aUTH_BY,
			String rEMARKS, String pRINT_STS, String rEPRINT_STATUS, String bENEF_NO, String nO_OF_PRINT,
			String cR_MODE, String cR_VOUCH_NO, String cR_VOUCH_YEAR, String pAY_IBCA_NO, String pRSNTNG_BRN_CD,
			String pAY_REF_NO, String pAY_REF_YEAR, String iSS_REF_NO, String iSS_REF_YEAR, String tOTAL_CHG,
			String sTOP_CHRGS, String sTOP_VOUCH_NO, String sTOP_VOUCH_YEAR, String lOCK_STS, String lOCK_BY,
			String iSS_REV_REF_NO, String iSS_REV_REF_YEAR, String iSSUED_BY, String lOCK_BRN, String bEF_NAME1,
			String bEF_NAME2, String bEF_CELL_NO, String cR_CNIC_NO, String aPP_REQ_MODE, String qR_BAR_CD,
			String bENEF_TYPE, String iD_DOC_TYPE, String iD_DOC_NO, String pURPOSE, String bENEF_RELATION,
			String oTHER_PURPOSE, String oTHER_BENEF_RELATION) {
		super();
		ISS_BRN_CD = iSS_BRN_CD;
		APP_NO = aPP_NO;
		APP_YEAR = aPP_YEAR;
		BNKCHQ_NO = bNKCHQ_NO;
		BNKCHQ_YEAR = bNKCHQ_YEAR;
		ISS_DATE = iSS_DATE;
		RENEW_DT = rENEW_DT;
		STATUS = sTATUS;
		DUPLICATE_STS = dUPLICATE_STS;
		BNKCHQ_AMOUNT = bNKCHQ_AMOUNT;
		CR_BRN_CD = cR_BRN_CD;
		CR_CUST_NO = cR_CUST_NO;
		CR_AC_TYPE = cR_AC_TYPE;
		CR_RUN_NO = cR_RUN_NO;
		CR_CHK_DIGT = cR_CHK_DIGT;
		IBCA_NO = iBCA_NO;
		NIC_NO = nIC_NO;
		BENEF_NAME = bENEF_NAME;
		BENEF_ADD1 = bENEF_ADD1;
		BENEF_ADD2 = bENEF_ADD2;
		BENEF_ADD3 = bENEF_ADD3;
		PICKUP_NAME = pICKUP_NAME;
		PICKUP_CNIC = pICKUP_CNIC;
		PICKUP_CELL_NO = pICKUP_CELL_NO;
		PRESS_PRINT_NO = pRESS_PRINT_NO;
		ORIG_PO_YEAR = oRIG_PO_YEAR;
		ORIG_PO_NO = oRIG_PO_NO;
		PREV_PO_YEAR = pREV_PO_YEAR;
		PREV_PO_NO = pREV_PO_NO;
		SUB_BRN_CD = sUB_BRN_CD;
		TOT_CHARG_IB = tOT_CHARG_IB;
		VOUCH_NO = vOUCH_NO;
		VOUCH_YEAR = vOUCH_YEAR;
		POST_DT = pOST_DT;
		POST_BY = pOST_BY;
		AUTH_DT = aUTH_DT;
		AUTH_BY = aUTH_BY;
		REMARKS = rEMARKS;
		PRINT_STS = pRINT_STS;
		REPRINT_STATUS = rEPRINT_STATUS;
		BENEF_NO = bENEF_NO;
		NO_OF_PRINT = nO_OF_PRINT;
		CR_MODE = cR_MODE;
		CR_VOUCH_NO = cR_VOUCH_NO;
		CR_VOUCH_YEAR = cR_VOUCH_YEAR;
		PAY_IBCA_NO = pAY_IBCA_NO;
		PRSNTNG_BRN_CD = pRSNTNG_BRN_CD;
		PAY_REF_NO = pAY_REF_NO;
		PAY_REF_YEAR = pAY_REF_YEAR;
		ISS_REF_NO = iSS_REF_NO;
		ISS_REF_YEAR = iSS_REF_YEAR;
		TOTAL_CHG = tOTAL_CHG;
		STOP_CHRGS = sTOP_CHRGS;
		STOP_VOUCH_NO = sTOP_VOUCH_NO;
		STOP_VOUCH_YEAR = sTOP_VOUCH_YEAR;
		LOCK_STS = lOCK_STS;
		LOCK_BY = lOCK_BY;
		ISS_REV_REF_NO = iSS_REV_REF_NO;
		ISS_REV_REF_YEAR = iSS_REV_REF_YEAR;
		ISSUED_BY = iSSUED_BY;
		LOCK_BRN = lOCK_BRN;
		BEF_NAME1 = bEF_NAME1;
		BEF_NAME2 = bEF_NAME2;
		BEF_CELL_NO = bEF_CELL_NO;
		CR_CNIC_NO = cR_CNIC_NO;
		APP_REQ_MODE = aPP_REQ_MODE;
		QR_BAR_CD = qR_BAR_CD;
		BENEF_TYPE = bENEF_TYPE;
		ID_DOC_TYPE = iD_DOC_TYPE;
		ID_DOC_NO = iD_DOC_NO;
		PURPOSE = pURPOSE;
		BENEF_RELATION = bENEF_RELATION;
		OTHER_PURPOSE = oTHER_PURPOSE;
		OTHER_BENEF_RELATION = oTHER_BENEF_RELATION;
	}

	public String getISS_BRN_CD() {
		return ISS_BRN_CD;
	}

	public void setISS_BRN_CD(String iSS_BRN_CD) {
		ISS_BRN_CD = iSS_BRN_CD;
	}

	public String getAPP_NO() {
		return APP_NO;
	}

	public void setAPP_NO(String aPP_NO) {
		APP_NO = aPP_NO;
	}

	public String getAPP_YEAR() {
		return APP_YEAR;
	}

	public void setAPP_YEAR(String aPP_YEAR) {
		APP_YEAR = aPP_YEAR;
	}

	public String getBNKCHQ_NO() {
		return BNKCHQ_NO;
	}

	public void setBNKCHQ_NO(String bNKCHQ_NO) {
		BNKCHQ_NO = bNKCHQ_NO;
	}

	public String getBNKCHQ_YEAR() {
		return BNKCHQ_YEAR;
	}

	public void setBNKCHQ_YEAR(String bNKCHQ_YEAR) {
		BNKCHQ_YEAR = bNKCHQ_YEAR;
	}

	public String getISS_DATE() {
		return ISS_DATE;
	}

	public void setISS_DATE(String iSS_DATE) {
		ISS_DATE = iSS_DATE;
	}

	public String getRENEW_DT() {
		return RENEW_DT;
	}

	public void setRENEW_DT(String rENEW_DT) {
		RENEW_DT = rENEW_DT;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getDUPLICATE_STS() {
		return DUPLICATE_STS;
	}

	public void setDUPLICATE_STS(String dUPLICATE_STS) {
		DUPLICATE_STS = dUPLICATE_STS;
	}

	public String getBNKCHQ_AMOUNT() {
		return BNKCHQ_AMOUNT;
	}

	public void setBNKCHQ_AMOUNT(String bNKCHQ_AMOUNT) {
		BNKCHQ_AMOUNT = bNKCHQ_AMOUNT;
	}

	public String getCR_BRN_CD() {
		return CR_BRN_CD;
	}

	public void setCR_BRN_CD(String cR_BRN_CD) {
		CR_BRN_CD = cR_BRN_CD;
	}

	public String getCR_CUST_NO() {
		return CR_CUST_NO;
	}

	public void setCR_CUST_NO(String cR_CUST_NO) {
		CR_CUST_NO = cR_CUST_NO;
	}

	public String getCR_AC_TYPE() {
		return CR_AC_TYPE;
	}

	public void setCR_AC_TYPE(String cR_AC_TYPE) {
		CR_AC_TYPE = cR_AC_TYPE;
	}

	public String getCR_RUN_NO() {
		return CR_RUN_NO;
	}

	public void setCR_RUN_NO(String cR_RUN_NO) {
		CR_RUN_NO = cR_RUN_NO;
	}

	public String getCR_CHK_DIGT() {
		return CR_CHK_DIGT;
	}

	public void setCR_CHK_DIGT(String cR_CHK_DIGT) {
		CR_CHK_DIGT = cR_CHK_DIGT;
	}

	public String getIBCA_NO() {
		return IBCA_NO;
	}

	public void setIBCA_NO(String iBCA_NO) {
		IBCA_NO = iBCA_NO;
	}

	public String getNIC_NO() {
		return NIC_NO;
	}

	public void setNIC_NO(String nIC_NO) {
		NIC_NO = nIC_NO;
	}

	public String getBENEF_NAME() {
		return BENEF_NAME;
	}

	public void setBENEF_NAME(String bENEF_NAME) {
		BENEF_NAME = bENEF_NAME;
	}

	public String getBENEF_ADD1() {
		return BENEF_ADD1;
	}

	public void setBENEF_ADD1(String bENEF_ADD1) {
		BENEF_ADD1 = bENEF_ADD1;
	}

	public String getBENEF_ADD2() {
		return BENEF_ADD2;
	}

	public void setBENEF_ADD2(String bENEF_ADD2) {
		BENEF_ADD2 = bENEF_ADD2;
	}

	public String getBENEF_ADD3() {
		return BENEF_ADD3;
	}

	public void setBENEF_ADD3(String bENEF_ADD3) {
		BENEF_ADD3 = bENEF_ADD3;
	}

	public String getPICKUP_NAME() {
		return PICKUP_NAME;
	}

	public void setPICKUP_NAME(String pICKUP_NAME) {
		PICKUP_NAME = pICKUP_NAME;
	}

	public String getPICKUP_CNIC() {
		return PICKUP_CNIC;
	}

	public void setPICKUP_CNIC(String pICKUP_CNIC) {
		PICKUP_CNIC = pICKUP_CNIC;
	}

	public String getPICKUP_CELL_NO() {
		return PICKUP_CELL_NO;
	}

	public void setPICKUP_CELL_NO(String pICKUP_CELL_NO) {
		PICKUP_CELL_NO = pICKUP_CELL_NO;
	}

	public String getPRESS_PRINT_NO() {
		return PRESS_PRINT_NO;
	}

	public void setPRESS_PRINT_NO(String pRESS_PRINT_NO) {
		PRESS_PRINT_NO = pRESS_PRINT_NO;
	}

	public String getORIG_PO_YEAR() {
		return ORIG_PO_YEAR;
	}

	public void setORIG_PO_YEAR(String oRIG_PO_YEAR) {
		ORIG_PO_YEAR = oRIG_PO_YEAR;
	}

	public String getORIG_PO_NO() {
		return ORIG_PO_NO;
	}

	public void setORIG_PO_NO(String oRIG_PO_NO) {
		ORIG_PO_NO = oRIG_PO_NO;
	}

	public String getPREV_PO_YEAR() {
		return PREV_PO_YEAR;
	}

	public void setPREV_PO_YEAR(String pREV_PO_YEAR) {
		PREV_PO_YEAR = pREV_PO_YEAR;
	}

	public String getPREV_PO_NO() {
		return PREV_PO_NO;
	}

	public void setPREV_PO_NO(String pREV_PO_NO) {
		PREV_PO_NO = pREV_PO_NO;
	}

	public String getSUB_BRN_CD() {
		return SUB_BRN_CD;
	}

	public void setSUB_BRN_CD(String sUB_BRN_CD) {
		SUB_BRN_CD = sUB_BRN_CD;
	}

	public String getTOT_CHARG_IB() {
		return TOT_CHARG_IB;
	}

	public void setTOT_CHARG_IB(String tOT_CHARG_IB) {
		TOT_CHARG_IB = tOT_CHARG_IB;
	}

	public String getVOUCH_NO() {
		return VOUCH_NO;
	}

	public void setVOUCH_NO(String vOUCH_NO) {
		VOUCH_NO = vOUCH_NO;
	}

	public String getVOUCH_YEAR() {
		return VOUCH_YEAR;
	}

	public void setVOUCH_YEAR(String vOUCH_YEAR) {
		VOUCH_YEAR = vOUCH_YEAR;
	}

	public String getPOST_DT() {
		return POST_DT;
	}

	public void setPOST_DT(String pOST_DT) {
		POST_DT = pOST_DT;
	}

	public String getPOST_BY() {
		return POST_BY;
	}

	public void setPOST_BY(String pOST_BY) {
		POST_BY = pOST_BY;
	}

	public String getAUTH_DT() {
		return AUTH_DT;
	}

	public void setAUTH_DT(String aUTH_DT) {
		AUTH_DT = aUTH_DT;
	}

	public String getAUTH_BY() {
		return AUTH_BY;
	}

	public void setAUTH_BY(String aUTH_BY) {
		AUTH_BY = aUTH_BY;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	public String getPRINT_STS() {
		return PRINT_STS;
	}

	public void setPRINT_STS(String pRINT_STS) {
		PRINT_STS = pRINT_STS;
	}

	public String getREPRINT_STATUS() {
		return REPRINT_STATUS;
	}

	public void setREPRINT_STATUS(String rEPRINT_STATUS) {
		REPRINT_STATUS = rEPRINT_STATUS;
	}

	public String getBENEF_NO() {
		return BENEF_NO;
	}

	public void setBENEF_NO(String bENEF_NO) {
		BENEF_NO = bENEF_NO;
	}

	public String getNO_OF_PRINT() {
		return NO_OF_PRINT;
	}

	public void setNO_OF_PRINT(String nO_OF_PRINT) {
		NO_OF_PRINT = nO_OF_PRINT;
	}

	public String getCR_MODE() {
		return CR_MODE;
	}

	public void setCR_MODE(String cR_MODE) {
		CR_MODE = cR_MODE;
	}

	public String getCR_VOUCH_NO() {
		return CR_VOUCH_NO;
	}

	public void setCR_VOUCH_NO(String cR_VOUCH_NO) {
		CR_VOUCH_NO = cR_VOUCH_NO;
	}

	public String getCR_VOUCH_YEAR() {
		return CR_VOUCH_YEAR;
	}

	public void setCR_VOUCH_YEAR(String cR_VOUCH_YEAR) {
		CR_VOUCH_YEAR = cR_VOUCH_YEAR;
	}

	public String getPAY_IBCA_NO() {
		return PAY_IBCA_NO;
	}

	public void setPAY_IBCA_NO(String pAY_IBCA_NO) {
		PAY_IBCA_NO = pAY_IBCA_NO;
	}

	public String getPRSNTNG_BRN_CD() {
		return PRSNTNG_BRN_CD;
	}

	public void setPRSNTNG_BRN_CD(String pRSNTNG_BRN_CD) {
		PRSNTNG_BRN_CD = pRSNTNG_BRN_CD;
	}

	public String getPAY_REF_NO() {
		return PAY_REF_NO;
	}

	public void setPAY_REF_NO(String pAY_REF_NO) {
		PAY_REF_NO = pAY_REF_NO;
	}

	public String getPAY_REF_YEAR() {
		return PAY_REF_YEAR;
	}

	public void setPAY_REF_YEAR(String pAY_REF_YEAR) {
		PAY_REF_YEAR = pAY_REF_YEAR;
	}

	public String getISS_REF_NO() {
		return ISS_REF_NO;
	}

	public void setISS_REF_NO(String iSS_REF_NO) {
		ISS_REF_NO = iSS_REF_NO;
	}

	public String getISS_REF_YEAR() {
		return ISS_REF_YEAR;
	}

	public void setISS_REF_YEAR(String iSS_REF_YEAR) {
		ISS_REF_YEAR = iSS_REF_YEAR;
	}

	public String getTOTAL_CHG() {
		return TOTAL_CHG;
	}

	public void setTOTAL_CHG(String tOTAL_CHG) {
		TOTAL_CHG = tOTAL_CHG;
	}

	public String getSTOP_CHRGS() {
		return STOP_CHRGS;
	}

	public void setSTOP_CHRGS(String sTOP_CHRGS) {
		STOP_CHRGS = sTOP_CHRGS;
	}

	public String getSTOP_VOUCH_NO() {
		return STOP_VOUCH_NO;
	}

	public void setSTOP_VOUCH_NO(String sTOP_VOUCH_NO) {
		STOP_VOUCH_NO = sTOP_VOUCH_NO;
	}

	public String getSTOP_VOUCH_YEAR() {
		return STOP_VOUCH_YEAR;
	}

	public void setSTOP_VOUCH_YEAR(String sTOP_VOUCH_YEAR) {
		STOP_VOUCH_YEAR = sTOP_VOUCH_YEAR;
	}

	public String getLOCK_STS() {
		return LOCK_STS;
	}

	public void setLOCK_STS(String lOCK_STS) {
		LOCK_STS = lOCK_STS;
	}

	public String getLOCK_BY() {
		return LOCK_BY;
	}

	public void setLOCK_BY(String lOCK_BY) {
		LOCK_BY = lOCK_BY;
	}

	public String getISS_REV_REF_NO() {
		return ISS_REV_REF_NO;
	}

	public void setISS_REV_REF_NO(String iSS_REV_REF_NO) {
		ISS_REV_REF_NO = iSS_REV_REF_NO;
	}

	public String getISS_REV_REF_YEAR() {
		return ISS_REV_REF_YEAR;
	}

	public void setISS_REV_REF_YEAR(String iSS_REV_REF_YEAR) {
		ISS_REV_REF_YEAR = iSS_REV_REF_YEAR;
	}

	public String getISSUED_BY() {
		return ISSUED_BY;
	}

	public void setISSUED_BY(String iSSUED_BY) {
		ISSUED_BY = iSSUED_BY;
	}

	public String getLOCK_BRN() {
		return LOCK_BRN;
	}

	public void setLOCK_BRN(String lOCK_BRN) {
		LOCK_BRN = lOCK_BRN;
	}

	public String getBEF_NAME1() {
		return BEF_NAME1;
	}

	public void setBEF_NAME1(String bEF_NAME1) {
		BEF_NAME1 = bEF_NAME1;
	}

	public String getBEF_NAME2() {
		return BEF_NAME2;
	}

	public void setBEF_NAME2(String bEF_NAME2) {
		BEF_NAME2 = bEF_NAME2;
	}

	public String getBEF_CELL_NO() {
		return BEF_CELL_NO;
	}

	public void setBEF_CELL_NO(String bEF_CELL_NO) {
		BEF_CELL_NO = bEF_CELL_NO;
	}

	public String getCR_CNIC_NO() {
		return CR_CNIC_NO;
	}

	public void setCR_CNIC_NO(String cR_CNIC_NO) {
		CR_CNIC_NO = cR_CNIC_NO;
	}

	public String getAPP_REQ_MODE() {
		return APP_REQ_MODE;
	}

	public void setAPP_REQ_MODE(String aPP_REQ_MODE) {
		APP_REQ_MODE = aPP_REQ_MODE;
	}

	public String getQR_BAR_CD() {
		return QR_BAR_CD;
	}

	public void setQR_BAR_CD(String qR_BAR_CD) {
		QR_BAR_CD = qR_BAR_CD;
	}

	public String getBENEF_TYPE() {
		return BENEF_TYPE;
	}

	public void setBENEF_TYPE(String bENEF_TYPE) {
		BENEF_TYPE = bENEF_TYPE;
	}

	public String getID_DOC_TYPE() {
		return ID_DOC_TYPE;
	}

	public void setID_DOC_TYPE(String iD_DOC_TYPE) {
		ID_DOC_TYPE = iD_DOC_TYPE;
	}

	public String getID_DOC_NO() {
		return ID_DOC_NO;
	}

	public void setID_DOC_NO(String iD_DOC_NO) {
		ID_DOC_NO = iD_DOC_NO;
	}

	public String getPURPOSE() {
		return PURPOSE;
	}

	public void setPURPOSE(String pURPOSE) {
		PURPOSE = pURPOSE;
	}

	public String getBENEF_RELATION() {
		return BENEF_RELATION;
	}

	public void setBENEF_RELATION(String bENEF_RELATION) {
		BENEF_RELATION = bENEF_RELATION;
	}

	public String getOTHER_PURPOSE() {
		return OTHER_PURPOSE;
	}

	public void setOTHER_PURPOSE(String oTHER_PURPOSE) {
		OTHER_PURPOSE = oTHER_PURPOSE;
	}

	public String getOTHER_BENEF_RELATION() {
		return OTHER_BENEF_RELATION;
	}

	public void setOTHER_BENEF_RELATION(String oTHER_BENEF_RELATION) {
		OTHER_BENEF_RELATION = oTHER_BENEF_RELATION;
	}

	public long getId() {
		return id;
	}	
}
