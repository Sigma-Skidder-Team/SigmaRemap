package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SDestroyEntitiesPacket implements Packet<IClientPlayNetHandler> {
    private int[] entityIDs;

   public SDestroyEntitiesPacket() {
   }

   public SDestroyEntitiesPacket(int... var1) {
      this.entityIDs = var1;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.entityIDs = new int[buf.readVarInt()];

      for (int i = 0; i < this.entityIDs.length; ++i)
      {
         this.entityIDs[i] = buf.readVarInt();
      }
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeVarInt(this.entityIDs.length);

      for (int i : this.entityIDs)
      {
         buf.writeVarInt(i);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleDestroyEntities(this);
   }

   public int[] getEntityIDs() {
      return this.entityIDs;
   }
}
