package logtest.gcplog;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.Optional;

@Slf4j
@Provider
public class GcpLogFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        // https://cloud.google.com/trace/docs/troubleshooting
        String trace = Optional.ofNullable(requestContext.getHeaders().getFirst("X-Cloud-Trace-Context"))
                .orElse("")
                .replaceAll("/.*$", "");
        log.info("trace:" + trace);
        GcpLogTraceHolder.set(trace);
    }
}
