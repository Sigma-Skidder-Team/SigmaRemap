// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.text.ITextComponent;

public interface INetHandler
{
    void onDisconnect(final ITextComponent p0);

    NetworkManager getNetworkManager();
}
