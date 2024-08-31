package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.List;

public class SSetPassengersPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24353;
   private int field24354;
   private int[] field24355;

   public SSetPassengersPacket() {
   }

   public SSetPassengersPacket(Entity var1) {
      this.field24354 = var1.method3205();
      List var4 = var1.method3408();
      this.field24355 = new int[var4.size()];

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.field24355[var5] = ((Entity)var4.get(var5)).method3205();
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24354 = var1.method35714();
      this.field24355 = var1.method35702();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24354);
      var1.method35701(this.field24355);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleSetPassengers(this);
   }

   public int[] method17252() {
      return this.field24355;
   }

   public int method17253() {
      return this.field24354;
   }
}
