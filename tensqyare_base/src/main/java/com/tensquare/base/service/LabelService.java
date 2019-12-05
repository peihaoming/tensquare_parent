package com.tensquare.base.service;

import com.config.BaseConfig;
import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import utils.SnowflakeIdUtils;

import java.util.List;

/**
 * @author haomingp
 * @Description: TODO
 * @date 2019/12/5 11:05
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private SnowflakeIdUtils idWorker;

    public List<Label> findAll(){
        return labelDao.findAll();
    }

    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    public String save(Label label){
        label.setId(idWorker.nextId()+"");
       return labelDao.save(label).getId();
    }

    public void update(Label label){
        labelDao.save(label);
    }
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

}
