package com.tdd.edu.dao;

import com.tdd.edu.pojo.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * @author tudedong
 * @description Dao层mapper接口
 * @date 2020-05-06 22:04:11
 */
public interface ResumeDao extends JpaRepository<Resume,Long>,JpaSpecificationExecutor<Resume> {

}
