package org.example.bls;

import org.example.aspect.PerformanceLogger;
import org.example.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportProvider {
    @PerformanceLogger
    public Report provideReport() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Report();
    }

}
