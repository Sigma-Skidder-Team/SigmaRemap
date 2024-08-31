package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SAnimateHandPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24272;
   private int field24273;
   private int field24274;

   public SAnimateHandPacket() {
   }

   public SAnimateHandPacket(Entity var1, int var2) {
      this.field24273 = var1.method3205();
      this.field24274 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24273 = var1.readVarInt();
      this.field24274 = var1.readUnsignedByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24273);
      var1.writeByte(this.field24274);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleAnimation(this);
   }

   public int method17192() {
      return this.field24273;
   }

   public int method17193() {
      return this.field24274;
   }
}
