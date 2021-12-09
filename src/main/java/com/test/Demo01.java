package com.test;

import cn.hutool.core.io.FileUtil;
import com.alibaba.excel.EasyExcel;
import com.test.data.FillData;

/**
 * @date 2021/12/9 5:01 PM
 */
public class Demo01 {
    public static void main(String[] args) {
        String templatePath = ClassLoader.getSystemResource("").getPath();
        String templateFileName = templatePath + "/template01.xlsx";
        String outputPath = templatePath + "/output";
        FileUtil.mkdir(outputPath);
        FillData fillData = new FillData();
        fillData.setName("张三");
        fillData.setNumber(5.2);
        EasyExcel.write(outputPath + "/output01.xlsx").withTemplate(templateFileName).sheet().doFill(fillData);
    }
}
