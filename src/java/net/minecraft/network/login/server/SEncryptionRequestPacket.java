package net.minecraft.network.login.server;

import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.CryptException;
import net.minecraft.util.CryptManager;

import java.io.IOException;
import java.security.PublicKey;


public class SEncryptionRequestPacket implements Packet<IClientLoginNetHandler> {
   private String hashedServerId;
   private byte[] publicKey;
   private byte[] verifyToken;

   public SEncryptionRequestPacket() {
   }

   public SEncryptionRequestPacket(String var1, byte[] var2, byte[] var3) {
      this.hashedServerId = var1;
      this.publicKey = var2;
      this.verifyToken = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.hashedServerId = var1.readString(20);
      this.publicKey = var1.readByteArray();
      this.verifyToken = var1.readByteArray();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.hashedServerId);
      var1.writeByteArray(this.publicKey);
      var1.writeByteArray(this.verifyToken);
   }

   public void processPacket(IClientLoginNetHandler var1) {
      var1.handleEncryptionRequest(this);
   }

   public String getServerId() {
      return this.hashedServerId;
   }

   public PublicKey getPublicKey() throws CryptException {
      return CryptManager.decodePublicKey(this.publicKey);
   }

   public byte[] getVerifyToken() {
      return this.verifyToken;
   }
}
