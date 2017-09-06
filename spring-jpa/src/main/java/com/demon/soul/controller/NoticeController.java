package com.demon.soul.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demon.soul.entity.Notice;
import com.demon.soul.service.NoticeService;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @类描述:处理器
 *
 * @编写人:白小纯
 * @时间:2017年9月6日上午12:28:48
 */
@Controller
public class NoticeController {
	
	//注业务层实现类
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private DataSource dataSource;
	
	/**查询所有公告*/
	@GetMapping("findAll")
	@ResponseBody
	public List<Notice> findAll(){
		ComboPooledDataSource ds = (ComboPooledDataSource)dataSource;
		System.out.println("driverClass:"+ds.getDriverClass());
		List<Notice> list = noticeService.findAll();
		System.out.println(list);
		return list;
	}
}
