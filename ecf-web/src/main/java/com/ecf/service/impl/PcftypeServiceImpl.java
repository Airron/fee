package com.ecf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecf.mapper.PcftypeMapper;
import com.ecf.pojo.Pcftype;
import com.ecf.pojo.PcftypeExample;
import com.ecf.pojo.PcftypeExample.Criteria;
import com.ecf.pojo.Porder;
import com.ecf.service.PcftypeService;

@Service
public class PcftypeServiceImpl implements PcftypeService {

	@Autowired
	private PcftypeMapper pcftypeMapper;
	
	@Override
	public List<Pcftype> getPcftype(int projectid) {
		// TODO Auto-generated method stub
		PcftypeExample example = new PcftypeExample();
		Criteria cri = example.createCriteria();
		cri.andPidEqualTo(projectid);
		List<Pcftype> pcfList = pcftypeMapper.selectByExampleWithBLOBs(example);
//		@SuppressWarnings("unused")
//		int price = pcfList.get(0).getPcfprice();
		return pcfList;
	}

	@Override
	public int gePcftypePrix(int pcftypeid) {
		//查询项目该类型下的支持剩余量
		
		PcftypeExample example = new PcftypeExample();
		Criteria cri = example.createCriteria();
		cri.andPcftypeidEqualTo(pcftypeid);
		List<Pcftype> pcfList = pcftypeMapper.selectByExampleWithBLOBs(example);
		int pcfPrix = pcfList.get(0).getPcfprix();
//		if(pcfPrix>0){
//			pcfPrix--;
//			pcfList.get(0).setPcfprix(pcfPrix);
//			System.out.println(pcfList.get(0).getPcfprix());
//			pcftypeMapper.updateByExample(pcfList.get(0), example);
//			return pcfList.get(0).getPcfprix();
//		}
		return pcfPrix;
		
		
	}

	@SuppressWarnings("unused")
	@Override
	public List<Pcftype> updatePcftype(Porder porder,Pcftype pcftype) {
		// TODO Auto-generated method stub
		//testfordebug-begin
//		int t1 = pcftype.getPcfprix();
//		int t2 = porder.getOcount();
//		
//		int t3= 0 ;
		//test-down
		
		
		PcftypeExample example = new PcftypeExample();
		Criteria cri = example.createCriteria();
		
		//添加查询条件
		cri.andPcftypeidEqualTo(porder.getPcftypeid());
		List<Pcftype> pcflist = pcftypeMapper.selectByExample(example);
		pcflist.get(0).setPcfprix(pcflist.get(0).getPcfprix()-porder.getOcount());
		pcftype = pcflist.get(0);
		//pcftype.setPcfprix();
		
		
		//更新选取的pcftype的库存：pcftypeprix
		int updateByorder = pcftypeMapper.updateByExample(pcftype, example);
		// updateByorder是返回的更新结构，结果是1就是更新成功，结果是0就是更新失败
		
		
		//下面是查询到选取的众筹方式pcftype并返回
		PcftypeExample example2 = new PcftypeExample();
		Criteria cri2 = example2.createCriteria();
		cri2.andPcftypeidEqualTo(porder.getPcftypeid());
		List<Pcftype> pcflist2 = pcftypeMapper.selectByExample(example2);
		
		
		//对更新后的结果进行判断，判断更新成功就返回订单的list内容，更新失败就返回查询到的结果list：pcflist
		if(updateByorder !=0 ){
			return pcflist2;
		}
		
		
		
		return null;
	}



}
