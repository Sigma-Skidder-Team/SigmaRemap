package net.minecraft.client.network.handshake;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.handshake.IHandshakeNetHandler;
import net.minecraft.network.handshake.client.CHandshakePacket;
import net.minecraft.network.login.ServerLoginNetHandler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;

public class ClientHandshakeNetHandler implements IHandshakeNetHandler
{
    private final MinecraftServer server;
    private final NetworkManager networkManager;

    public ClientHandshakeNetHandler(MinecraftServer p_i3006_1_, NetworkManager p_i3006_2_)
    {
        this.server = p_i3006_1_;
        this.networkManager = p_i3006_2_;
    }

    public void processHandshake(CHandshakePacket packetIn)
    {
        this.networkManager.setConnectionState(packetIn.getRequestedState());
        this.networkManager.setNetHandler(new ServerLoginNetHandler(this.server, this.networkManager));
    }

    public void onDisconnect(ITextComponent reason)
    {
    }

    public NetworkManager getNetworkManager()
    {
        return this.networkManager;
    }
}
