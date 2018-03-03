package org.javacord.entity.auditlog.impl;

import org.javacord.DiscordApi;
import org.javacord.entity.DiscordEntity;
import org.javacord.entity.auditlog.AuditLogEntry;
import org.javacord.entity.auditlog.AuditLogEntryTarget;
import org.javacord.entity.DiscordEntity;
import org.javacord.entity.auditlog.AuditLogEntry;
import org.javacord.entity.auditlog.AuditLogEntryTarget;

import java.util.Objects;

/**
 * The implementation of {@link AuditLogEntryTarget}.
 */
public class ImplAuditLogEntryTarget implements AuditLogEntryTarget {

    /**
     * The id of the target.
     */
    private final long id;

    /**
     * The audit log entry, this target belongs to.
     */
    private final AuditLogEntry auditLogEntry;

    /**
     * Creates a new audit log entry target.
     *
     * @param id The id of the target.
     * @param auditLogEntry audit log entry this target belongs to.
     */
    public ImplAuditLogEntryTarget(long id, AuditLogEntry auditLogEntry) {
        this.id = id;
        this.auditLogEntry = auditLogEntry;
    }

    @Override
    public DiscordApi getApi() {
        return auditLogEntry.getApi();
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public AuditLogEntry getAuditLogEntry() {
        return auditLogEntry;
    }

    @Override
    public boolean equals(Object o) {
        return (this == o)
               || !((o == null)
                    || (getClass() != o.getClass())
                    || (getId() != ((DiscordEntity) o).getId()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return String.format("AuditLogEntryTarget (id: %s)", getIdAsString());
    }

}