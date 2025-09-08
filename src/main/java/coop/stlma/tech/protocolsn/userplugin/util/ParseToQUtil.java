package coop.stlma.tech.protocolsn.userplugin.util;

import coop.stlma.tech.protocolsn.userplugin.UserGroupQueryCriteria;
import coop.stlma.tech.protocolsn.userplugin.model.GroupQueryCriteria;
import coop.stlma.tech.protocolsn.userplugin.model.UserQueryCriteria;

/**
 * Utility class for parsing the values into the 'q' parameter of the Keycloak query
 *
 * @author John Meyerin
 */
public class ParseToQUtil {
    private ParseToQUtil() {}

    /**
     * Parse the values into the 'q' parameter of the Keycloak query
     * @return  Space-separated string of key/value pairs
     */
    public static String parseToQ(UserQueryCriteria query) {
        StringBuilder sb = new StringBuilder();
        if (query.getApproved() != null) {
            sb.append("approved:").append(query.getApproved()).append(" ");
        }
        if (query.getVerified() != null) {
            sb.append("verified:").append(query.getVerified()).append(" ");
        }
        if (query.getRequestsVerification() != null) {
            sb.append("requests-verification:").append(query.getRequestsVerification()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Parse the values into the 'q' parameter of the Keycloak query
     * @return  Space-separated string of key/value pairs
     */
    public static String parseToQ(coop.stlma.tech.protocolsn.userplugin.UserQueryCriteria query) {
        StringBuilder sb = new StringBuilder();
        if (query.hasApproved()) {
            sb.append("approved:").append(query.getApproved()).append(" ");
        }
        if (query.hasVerified()) {
            sb.append("verified:").append(query.getVerified()).append(" ");
        }
        if (query.hasRequestsVerification()) {
            sb.append("requests-verification:").append(query.getRequestsVerification()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Parse the values into the 'q' parameter of the Keycloak query
     * @return  Space-separated string of key/value pairs
     */
    public static String parseToQ(GroupQueryCriteria groupQueryCriteria) {
        StringBuilder sb = new StringBuilder();
        if (groupQueryCriteria.getDefaultUserGroup() != null) {
            sb.append("default:").append(groupQueryCriteria.getDefaultUserGroup()).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * Parse the values into the 'q' parameter of the Keycloak query
     * @return  Space-separated string of key/value pairs
     */
    public static String parseToQ(UserGroupQueryCriteria groupQueryCriteria) {
        StringBuilder sb = new StringBuilder();
        if (groupQueryCriteria.hasDefaultUserGroup()) {
            sb.append("default:").append(groupQueryCriteria.getDefaultUserGroup()).append(" ");
        }
        return sb.toString().trim();
    }
}
