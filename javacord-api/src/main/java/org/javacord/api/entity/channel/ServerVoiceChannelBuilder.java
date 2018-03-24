package org.javacord.api.entity.channel;

import org.javacord.api.entity.channel.internal.ServerVoiceChannelBuilderDelegate;
import org.javacord.api.entity.server.Server;
import org.javacord.api.util.internal.DelegateFactory;

import java.util.concurrent.CompletableFuture;

/**
 * This class is used to create new server voice channels.
 */
public class ServerVoiceChannelBuilder {

    /**
     * The server text channel delegate used by this instance.
     */
    private final ServerVoiceChannelBuilderDelegate delegate;

    /**
     * Creates a new server text channel builder.
     *
     * @param server The server of the server text channel.
     */
    public ServerVoiceChannelBuilder(Server server) {
        delegate = DelegateFactory.createServerVoiceChannelBuilderDelegate(server);
    }

    /**
     * Sets the reason for this creation. This reason will be visible in the audit log entry(s).
     *
     * @param reason The reason for this update.
     * @return The current instance in order to chain call methods.
     */
    public ServerVoiceChannelBuilder setAuditLogReason(String reason) {
        delegate.setAuditLogReason(reason);
        return this;
    }

    /**
     * Sets the name of the channel.
     *
     * @param name The name of the channel.
     * @return The current instance in order to chain call methods.
     */
    public ServerVoiceChannelBuilder setName(String name) {
        delegate.setName(name);
        return this;
    }

    /**
     * Sets the category of the channel.
     *
     * @param category The category of the channel.
     * @return The current instance in order to chain call methods.
     */
    public ServerVoiceChannelBuilder setCategory(ChannelCategory category) {
        delegate.setCategory(category);
        return this;
    }

    /**
     * Sets the bitrate of the channel.
     *
     * @param bitrate The bitrate of the channel.
     * @return The current instance in order to chain call methods.
     */
    public ServerVoiceChannelBuilder setBitrate(int bitrate) {
        delegate.setBitrate(bitrate);
        return this;
    }

    /**
     * Sets the user limit of the channel.
     *
     * @param userlimit The user limit of the channel.
     * @return The current instance in order to chain call methods.
     */
    public ServerVoiceChannelBuilder setUserlimit(int userlimit) {
        delegate.setUserlimit(userlimit);
        return this;
    }

    /**
     * Creates the server voice channel.
     *
     * @return The created voice channel.
     */
    public CompletableFuture<ServerVoiceChannel> create() {
        return delegate.create();
    }

}
