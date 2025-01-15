package net.minecraft.network.handshake;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.ProtocolType;
import net.minecraft.network.handshake.client.CHandshakePacket;
import net.minecraft.network.login.ServerLoginNetHandler;
import net.minecraft.network.login.server.SDisconnectLoginPacket;
import net.minecraft.network.status.ServerStatusNetHandler;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class ServerHandshakeNetHandler implements IHandshakeNetHandler
{
    private final MinecraftServer server;
    private final NetworkManager networkManager;

    public ServerHandshakeNetHandler(MinecraftServer p_i4135_1_, NetworkManager p_i4135_2_)
    {
        this.server = p_i4135_1_;
        this.networkManager = p_i4135_2_;
    }

    public void processHandshake(CHandshakePacket packetIn)
    {
        switch (packetIn.getRequestedState())
        {
            case LOGIN:
                this.networkManager.setConnectionState(ProtocolType.LOGIN);

                if (packetIn.getProtocolVersion() > SharedConstants.getVersion().getProtocolVersion())
                {
                    ITextComponent itextcomponent = new TranslationTextComponent("multiplayer.disconnect.outdated_server", SharedConstants.getVersion().getName());
                    this.networkManager.sendPacket(new SDisconnectLoginPacket(itextcomponent));
                    this.networkManager.closeChannel(itextcomponent);
                }
                else if (packetIn.getProtocolVersion() < SharedConstants.getVersion().getProtocolVersion())
                {
                    ITextComponent itextcomponent1 = new TranslationTextComponent("multiplayer.disconnect.outdated_client", SharedConstants.getVersion().getName());
                    this.networkManager.sendPacket(new SDisconnectLoginPacket(itextcomponent1));
                    this.networkManager.closeChannel(itextcomponent1);
                }
                else
                {
                    this.networkManager.setNetHandler(new ServerLoginNetHandler(this.server, this.networkManager));
                }

                break;

            case STATUS:
                this.networkManager.setConnectionState(ProtocolType.STATUS);
                this.networkManager.setNetHandler(new ServerStatusNetHandler(this.server, this.networkManager));
                break;

            default:
                throw new UnsupportedOperationException("Invalid intention " + packetIn.getRequestedState());
        }
    }

    public void onDisconnect(ITextComponent reason)
    {
    }

    public NetworkManager getNetworkManager()
    {
        return this.networkManager;
    }
}
