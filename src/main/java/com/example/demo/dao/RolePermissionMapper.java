package com.example.demo.dao;

import com.example.demo.model.RolePermission;
import java.util.List;

public interface RolePermissionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_permission
	 * @mbg.generated
	 */
	int insert(RolePermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role_permission
	 * @mbg.generated
	 */
	List<RolePermission> selectAll();
}