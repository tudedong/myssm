package com.tdd.edu.controller;

import com.tdd.edu.pojo.Resume;
import com.tdd.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 * @author tudedong
 * @description Controller层ResumeController控制器
 * @date 2020-05-07 22:19:40
 */
@Controller
@RequestMapping("/resume")
public class ResumeController {

    /**
     *  Spring容器和SpringMVC容器是有层次的(父子容器)
     *  Spring容器：service对象+dao对象
     *  SpringMVC容器：controller对象，，，可以引用到Spring容器中的对象
     */

    @Autowired
    private ResumeService resumeService;

    /**
     * 查询：查询全部结果 http://localhost:8080/resume/findAll
     * @return
     */
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ModelAndView findAll(ModelAndView modelAndView) {
        return queryAll(modelAndView);
    }

    /**
     * 添加：进入添加页面
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String toAdd() {
        return "add";
    }

    /**
     * 添加：处理添加逻辑
     * @param resume
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ModelAndView add(Resume resume,ModelAndView modelAndView) {
        Resume save = resumeService.save(resume);
        System.out.println(save);
        return queryAll(modelAndView);
    }

    /**
     * 更新：获取更新页面
     * @param resume
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public ModelAndView toUpdate(Resume resume, ModelAndView modelAndView) {
        Resume resume1=resumeService.findById(resume.getId());
        modelAndView.addObject("resume",resume1);
        modelAndView.setViewName("update");
        return modelAndView;
    }

    /**
     * 更新：处理更新请求
     * @param resume
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ModelAndView  update(Resume resume,ModelAndView modelAndView) {
        resumeService.save(resume);
        return queryAll(modelAndView);
    }

    /**
     * 删除：处理删除请求
     * @param id
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public ModelAndView  delete(Long id,ModelAndView modelAndView) {
        resumeService.deleteById(id);
        return queryAll(modelAndView);
    }

    /**
     * 查询全部数据
     * @param modelAndView
     * @return 返回modelAndView
     */
    private ModelAndView queryAll(ModelAndView modelAndView) {
        List<Resume> list= resumeService.findAll();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }

}
