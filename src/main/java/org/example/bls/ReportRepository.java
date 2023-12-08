package org.example.bls;

import org.example.aspect.PerformanceLogger;
import org.example.ds.FormattedReport;
import org.springframework.stereotype.Component;

@Component
public class ReportRepository {
    @PerformanceLogger
    public void save(FormattedReport formattedReport) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
