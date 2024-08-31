package net.minecraft.network.play.server;

import net.minecraft.util.Hand;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SOpenBookWindowPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24454;
   private Hand field24455;

   public SOpenBookWindowPacket() {
   }

   public SOpenBookWindowPacket(Hand var1) {
      this.field24455 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24455 = var1.<Hand>method35712(Hand.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24455);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleOpenBookPacket(this);
   }

   public Hand method17327() {
      return this.field24455;
   }
}
