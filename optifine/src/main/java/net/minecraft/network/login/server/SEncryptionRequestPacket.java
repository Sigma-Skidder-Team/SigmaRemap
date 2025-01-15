package net.minecraft.network.login.server;

import java.io.IOException;
import java.security.PublicKey;
import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.CryptManager;

public class SEncryptionRequestPacket implements IPacket<IClientLoginNetHandler>
{
    private String hashedServerId;
    private PublicKey publicKey;
    private byte[] verifyToken;

    public SEncryptionRequestPacket()
    {
    }

    public SEncryptionRequestPacket(String p_i3912_1_, PublicKey p_i3912_2_, byte[] p_i3912_3_)
    {
        this.hashedServerId = p_i3912_1_;
        this.publicKey = p_i3912_2_;
        this.verifyToken = p_i3912_3_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.hashedServerId = buf.readString(20);
        this.publicKey = CryptManager.decodePublicKey(buf.readByteArray());
        this.verifyToken = buf.readByteArray();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.hashedServerId);
        buf.writeByteArray(this.publicKey.getEncoded());
        buf.writeByteArray(this.verifyToken);
    }

    public void processPacket(IClientLoginNetHandler handler)
    {
        handler.handleEncryptionRequest(this);
    }

    public String getServerId()
    {
        return this.hashedServerId;
    }

    public PublicKey getPublicKey()
    {
        return this.publicKey;
    }

    public byte[] getVerifyToken()
    {
        return this.verifyToken;
    }
}
