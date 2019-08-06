package com.sw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.sw.mapper.PicMapper;
import com.sw.pojo.Pic;
import com.sw.service.PicService;
@Service
public class PicServiceImpl implements PicService {
	@Value("${management.url}")
	private String path;
	@Resource
	public PicMapper picMapper;
	public List<Pic> show() {
		List<Pic> list = picMapper.selAll();
		for (Pic pic : list) {
			pic.setPath(path+pic.getPath());
		}
		return list;
	}

}
