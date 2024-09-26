package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.Difficulty;

import java.io.IOException;

public class CSetDifficultyPacket implements IPacket<IServerPlayNetHandler> {
    private Difficulty field_218774_a;

   public CSetDifficultyPacket() {
   }

   public CSetDifficultyPacket(Difficulty var1) {
      this.field_218774_a = var1;
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_217263_a(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_218774_a = Difficulty.method8907(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field_218774_a.getId());
   }

   public Difficulty func_218773_b() {
      return this.field_218774_a;
   }
}
