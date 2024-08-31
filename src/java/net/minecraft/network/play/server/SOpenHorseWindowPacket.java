package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SOpenHorseWindowPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24450;
   private int field24451;
   private int field24452;
   private int field24453;

   public SOpenHorseWindowPacket() {
   }

   public SOpenHorseWindowPacket(int var1, int var2, int var3) {
      this.field24451 = var1;
      this.field24452 = var2;
      this.field24453 = var3;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleOpenHorseWindow(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24451 = var1.readUnsignedByte();
      this.field24452 = var1.readVarInt();
      this.field24453 = var1.readInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24451);
      var1.writeVarInt(this.field24452);
      var1.writeInt(this.field24453);
   }

   public int method17324() {
      return this.field24451;
   }

   public int method17325() {
      return this.field24452;
   }

   public int method17326() {
      return this.field24453;
   }
}
