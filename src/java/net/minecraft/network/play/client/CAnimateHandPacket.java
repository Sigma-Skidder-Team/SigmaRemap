package net.minecraft.network.play.client;

import net.minecraft.util.Hand;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CAnimateHandPacket implements Packet<IServerPlayNetHandler> {
    private Hand hand;

   public CAnimateHandPacket() {
   }

   public CAnimateHandPacket(Hand var1) {
      this.hand = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.hand = var1.<Hand>method35712(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.hand);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleAnimation(this);
   }

   public Hand getHand() {
      return this.hand;
   }
}
