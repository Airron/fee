package com.ecf.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecf.mapper.PorderMapper;
import com.ecf.mapper.ProjectMapper;
import com.ecf.pojo.Pcategory;
import com.ecf.pojo.Porder;
import com.ecf.pojo.PorderExample;
import com.ecf.pojo.Project;
import com.ecf.pojo.ProjectExample;
import com.ecf.pojo.ProjectExample.Criteria;
import com.ecf.pojo.ProjectExample.Criterion;

//import com.ecf.pojo.ProjectWithBLOBs;
import com.ecf.service.PcategoryService;
import com.ecf.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private PcategoryService pcategoryService;
	
	@Autowired
	private PorderMapper porderMapper;
	@Autowired
	private ProjectMapper projectMapper;
	@Override
	public List<Project> getProject(Project project) {
		// TODO Auto-generated method stub
		ProjectExample example = new ProjectExample();
		
		
//		Criterion criterion = ;
		
		
		
		
		List<Project> slidlist = projectMapper.selectByExample(null);
		return null;
	}
	@Override
	public List<Project> getProjectByCate(int pcnum) {
		// TODO Auto-generated method stub
		
		ProjectExample example = new ProjectExample();
		Criteria cri = example.createCriteria();
		cri.andPcategoryidEqualTo(pcnum);
		
		List<Project> pclist = projectMapper.selectByExample(example);
		return pclist;
	}
	
	
	@Override
	public List<Project> getProjectlist() {
		//获取推荐的项目列表，按照分类获取项目的基本情况，在页面中展示多个项目
		
		
		return null;
	}
	@Override
	public List<Project> getPorjectByPid(int projectid) {
		// 这是显示单个项目的service
		ProjectExample example = new ProjectExample();
		Criteria cri = example.createCriteria();
		
		cri.andPidEqualTo(projectid);
		
		List<Project> projectListByPid = projectMapper.selectByExample(example);
		int test = projectListByPid.get(0).getPid();
		System.out.println("**********"+test+"");
		return projectListByPid;
	}
	@Override
	public List<Project> getprojectRecommend() {
		//首页显示分类推荐的项目
		ProjectExample example = new ProjectExample();
		Criteria cri = example.createCriteria();
		cri.andPrecommendGreaterThan(1);
		List<Project> projectListRecommend = projectMapper.selectByExample(example);
		
		return projectListRecommend;
	}
	@Override
	public int updateProject(Porder porder,Project project) {
		// TODO Auto-generated method stub
		
		
		
		//int updateProcessResult= projectMapper.updateProcessByPrimaryKey(porder.getPid(),porder.getOprice());
		
		return 0;
	}
	@Override
	public int newproject(Project project) {
		//创建新项目
		
		project.setPstatus(false);
		project.setPpledged(0);
		project.setPstartdate(new Date());
		project.setPblurb(0);
		int result = projectMapper.insert(project);
		List<Project> resultlist = projectMapper.selectNewProject();
		result = resultlist.get(0).getPid();
		System.out.println(result);
		return result;
	}
	@Override
	public int updatePpledgeByPid(Integer pid,Integer integer) {
		// 增加本次众筹的金额
		Project record = new Project();
		ProjectExample example = new ProjectExample();
		example.createCriteria().andPidEqualTo(pid);
		record = projectMapper.selectByExample(example ).get(0);
		record.setPpledged(record.getPpledged()+integer);
		int updateresult = projectMapper.updateByExample(record , example);
		return updateresult;
	}


}
