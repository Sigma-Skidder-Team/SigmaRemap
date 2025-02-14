package net.minecraft.network.play.client;

import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.Hand;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerTryUseItemOnBlockPacket implements IPacket<IServerPlayNetHandler> {
    private BlockRayTraceResult field_218795_a;
   private Hand hand;

   public CPlayerTryUseItemOnBlockPacket() {
   }

   public CPlayerTryUseItemOnBlockPacket(Hand var1, BlockRayTraceResult var2) {
      this.hand = var1;
      this.field_218795_a = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.hand = var1.<Hand>readEnumValue(Hand.class);
      this.field_218795_a = var1.readBlockRay();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.hand);
      var1.writeBlockRay(this.field_218795_a);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processTryUseItemOnBlock(this);
   }

   public Hand getHand() {
      return this.hand;
   }

   public BlockRayTraceResult func_218794_c() {
      return this.field_218795_a;
   }
}
