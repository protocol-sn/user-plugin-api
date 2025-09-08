package coop.stlma.tech.protocolsn.userplugin.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Query criteria for users
 *
 * @author John Meyerin
 */
@Builder
@Getter
@Setter
@Serdeable
public class UserQueryCriteria {
    private Integer offset;
    private Integer limit;
    private Boolean approved;
    private Boolean verified;
    private Boolean requestsVerification;
    private String search;
}
