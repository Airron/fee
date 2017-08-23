package com.ecf.service;

import java.util.List;

import com.ecf.pojo.Porder;
import com.ecf.pojo.Project;



public interface ProjectService {
	List<Project> getProject(Project project);

	List<Project> getProjectByCate(int pcnum);

	List<Project> getProjectlist();

	List<Project> getPorjectByPid(int projectid);

	List<Project> getprojectRecommend();

	int updateProject(Porder porder,Project project);

	int newproject(Project project);

	int updatePpledgeByPid(Integer pid, Integer integer);


}
