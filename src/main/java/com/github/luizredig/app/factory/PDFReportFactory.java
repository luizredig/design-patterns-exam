package com.github.luizredig.app.factory;

import com.github.luizredig.app.report.PDFReport;
import com.github.luizredig.app.report.IReport;

public class PDFReportFactory extends ReportFactory {
    @Override
    public IReport createReport() {
        return new PDFReport();
    }
}
