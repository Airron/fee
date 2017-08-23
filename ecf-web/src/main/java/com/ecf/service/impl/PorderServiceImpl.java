package com.ecf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecf.mapper.PcftypeMapper;
import com.ecf.mapper.PorderMapper;
import com.ecf.pojo.Pcftype;
import com.ecf.pojo.Porder;
import com.ecf.pojo.PorderExample;
import com.ecf.pojo.PorderExample.Criteria;
import com.ecf.pojo.PorderExample.Criterion;
import com.ecf.service.PcftypeService;
import com.ecf.service.PorderService;
import com.ecf.service.ProjectService;

@Service
public class PorderServiceImpl implements PorderService {

	@Autowired
	private PorderMapper porderMapper;

	@Autowired
	private PcftypeService pcftypeService;
	
	@Autowired
	private ProjectService projectService;
	
	@Override
	public List<Porder> newOrder(Porder porder,Pcftype pcftype) {
		// TODO Auto-generated method stub
		//检查该商品的剩余量
		
		
		int pcfprix = pcftypeService.gePcftypePrix(porder.getPcftypeid());
		if(pcfprix >= porder.getOcount()){
			//更新pcftypeprix众筹分类支持的库存，返回该分类的pcftype的数据
			List<Pcftype> updatePcftype = pcftypeService.updatePcftype(porder,pcftype);
			
			
			if(updatePcftype != null){
				//设置总价
				porder.setOprice(pcftype.getPcfprice()*porder.getOcount());
				porder.setOstatus("unpay");
				//增加筹集金额数量
				
				int updatePledgedResult = projectService.updatePpledgeByPid(pcftype.getPid(),porder.getOprice());
				//如果更新成功。就生成新的订单，在数据库中插入该订单
				
				int newOrderInsertResult = porderMapper.insert(porder);
				List<Porder> newOrderList = new ArrayList<Porder>();
				newOrderList.add(porder);
				return newOrderList;
			}
			else return null;
			
		}
		
		else return null;
	}

//	@Override
//	public List<Porder> getMyOrder() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public List<Porder> getMyOrder(int uid) {
		// TODO Auto-generated method stub
		PorderExample example = new PorderExample();
		
		Criteria cri = example.createCriteria();
		cri.andUidEqualTo(uid);
		List<Porder> mylist = porderMapper.selectByExample(example);
//		porderMapper.select
//		List<Object> newlist  = 
//		PorderExample example = new PorderExample();
//		Criteria crion = example.getMyOrder(int uid);
//		
//		porderMapper.selectMyOrder(example);
		
		
		List<Porder> myorderlist = porderMapper.selectMyOrder(uid);
		String orderintrouce = myorderlist.get(0).getPcfintrouce();
		System.out.println("我的订单信息"+orderintrouce);
		return myorderlist;
	}

}
