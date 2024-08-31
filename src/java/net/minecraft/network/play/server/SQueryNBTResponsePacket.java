package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SQueryNBTResponsePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24456;
   private int field24457;
   private CompoundNBT field24458;

   public SQueryNBTResponsePacket() {
   }

   public SQueryNBTResponsePacket(int var1, CompoundNBT var2) {
      this.field24457 = var1;
      this.field24458 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24457 = var1.readVarInt();
      this.field24458 = var1.method35721();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24457);
      var1.method35720(this.field24458);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleNBTQueryResponse(this);
   }

   public int method17328() {
      return this.field24457;
   }

   @Nullable
   public CompoundNBT method17329() {
      return this.field24458;
   }

   @Override
   public boolean method17181() {
      return true;
   }
}
