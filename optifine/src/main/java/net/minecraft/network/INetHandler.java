package net.minecraft.network;

import net.minecraft.util.text.ITextComponent;

public interface INetHandler
{
    void onDisconnect(ITextComponent reason);

    NetworkManager getNetworkManager();
}
