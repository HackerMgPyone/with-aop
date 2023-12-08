package org.example.action;

import org.example.bls.ReportFormatter;
import org.example.bls.ReportProvider;
import org.example.bls.ReportRepository;
import org.example.ds.FormattedReport;
import org.example.ds.Report;
import org.example.logging.PerformanceLogger;
import org.springframework.stereotype.Component;


@Component
public class ComplexAction {
    private final ReportFormatter reportFormatter;
    private final ReportProvider reportProvider;
    private final ReportRepository reportRepository;

    public ComplexAction(ReportFormatter reportFormatter, ReportProvider reportProvider, ReportRepository reportRepository) {
        this.reportFormatter = reportFormatter;
        this.reportProvider = reportProvider;
        this.reportRepository = reportRepository;
    }

    public void takeAction() {


        Report report = reportProvider.provideReport();



        FormattedReport formattedReport = reportFormatter.format(report);



        reportRepository.save(formattedReport);

    }


}
