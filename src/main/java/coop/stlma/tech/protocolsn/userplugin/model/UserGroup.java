package coop.stlma.tech.protocolsn.userplugin.model;

import io.micronaut.serde.annotation.Serdeable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

/**
 * Standard representation of user groups
 *
 * @author John Meyerin
 */
@Serdeable
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserGroup {
    private UUID id;
    private String groupName;
    private Boolean newUserDefault;
}
