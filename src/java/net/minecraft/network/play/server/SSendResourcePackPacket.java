package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SSendResourcePackPacket implements Packet<IClientPlayNetHandler> {
   private String field24526;
   private String field24527;

   public SSendResourcePackPacket() {
   }

   public SSendResourcePackPacket(String var1, String var2) {
      this.field24526 = var1;
      this.field24527 = var2;
      if (var2.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + var2.length() + ")");
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24526 = var1.readString(32767);
      this.field24527 = var1.readString(40);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.field24526);
      var1.writeString(this.field24527);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleResourcePack(this);
   }

   public String method17385() {
      return this.field24526;
   }

   public String method17386() {
      return this.field24527;
   }
}
