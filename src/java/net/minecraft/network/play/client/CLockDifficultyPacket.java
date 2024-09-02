package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CLockDifficultyPacket implements Packet<IServerPlayNetHandler> {
    private boolean field_218777_a;

   public CLockDifficultyPacket() {
   }

   public CLockDifficultyPacket(boolean var1) {
      this.field_218777_a = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_217261_a(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_218777_a = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field_218777_a);
   }

   public boolean func_218776_b() {
      return this.field_218777_a;
   }
}
