package net.minecraft.network.play.client;

import net.minecraft.util.Hand;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CPlayerTryUseItemPacket implements IPacket<IServerPlayNetHandler> {
    private Hand hand;

   public CPlayerTryUseItemPacket() {
   }

   public CPlayerTryUseItemPacket(Hand var1) {
      this.hand = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.hand = var1.readEnumValue(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.hand);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processTryUseItem(this);
   }

   public Hand getHand() {
      return this.hand;
   }
}
