package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CConfirmTeleportPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24747;
   private int field24748;

   public CConfirmTeleportPacket() {
   }

   public CConfirmTeleportPacket(int var1) {
      this.field24748 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24748 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24748);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processConfirmTeleport(this);
   }

   public int method17524() {
      return this.field24748;
   }
}
