package com.tdd.edu.service.impl;

import com.tdd.edu.dao.ResumeDao;
import com.tdd.edu.pojo.Resume;
import com.tdd.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author tudedong
 * @description Servcie层ResumeServiceImpl实现类
 * @date 2020-05-06 22:27:38
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findAll(){
        return resumeDao.findAll();
    }

    @Override
    public Resume save(Resume resume) {
        return resumeDao.save(resume);
    }

    @Override
    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }

    @Override
    public Resume findById(Long id) {
        Optional<Resume> resume = resumeDao.findById(id);
        if(resume.isPresent()){
            return resume.get();
        }else {
            return new Resume();
        }
    }

}
