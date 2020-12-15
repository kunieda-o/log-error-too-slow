package logtest.gcplog;

public class GcpLogTraceHolder {
    static ThreadLocal<String> traceHolder = new ThreadLocal<>();

    public static String get() {
        return traceHolder.get();
    }

    static void set(String a) {
        traceHolder.set(a);
    }
}
