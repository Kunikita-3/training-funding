package jp.co.prospire.trainingfunding.domain;

import java.io.Serializable;
import java.util.Date;


public class TFUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer userId;
    private String usrNmSeiJ;
    private String usrNmMeiJ;
    private String usrNmSeiE;
    private String usrNmMeiE;
    private String email;
    private String pwd;
    private Integer accountClassId;
    private Integer empNo;
    private boolean delFlg;
    private Date regYmd;
    private Integer regUsrId;
    private Date updYmd;
    private Integer updUsrId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer usrId) {
        this.userId = usrId;
    }

    public String getUsrNmSeiJ() {
        return usrNmSeiJ;
    }

    public void setUsrNmSeiJ(String usrNmSeiJ) {
        this.usrNmSeiJ = usrNmSeiJ;
    }

    public String getUsrNmMeiJ() {
        return usrNmMeiJ;
    }

    public void setUsrNmMeiJ(String usrNmMeiJ) {
        this.usrNmMeiJ = usrNmMeiJ;
    }

    public String getUsrNmSeiE() {
        return usrNmSeiE;
    }

    public void setUsrNmSeiE(String usrNmSeiE) {
        this.usrNmSeiE = usrNmSeiE;
    }

    public String getUsrNmMeiE() {
        return usrNmMeiE;
    }

    public void setUsrNmMeiE(String usrNmMeiE) {
        this.usrNmMeiE = usrNmMeiE;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAccountClassId() {
        return accountClassId;
    }

    public void setAccountClassId(Integer accountClassId) {
        this.accountClassId = accountClassId;
    }

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public boolean isDelFlg() {
        return delFlg;
    }

    public void setDelFlg(boolean delFlg) {
        this.delFlg = delFlg;
    }

    public Date getRegYmd() {
        return regYmd;
    }

    public void setRegYmd(Date regYmd) {
        this.regYmd = regYmd;
    }

    public Integer getRegUsrId() {
        return regUsrId;
    }

    public void setRegUsrId(Integer regUsrId) {
        this.regUsrId = regUsrId;
    }

    public Date getUpdYmd() {
        return updYmd;
    }

    public void setUpdYmd(Date updYmd) {
        this.updYmd = updYmd;
    }

    public Integer getUpdUsrId() {
        return updUsrId;
    }

    public void setUpdUsrId(Integer updUsrId) {
        this.updUsrId = updUsrId;
    }

    @Override
    public String toString() {
        return "TFUser{" +
                "usrId=" + userId +
                ", usrNmSeiJ='" + usrNmSeiJ + '\'' +
                ", usrNmMeiJ='" + usrNmMeiJ + '\'' +
                ", usrNmSeiE='" + usrNmSeiE + '\'' +
                ", usrNmMeiE='" + usrNmMeiE + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accountClassId=" + accountClassId +
                ", empNo=" + empNo +
                ", delFlg=" + delFlg +
                ", regYmd=" + regYmd +
                ", regUserId=" + regUsrId +
                ", updYmd=" + updYmd +
                ", updUserId=" + updUsrId +
                '}';
    }
}
