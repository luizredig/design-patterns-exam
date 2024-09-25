package com.github.luizredig.app.report;

public class PDFReport implements IReport {
    @Override
    public void generate(String content) {
        System.out.println(content);
    }
}
