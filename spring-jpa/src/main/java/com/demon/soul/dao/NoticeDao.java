package com.demon.soul.dao;

import javax.xml.bind.annotation.XmlRegistry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demon.soul.entity.Notice;
/**
 * @类描述:jpadao接口
 *
 * @编写人:白小纯
 * @时间:2017年9月6日上午12:23:58
 */
@Repository
public interface NoticeDao extends JpaRepository<Notice, Long>{

}
