package net.minecraft.network.login.client;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.login.IServerLoginNetHandler;
import net.minecraft.util.CryptManager;

public class CEncryptionResponsePacket implements IPacket<IServerLoginNetHandler>
{
    private byte[] secretKeyEncrypted = new byte[0];
    private byte[] verifyTokenEncrypted = new byte[0];

    public CEncryptionResponsePacket()
    {
    }

    public CEncryptionResponsePacket(SecretKey p_i3284_1_, PublicKey p_i3284_2_, byte[] p_i3284_3_)
    {
        this.secretKeyEncrypted = CryptManager.encryptData(p_i3284_2_, p_i3284_1_.getEncoded());
        this.verifyTokenEncrypted = CryptManager.encryptData(p_i3284_2_, p_i3284_3_);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.secretKeyEncrypted = buf.readByteArray();
        this.verifyTokenEncrypted = buf.readByteArray();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByteArray(this.secretKeyEncrypted);
        buf.writeByteArray(this.verifyTokenEncrypted);
    }

    public void processPacket(IServerLoginNetHandler handler)
    {
        handler.processEncryptionResponse(this);
    }

    public SecretKey getSecretKey(PrivateKey key)
    {
        return CryptManager.decryptSharedKey(key, this.secretKeyEncrypted);
    }

    public byte[] getVerifyToken(PrivateKey key)
    {
        return key == null ? this.verifyTokenEncrypted : CryptManager.decryptData(key, this.verifyTokenEncrypted);
    }
}
