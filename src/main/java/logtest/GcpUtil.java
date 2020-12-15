package logtest;

import org.apache.commons.lang3.StringUtils;

public class GcpUtil {
    public static final String ENV_GOOGLE_CLOUD_PROJECT = "GOOGLE_CLOUD_PROJECT";

    static String projectId = null;

    public static String getProjectId() {
        if (projectId == null) {
            projectId = System.getenv(ENV_GOOGLE_CLOUD_PROJECT);
            if (StringUtils.isEmpty(projectId)) {
                projectId = "";
            }
        }
        return projectId;
    }
}
