package qo;

import java.math.BigDecimal;

/**
 * create by Lfm
 * on 2018-05-31 16:17
 */
public class UserAndCardQo {

    //    主键
    private String userBaseInfoId;
    private String cardBaseInfoId;

    //    开户日期
    private String openDate;
    //   持卡姓名
    private String userName;
    //   身份证号
    private String userCardId;
    //    电话
    private String userTel;
    //    手机号
    private String userMobilePhone;
    //    邮箱
    private String userEmail;
    //    性别
    private String userSex;
    //    地址
    private String userAddress;
    //    银行卡ID
    private String cardId;
    //    交易密码
    private String transPwd;
    //   卡状态
    private String stat;
    //    账户余额
    private BigDecimal oveage;
    //   卡类型
    private String cardType;

    public String getUserBaseInfoId() {
        return userBaseInfoId;
    }

    public void setUserBaseInfoId(String userBaseInfoId) {
        this.userBaseInfoId = userBaseInfoId;
    }

    public String getCardBaseInfoId() {
        return cardBaseInfoId;
    }

    public void setCardBaseInfoId(String cardBaseInfoId) {
        this.cardBaseInfoId = cardBaseInfoId;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(String userCardId) {
        this.userCardId = userCardId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserMobilePhone() {
        return userMobilePhone;
    }

    public void setUserMobilePhone(String userMobilePhone) {
        this.userMobilePhone = userMobilePhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTransPwd() {
        return transPwd;
    }

    public void setTransPwd(String transPwd) {
        this.transPwd = transPwd;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public BigDecimal getOveage() {
        return oveage;
    }

    public void setOveage(BigDecimal oveage) {
        this.oveage = oveage;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
