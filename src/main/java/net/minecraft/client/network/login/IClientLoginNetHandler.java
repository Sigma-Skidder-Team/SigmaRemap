package net.minecraft.client.network.login;

import net.minecraft.network.login.server.*;
import net.minecraft.network.INetHandler;

public interface IClientLoginNetHandler extends INetHandler {
   void handleEncryptionRequest(SEncryptionRequestPacket var1);

   void handleLoginSuccess(SLoginSuccessPacket var1);

   void handleDisconnect(SDisconnectLoginPacket var1);

   void handleEnableCompression(SEnableCompressionPacket var1);

   void handleCustomPayloadLogin(SCustomPayloadLoginPacket var1);
}
