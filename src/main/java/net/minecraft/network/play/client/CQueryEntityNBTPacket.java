package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CQueryEntityNBTPacket implements IPacket<IServerPlayNetHandler> {
   private static String[] field24670;
   private int field24671;
   private int field24672;

   public CQueryEntityNBTPacket() {
   }

   public CQueryEntityNBTPacket(int var1, int var2) {
      this.field24671 = var1;
      this.field24672 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24671 = var1.readVarInt();
      this.field24672 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24671);
      var1.writeVarInt(this.field24672);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processNBTQueryEntity(this);
   }

   public int method17478() {
      return this.field24671;
   }

   public int method17479() {
      return this.field24672;
   }
}
