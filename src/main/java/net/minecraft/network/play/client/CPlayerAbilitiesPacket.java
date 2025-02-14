package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerAbilitiesPacket implements IPacket<IServerPlayNetHandler> {
    private boolean flying;

   public CPlayerAbilitiesPacket() {
   }

   public CPlayerAbilitiesPacket(PlayerAbilities capabilities) {
      this.flying = capabilities.isFlying;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      byte b0 = buf.readByte();
      this.flying = (b0 & 2) != 0;
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      byte b0 = 0;

      if (this.flying)
      {
         b0 = (byte)(b0 | 2);
      }

      buf.writeByte(b0);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processPlayerAbilities(this);
   }

   public boolean isFlying() {
      return this.flying;
   }
}
