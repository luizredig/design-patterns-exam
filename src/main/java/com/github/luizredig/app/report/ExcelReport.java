package com.github.luizredig.app.report;

public class ExcelReport implements IReport {
    @Override
    public void generate(String content) {
        System.out.println(content);
    }
}
