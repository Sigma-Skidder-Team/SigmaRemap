package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CConfirmTeleportPacket implements Packet<IServerPlayNetHandler> {
    private int telportId;

   public CConfirmTeleportPacket() {
   }

   public CConfirmTeleportPacket(int var1) {
      this.telportId = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.telportId = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.telportId);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processConfirmTeleport(this);
   }

   public int getTeleportId() {
      return this.telportId;
   }
}
