package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceAspect {
    @Around("@annotation(org.example.aspect.PerformanceLogger)")
    public Object performanceLogger(ProceedingJoinPoint joinPoint) throws Throwable {

        Object method = null;
        long startTime = 0;

        try {
            startTime = System.currentTimeMillis();
            method = joinPoint.proceed();
        }finally {
            long endTime = System.currentTimeMillis();
            System.out.println(
                    String.format("%s take times %d milliseconds.", joinPoint.getSignature().getName(),(endTime - startTime))
            );

        }
        return method;

    }

}
