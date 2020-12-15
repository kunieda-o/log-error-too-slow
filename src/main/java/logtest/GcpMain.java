package logtest;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.bridge.SLF4JBridgeHandler;

@QuarkusMain
@Slf4j
public class GcpMain {

    public static void main(String... args) {
        // jul to sfl4j ( quarkus jboss logging is included here)
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
        log.info("Running main method");
        Quarkus.run(args);
    }
}
