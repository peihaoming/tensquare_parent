package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author phm
 * @Description:
 * @date 2019/12/4 19:44
 */
@RestController
@CrossOrigin
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @GetMapping
    public Result findAll() {
        return new Result(StatusCode.OK, "查询成功", true, labelService.findAll());
    }

    @GetMapping("/{lableId}")
    public Result findById(@PathVariable("lableId") String lableId) {
        return new Result(StatusCode.OK, "查询成功", true, labelService.findById(lableId));
    }

    @PostMapping()
    public Result save(@RequestBody Label label) {
        labelService.save(label);
        return new Result(StatusCode.OK, "添加成功", true);
    }

    @PutMapping("/{labelId}")
    public Result edit(@PathVariable("labelId") String labelId, @RequestBody Label label) {
        label.setId(labelId);
        labelService.update(label);
        return new Result(StatusCode.OK, "修改成功", true);
    }

    @DeleteMapping("/{labelId}")
    public Result delete(@PathVariable("labelId") String labelId) {
        labelService.deleteById(labelId);
        return new Result(StatusCode.OK, "删除成功", true);
    }

}
