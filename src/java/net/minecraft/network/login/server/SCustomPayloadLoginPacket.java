package net.minecraft.network.login.server;

import net.minecraft.client.network.login.IClientLoginNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class SCustomPayloadLoginPacket implements Packet<IClientLoginNetHandler> {
   private int transaction;
   private ResourceLocation channel;
   private PacketBuffer payload;

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.transaction = var1.readVarInt();
      this.channel = var1.readResourceLocation();
      int i = var1.readableBytes();
      if (i >= 0 && i <= 1048576) {
         this.payload = new PacketBuffer(var1.readBytes(i));
      } else {
         throw new IOException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.transaction);
      var1.writeResourceLocation(this.channel);
      var1.writeBytes(this.payload.copy());
   }

   public void processPacket(IClientLoginNetHandler var1) {
      var1.handleCustomPayloadLogin(this);
   }

   public int getTransaction() {
      return this.transaction;
   }
}
