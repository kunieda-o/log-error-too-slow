package logtest.gcplog;

import com.google.cloud.logging.LogEntry;
import com.google.cloud.logging.LoggingEnhancer;
import logtest.GcpUtil;
import org.apache.commons.lang3.StringUtils;

public class GcpEnhancer implements LoggingEnhancer {

    @Override
    public void enhanceLogEntry(LogEntry.Builder builder) {
        System.out.println("log entry here");
        String trace = GcpLogTraceHolder.get();
        if (StringUtils.isNotEmpty(trace)) {
            builder.setTrace("projects/" + GcpUtil.getProjectId() + "/traces/" + GcpLogTraceHolder.get());
        }
    }
}
