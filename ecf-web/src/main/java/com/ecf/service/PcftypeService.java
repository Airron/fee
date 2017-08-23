package com.ecf.service;

import java.util.List;

import com.ecf.pojo.Pcftype;
import com.ecf.pojo.Porder;


public interface PcftypeService {

	List<Pcftype> getPcftype(int projectid);

	int gePcftypePrix(int pcftypeid);

	

//	int updatePcftype(Porder porder);

	List<Pcftype> updatePcftype(Porder porder, Pcftype pcftype);

}
