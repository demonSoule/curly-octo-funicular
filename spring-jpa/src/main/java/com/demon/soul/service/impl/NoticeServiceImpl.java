package com.demon.soul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demon.soul.dao.NoticeDao;
import com.demon.soul.entity.Notice;
import com.demon.soul.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService{
	
	//注入dao层实现类
	@Autowired
	private NoticeDao noticeDao;
	
	/**查询所有的公告*/
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
