package com.ecf.service;

import java.util.List;

import com.ecf.pojo.Pcftype;
import com.ecf.pojo.Porder;

public interface PorderService {

	List<Porder> newOrder(Porder porder,Pcftype pcftype);

//	List<Porder> getMyOrder();

	List<Porder> getMyOrder(int uid);

}
