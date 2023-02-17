package com.alibaba.easyexcel.test.demo.read;

import java.util.List;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

/**
 * @author yuwenbo@kkworld.com
 * @date 2023/2/17
 */
public class MyDemoData2Listener implements ReadListener<DemoData> {

    private final List<DemoData> demoDataList;

    public MyDemoData2Listener(List<DemoData> demoDataList) {
        this.demoDataList = demoDataList;
    }

    @Override
    public void invoke(DemoData data, AnalysisContext context) {
        demoDataList.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
    }
}
