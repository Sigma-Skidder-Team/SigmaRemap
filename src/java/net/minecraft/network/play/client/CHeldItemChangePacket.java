package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CHeldItemChangePacket implements IPacket<IServerPlayNetHandler> {
    private int slotId;

   public CHeldItemChangePacket() {
   }

   public CHeldItemChangePacket(int slotIn) {
      this.slotId = slotIn;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.slotId = buf.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeShort(this.slotId);
   }

   public void processPacket(IServerPlayNetHandler handler) {
      handler.processHeldItemChange(this);
   }

   public int getSlotId() {
      return this.slotId;
   }
}
