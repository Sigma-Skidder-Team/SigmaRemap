// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public interface IClientLoginNetHandler extends INetHandler
{
    void handleEncryptionRequest(final SEncryptionRequestPacket p0);
    
    void handleLoginSuccess(final SLoginSuccessPacket p0);
    
    void handleDisconnect(final SDisconnectLoginPacket p0);
    
    void handleEnableCompression(final SEnableCompressionPacket p0);
    
    void handleCustomPayloadLogin(final SCustomPayloadLoginPacket p0);
}
