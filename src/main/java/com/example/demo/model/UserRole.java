package com.example.demo.model;

import java.io.Serializable;

public class UserRole implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.uid
	 * @mbg.generated
	 */
	private Integer uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user_role.rid
	 * @mbg.generated
	 */
	private Integer rid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table user_role
	 * @mbg.generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.uid
	 * @return  the value of user_role.uid
	 * @mbg.generated
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.uid
	 * @param uid  the value for user_role.uid
	 * @mbg.generated
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user_role.rid
	 * @return  the value of user_role.rid
	 * @mbg.generated
	 */
	public Integer getRid() {
		return rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user_role.rid
	 * @param rid  the value for user_role.rid
	 * @mbg.generated
	 */
	public void setRid(Integer rid) {
		this.rid = rid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_role
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", uid=").append(uid);
		sb.append(", rid=").append(rid);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}