package com.alibaba.easyexcel.test.demo.read;

import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

/**
 * @author yuwenbo@kkworld.com
 * @date 2022/7/21
 */
public class MyDemoDataListener implements ReadListener<DemoData> {

    private final List<DemoData> demoDataList;

    public MyDemoDataListener(List<DemoData> demoDataList) {
        this.demoDataList = demoDataList;
    }

    @Override
    public void invoke(DemoData data, AnalysisContext context) {
        this.demoDataList.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
