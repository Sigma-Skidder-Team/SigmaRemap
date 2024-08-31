package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SWindowPropertyPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24334;
   private int field24335;
   private int field24336;
   private int field24337;

   public SWindowPropertyPacket() {
   }

   public SWindowPropertyPacket(int var1, int var2, int var3) {
      this.field24335 = var1;
      this.field24336 = var2;
      this.field24337 = var3;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleWindowProperty(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24335 = var1.readUnsignedByte();
      this.field24336 = var1.readShort();
      this.field24337 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24335);
      var1.writeShort(this.field24336);
      var1.writeShort(this.field24337);
   }

   public int method17239() {
      return this.field24335;
   }

   public int method17240() {
      return this.field24336;
   }

   public int method17241() {
      return this.field24337;
   }
}
