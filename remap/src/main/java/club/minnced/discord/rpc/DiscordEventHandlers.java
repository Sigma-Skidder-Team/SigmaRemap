// 
// Decompiled by Procyon v0.6.0
// 

package club.minnced.discord.rpc;

import java.util.Collections;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import com.sun.jna.Structure;

public class DiscordEventHandlers extends Structure
{
    private static final List<String> FIELD_ORDER;
    public DiscordEventHandlers$OnReady ready;
    public DiscordEventHandlers$OnStatus disconnected;
    public DiscordEventHandlers$OnStatus errored;
    public DiscordEventHandlers$OnGameUpdate joinGame;
    public DiscordEventHandlers$OnGameUpdate spectateGame;
    public DiscordEventHandlers$OnJoinRequest joinRequest;
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscordEventHandlers)) {
            return false;
        }
        final DiscordEventHandlers discordEventHandlers = (DiscordEventHandlers)o;
        return Objects.equals(this.ready, discordEventHandlers.ready) && Objects.equals(this.disconnected, discordEventHandlers.disconnected) && Objects.equals(this.errored, discordEventHandlers.errored) && Objects.equals(this.joinGame, discordEventHandlers.joinGame) && Objects.equals(this.spectateGame, discordEventHandlers.spectateGame) && Objects.equals(this.joinRequest, discordEventHandlers.joinRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.ready, this.disconnected, this.errored, this.joinGame, this.spectateGame, this.joinRequest);
    }
    
    @Override
    public List<String> getFieldOrder() {
        return DiscordEventHandlers.FIELD_ORDER;
    }
    
    static {
        FIELD_ORDER = Collections.unmodifiableList(Arrays.asList("ready", "disconnected", "errored", "joinGame", "spectateGame", "joinRequest"));
    }
}
