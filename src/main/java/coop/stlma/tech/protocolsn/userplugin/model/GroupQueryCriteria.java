package coop.stlma.tech.protocolsn.userplugin.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Query criteria for groups
 *
 * @author John Meyerin
 */
@Builder
@Getter
@Setter
@Serdeable
public class GroupQueryCriteria {
    private Integer offset;
    private Integer limit;
    private Boolean defaultUserGroup;

}
