// 
// Decompiled by Procyon v0.6.0
// 

package club.minnced.discord.rpc;

import com.sun.jna.Callback;

public interface DiscordEventHandlers$OnJoinRequest extends Callback
{
    void accept(final DiscordUser p0);
}