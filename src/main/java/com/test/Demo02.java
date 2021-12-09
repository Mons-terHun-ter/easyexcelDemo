package com.test;

import cn.hutool.core.io.FileUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.test.data.FillData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2021/12/9 5:01 PM
 */
public class Demo02 {
    public static void main(String[] args) {
        String templatePath = ClassLoader.getSystemResource("").getPath();
        String templateFileName = templatePath + "/template02.xlsx";
        String outputPath = templatePath + "/output";
        FileUtil.mkdir(outputPath);
        ExcelWriter excelWriter = EasyExcel.write(outputPath + "/output02.xlsx").withTemplate(templateFileName).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
        FillData fillData = new FillData();
        fillData.setName("张三");
        fillData.setNumber(5.2);
        FillData fillData2 = new FillData();
        fillData2.setName("李四");
        fillData2.setNumber(88);
        ArrayList<FillData> list = new ArrayList<>();
        list.add(fillData);
        list.add(fillData2);
        excelWriter.fill(list, fillConfig, writeSheet);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("date", "2019年10月9日13:28:28");
        map.put("total", 1000);
        excelWriter.fill(map, writeSheet);
        excelWriter.finish();
    }
}
