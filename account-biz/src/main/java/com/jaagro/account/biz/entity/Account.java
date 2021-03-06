package com.jaagro.account.biz.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yj
 * 账户
 */
public class Account implements Serializable{
    /**
     * 账户id
     */
    private Integer id;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 账户类型1-现金账户 2-保证金账户
     */
    private Integer accountType;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户类型1-客户 2-司机
     */
    private Integer userType;

    /**
     * 支出总额
     */
    private BigDecimal credit;

    /**
     * 收入总额
     */
    private BigDecimal debit;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 账户状态1-正常 2-止收 3-止支 4-冻结
     */
    private Integer accountStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 创建人
     */
    private Integer createUserId;

    /**
     * 修改人
     */
    private Integer modifyUserId;

    /**
     * 账户id
     * @return id 账户id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 账户id
     * @param id 账户id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 乐观锁版本号
     * @return version 乐观锁版本号
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 乐观锁版本号
     * @param version 乐观锁版本号
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 账户类型1-现金账户 2-保证金账户
     * @return account_type 账户类型1-现金账户 2-保证金账户
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 账户类型1-现金账户 2-保证金账户
     * @param accountType 账户类型1-现金账户 2-保证金账户
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户类型1-客户 2-司机
     * @return user_type 用户类型1-客户 2-司机
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 用户类型1-客户 2-司机
     * @param userType 用户类型1-客户 2-司机
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 支出总额
     * @return credit 支出总额
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 支出总额
     * @param credit 支出总额
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 收入总额
     * @return debit 收入总额
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /**
     * 收入总额
     * @param debit 收入总额
     */
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    /**
     * 余额
     * @return balance 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 余额
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 账户状态1-正常 2-止收 3-止支 4-冻结
     * @return account_status 账户状态1-正常 2-止收 3-止支 4-冻结
     */
    public Integer getAccountStatus() {
        return accountStatus;
    }

    /**
     * 账户状态1-正常 2-止收 3-止支 4-冻结
     * @param accountStatus 账户状态1-正常 2-止收 3-止支 4-冻结
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * @return modify_time 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 创建人
     * @return create_user_id 创建人
     */
    public Integer getcreateUserId() {
        return createUserId;
    }

    /**
     * 创建人
     * @param createUserId 创建人
     */
    public void setcreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 修改人
     * @return modify_user_id 修改人
     */
    public Integer getModifyUserId() {
        return modifyUserId;
    }

    /**
     * 修改人
     * @param modifyUserId 修改人
     */
    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }
}