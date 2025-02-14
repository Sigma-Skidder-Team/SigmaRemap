package net.minecraft.network;

import net.minecraft.util.text.ITextComponent;

public interface INetHandler {
   void onDisconnect(ITextComponent var1);

   NetworkManager getNetworkManager();
}
