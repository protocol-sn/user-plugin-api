package coop.stlma.tech.protocolsn.userpluginapi;

import coop.stlma.tech.protocolsn.userplugin.UserQueryCriteria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneratedBehaviorTest {

    @Test
    void testHasApproved() {
        UserQueryCriteria criteria = UserQueryCriteria.newBuilder()
                .setApproved(true)
                .build();

        Assertions.assertTrue(criteria.hasApproved());
        Assertions.assertFalse(criteria.hasVerified());
        Assertions.assertFalse(criteria.hasRequestsVerification());
    }
}
