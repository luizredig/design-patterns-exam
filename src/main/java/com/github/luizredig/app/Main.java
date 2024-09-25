package com.github.luizredig.app;

import com.github.luizredig.app.factory.CSVReportFactory;
import com.github.luizredig.app.factory.ExcelReportFactory;
import com.github.luizredig.app.factory.PDFReportFactory;
import com.github.luizredig.app.service.ReportService;

public class Main {
    public static void main(String[] args) {
        ReportService reportService = new ReportService();

        CSVReportFactory csvReportFactory = new CSVReportFactory();
        ExcelReportFactory excelReportFactory = new ExcelReportFactory();
        PDFReportFactory pdfReportFactory = new PDFReportFactory();

        reportService.print(csvReportFactory, reportService.getClass().getSimpleName() + " - " + csvReportFactory.getClass().getSimpleName() + ": Printing Report.csv ...");
        reportService.print(excelReportFactory, reportService.getClass().getSimpleName() + " - " + excelReportFactory.getClass().getSimpleName() + ": Printing Report.xlsx ...");
        reportService.print(pdfReportFactory, reportService.getClass().getSimpleName() + " - " + pdfReportFactory.getClass().getSimpleName() + ": Printing Report.pdf ...");
    }
}
