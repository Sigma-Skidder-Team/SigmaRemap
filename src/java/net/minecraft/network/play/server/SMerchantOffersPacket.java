package net.minecraft.network.play.server;

import mapped.Class46;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SMerchantOffersPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24431;
   private int field24432;
   private Class46 field24433;
   private int field24434;
   private int field24435;
   private boolean field24436;
   private boolean field24437;

   public SMerchantOffersPacket() {
   }

   public SMerchantOffersPacket(int var1, Class46 var2, int var3, int var4, boolean var5, boolean var6) {
      this.field24432 = var1;
      this.field24433 = var2;
      this.field24434 = var3;
      this.field24435 = var4;
      this.field24436 = var5;
      this.field24437 = var6;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24432 = var1.readVarInt();
      this.field24433 = Class46.method165(var1);
      this.field24434 = var1.readVarInt();
      this.field24435 = var1.readVarInt();
      this.field24436 = var1.readBoolean();
      this.field24437 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24432);
      this.field24433.method164(var1);
      var1.writeVarInt(this.field24434);
      var1.writeVarInt(this.field24435);
      var1.writeBoolean(this.field24436);
      var1.writeBoolean(this.field24437);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleMerchantOffers(this);
   }

   public int method17309() {
      return this.field24432;
   }

   public Class46 method17310() {
      return this.field24433;
   }

   public int method17311() {
      return this.field24434;
   }

   public int method17312() {
      return this.field24435;
   }

   public boolean method17313() {
      return this.field24436;
   }

   public boolean method17314() {
      return this.field24437;
   }
}
