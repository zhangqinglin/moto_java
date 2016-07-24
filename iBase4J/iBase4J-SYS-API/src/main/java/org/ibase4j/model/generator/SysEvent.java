package org.ibase4j.model.generator;

import org.ibase4j.core.base.BaseModel;

@SuppressWarnings("serial")
public class SysEvent extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.title_
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.request_uri
     *
     * @mbggenerated
     */
    private String requestUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.parammeters_
     *
     * @mbggenerated
     */
    private String parammeters;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.method_
     *
     * @mbggenerated
     */
    private String method;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.client_host
     *
     * @mbggenerated
     */
    private String clientHost;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.user_agent
     *
     * @mbggenerated
     */
    private String userAgent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_event.status_
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.title_
     *
     * @return the value of sys_event.title_
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.title_
     *
     * @param title the value for sys_event.title_
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.request_uri
     *
     * @return the value of sys_event.request_uri
     *
     * @mbggenerated
     */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.request_uri
     *
     * @param requestUri the value for sys_event.request_uri
     *
     * @mbggenerated
     */
    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.parammeters_
     *
     * @return the value of sys_event.parammeters_
     *
     * @mbggenerated
     */
    public String getParammeters() {
        return parammeters;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.parammeters_
     *
     * @param parammeters the value for sys_event.parammeters_
     *
     * @mbggenerated
     */
    public void setParammeters(String parammeters) {
        this.parammeters = parammeters == null ? null : parammeters.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.method_
     *
     * @return the value of sys_event.method_
     *
     * @mbggenerated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.method_
     *
     * @param method the value for sys_event.method_
     *
     * @mbggenerated
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.client_host
     *
     * @return the value of sys_event.client_host
     *
     * @mbggenerated
     */
    public String getClientHost() {
        return clientHost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.client_host
     *
     * @param clientHost the value for sys_event.client_host
     *
     * @mbggenerated
     */
    public void setClientHost(String clientHost) {
        this.clientHost = clientHost == null ? null : clientHost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.user_agent
     *
     * @return the value of sys_event.user_agent
     *
     * @mbggenerated
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.user_agent
     *
     * @param userAgent the value for sys_event.user_agent
     *
     * @mbggenerated
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_event.status_
     *
     * @return the value of sys_event.status_
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_event.status_
     *
     * @param status the value for sys_event.status_
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", title=").append(title);
        sb.append(", requestUri=").append(requestUri);
        sb.append(", parammeters=").append(parammeters);
        sb.append(", method=").append(method);
        sb.append(", clientHost=").append(clientHost);
        sb.append(", userAgent=").append(userAgent);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
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
        SysEvent other = (SysEvent) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getRequestUri() == null ? other.getRequestUri() == null : this.getRequestUri().equals(other.getRequestUri()))
            && (this.getParammeters() == null ? other.getParammeters() == null : this.getParammeters().equals(other.getParammeters()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getClientHost() == null ? other.getClientHost() == null : this.getClientHost().equals(other.getClientHost()))
            && (this.getUserAgent() == null ? other.getUserAgent() == null : this.getUserAgent().equals(other.getUserAgent()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_event
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getRequestUri() == null) ? 0 : getRequestUri().hashCode());
        result = prime * result + ((getParammeters() == null) ? 0 : getParammeters().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getClientHost() == null) ? 0 : getClientHost().hashCode());
        result = prime * result + ((getUserAgent() == null) ? 0 : getUserAgent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}