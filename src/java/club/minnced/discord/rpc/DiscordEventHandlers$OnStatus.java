// 
// Decompiled by Procyon v0.6.0
// 

package club.minnced.discord.rpc;

import com.sun.jna.Callback;

public interface DiscordEventHandlers$OnStatus extends Callback
{
    void accept(final int p0, final String p1);
}
