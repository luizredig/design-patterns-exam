package com.github.luizredig.app.factory;

import com.github.luizredig.app.report.ExcelReport;
import com.github.luizredig.app.report.IReport;

public class ExcelReportFactory extends ReportFactory {
    @Override
    public IReport createReport() {
        return new ExcelReport();
    }
}
