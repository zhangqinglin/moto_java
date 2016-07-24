package org.ibase4j.model.generator;

import org.ibase4j.core.base.BaseModel;

@SuppressWarnings("serial")
public class SysParam extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.param_key
     *
     * @mbggenerated
     */
    private String paramKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.param_value
     *
     * @mbggenerated
     */
    private String paramValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.catalog_id
     *
     * @mbggenerated
     */
    private Integer catalogId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.param_key
     *
     * @return the value of sys_param.param_key
     *
     * @mbggenerated
     */
    public String getParamKey() {
        return paramKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.param_key
     *
     * @param paramKey the value for sys_param.param_key
     *
     * @mbggenerated
     */
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey == null ? null : paramKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.param_value
     *
     * @return the value of sys_param.param_value
     *
     * @mbggenerated
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.param_value
     *
     * @param paramValue the value for sys_param.param_value
     *
     * @mbggenerated
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.catalog_id
     *
     * @return the value of sys_param.catalog_id
     *
     * @mbggenerated
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.catalog_id
     *
     * @param catalogId the value for sys_param.catalog_id
     *
     * @mbggenerated
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paramKey=").append(paramKey);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", catalogId=").append(catalogId);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysParam other = (SysParam) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParamKey() == null ? other.getParamKey() == null : this.getParamKey().equals(other.getParamKey()))
            && (this.getParamValue() == null ? other.getParamValue() == null : this.getParamValue().equals(other.getParamValue()))
            && (this.getCatalogId() == null ? other.getCatalogId() == null : this.getCatalogId().equals(other.getCatalogId()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_param
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParamKey() == null) ? 0 : getParamKey().hashCode());
        result = prime * result + ((getParamValue() == null) ? 0 : getParamValue().hashCode());
        result = prime * result + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}