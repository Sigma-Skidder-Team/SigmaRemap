package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SUpdateHealthPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24810;
   private float field24811;
   private int field24812;
   private float field24813;

   public SUpdateHealthPacket() {
   }

   public SUpdateHealthPacket(float var1, int var2, float var3) {
      this.field24811 = var1;
      this.field24812 = var2;
      this.field24813 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24811 = var1.readFloat();
      this.field24812 = var1.readVarInt();
      this.field24813 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat(this.field24811);
      var1.writeVarInt(this.field24812);
      var1.writeFloat(this.field24813);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleUpdateHealth(this);
   }

   public float method17574() {
      return this.field24811;
   }

   public int method17575() {
      return this.field24812;
   }

   public float method17576() {
      return this.field24813;
   }
}
