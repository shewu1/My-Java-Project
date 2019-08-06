package com.sw.service;
import java.util.List;

import com.sw.pojo.Pic;


public interface PicService {
	int insPic(Pic pic);
	
	List<Pic> show();
	
	int delById(int id);
}
