// 
// Decompiled by Procyon v0.6.0
// 

package club.minnced.discord.rpc;

import java.util.Collections;
import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import com.sun.jna.Structure;

public class DiscordRichPresence extends Structure
{
    private static final List<String> FIELD_ORDER;
    public String state;
    public String details;
    public long startTimestamp;
    public long endTimestamp;
    public String largeImageKey;
    public String largeImageText;
    public String smallImageKey;
    public String smallImageText;
    public String partyId;
    public int partySize;
    public int partyMax;
    public String matchSecret;
    public String joinSecret;
    public String spectateSecret;
    public byte instance;
    
    public DiscordRichPresence(final String encoding) {
        this.setStringEncoding(encoding);
    }
    
    public DiscordRichPresence() {
        this("UTF-8");
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscordRichPresence)) {
            return false;
        }
        final DiscordRichPresence discordRichPresence = (DiscordRichPresence)o;
        return this.startTimestamp == discordRichPresence.startTimestamp && this.endTimestamp == discordRichPresence.endTimestamp && this.partySize == discordRichPresence.partySize && this.partyMax == discordRichPresence.partyMax && this.instance == discordRichPresence.instance && Objects.equals(this.state, discordRichPresence.state) && Objects.equals(this.details, discordRichPresence.details) && Objects.equals(this.largeImageKey, discordRichPresence.largeImageKey) && Objects.equals(this.largeImageText, discordRichPresence.largeImageText) && Objects.equals(this.smallImageKey, discordRichPresence.smallImageKey) && Objects.equals(this.smallImageText, discordRichPresence.smallImageText) && Objects.equals(this.partyId, discordRichPresence.partyId) && Objects.equals(this.matchSecret, discordRichPresence.matchSecret) && Objects.equals(this.joinSecret, discordRichPresence.joinSecret) && Objects.equals(this.spectateSecret, discordRichPresence.spectateSecret);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.state, this.details, this.startTimestamp, this.endTimestamp, this.largeImageKey, this.largeImageText, this.smallImageKey, this.smallImageText, this.partyId, this.partySize, this.partyMax, this.matchSecret, this.joinSecret, this.spectateSecret, this.instance);
    }
    
    @Override
    public List<String> getFieldOrder() {
        return DiscordRichPresence.FIELD_ORDER;
    }
    
    static {
        FIELD_ORDER = Collections.unmodifiableList((List<? extends String>)Arrays.asList("state", "details", "startTimestamp", "endTimestamp", "largeImageKey", "largeImageText", "smallImageKey", "smallImageText", "partyId", "partySize", "partyMax", "matchSecret", "joinSecret", "spectateSecret", "instance"));
    }
}
