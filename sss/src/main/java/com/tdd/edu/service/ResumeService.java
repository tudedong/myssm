package com.tdd.edu.service;

import com.tdd.edu.pojo.Resume;

import java.util.List;

/**
 * @author tudedong
 * @description Servcie层ResumeService接口
 * @date 2020-05-06 22:25:59
 */
public interface ResumeService {

    /**
     * 查询所有Resume记录
     * @return
     * @throws Exception
     */
    List<Resume> findAll();

    /**
     * 保存Resume记录
     * @param resume
     */
    Resume save(Resume resume);

    /**
     * 删除Resume记录
     * @param id
     */
    void deleteById(Long id);

    /**
     * 根据id获取Resume记录
     * @param id
     * @return
     */
    Resume findById(Long id);
}
