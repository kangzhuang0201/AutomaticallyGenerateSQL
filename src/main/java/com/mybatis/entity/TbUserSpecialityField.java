package com.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class TbUserSpecialityField implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 擅长领域code
     */
    private Integer specialityFieldCode;

    /**
     * 擅长领域名称
     */
    private String specialityFieldName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_user_speciality_field
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecialityFieldCode() {
        return specialityFieldCode;
    }

    public void setSpecialityFieldCode(Integer specialityFieldCode) {
        this.specialityFieldCode = specialityFieldCode;
    }

    public String getSpecialityFieldName() {
        return specialityFieldName;
    }

    public void setSpecialityFieldName(String specialityFieldName) {
        this.specialityFieldName = specialityFieldName == null ? null : specialityFieldName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}