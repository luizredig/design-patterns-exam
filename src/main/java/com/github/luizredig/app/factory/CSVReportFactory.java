package com.github.luizredig.app.factory;

import com.github.luizredig.app.report.CSVReport;
import com.github.luizredig.app.report.IReport;

public class CSVReportFactory extends ReportFactory {
    @Override
    public IReport createReport() {
        return new CSVReport();
    }
}
