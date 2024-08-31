package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SDestroyEntitiesPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24351;
   private int[] field24352;

   public SDestroyEntitiesPacket() {
   }

   public SDestroyEntitiesPacket(int... var1) {
      this.field24352 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24352 = new int[var1.method35714()];

      for (int var4 = 0; var4 < this.field24352.length; var4++) {
         this.field24352[var4] = var1.method35714();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24352.length);

      for (int var7 : this.field24352) {
         var1.writeVarInt(var7);
      }
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleDestroyEntities(this);
   }

   public int[] method17251() {
      return this.field24352;
   }
}
