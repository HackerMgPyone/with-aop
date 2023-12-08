package org.example.logging;

public class PerformanceLogger {


    public PerformanceLoggerInfo start(String name) {
        return new PerformanceLoggerInfo(name,System.currentTimeMillis());
    }

    public void end(PerformanceLoggerInfo info) {
        long startTime = info.getTime();
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("%s take times %d milliseconds.",
                info.getName(),(endTime - startTime)));
    }



    public static class PerformanceLoggerInfo{
        private String name;
        private long time;

        public PerformanceLoggerInfo(String name, long time) {
            this.name = name;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public long getTime() {
            return time;
        }
    }
}
