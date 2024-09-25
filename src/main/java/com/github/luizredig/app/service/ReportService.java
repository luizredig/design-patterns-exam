package com.github.luizredig.app.service;

import com.github.luizredig.app.factory.ReportFactory;
import com.github.luizredig.app.report.IReport;

public class ReportService {
    public void print(ReportFactory reportFactory, String content) {
        IReport report = reportFactory.createReport();
        report.generate(content);
    }
}
