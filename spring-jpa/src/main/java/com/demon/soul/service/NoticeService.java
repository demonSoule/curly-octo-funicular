package com.demon.soul.service;

import java.util.List;

import com.demon.soul.entity.Notice;

public interface NoticeService {
	/**查询所有公告*/
	List<Notice> findAll();
}
