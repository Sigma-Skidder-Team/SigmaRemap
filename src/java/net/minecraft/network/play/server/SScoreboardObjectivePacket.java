package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.Class2316;
import mapped.Class8375;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;

public class SScoreboardObjectivePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24729;
   private String field24730;
   private ITextComponent field24731;
   private Class2316 field24732;
   private int field24733;

   public SScoreboardObjectivePacket() {
   }

   public SScoreboardObjectivePacket(Class8375 var1, int var2) {
      this.field24730 = var1.method29336();
      this.field24731 = var1.method29338();
      this.field24732 = var1.method29342();
      this.field24733 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24730 = var1.readString(16);
      this.field24733 = var1.readByte();
      if (this.field24733 == 0 || this.field24733 == 2) {
         this.field24731 = var1.method35710();
         this.field24732 = var1.<Class2316>method35712(Class2316.class);
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeString(this.field24730);
      var1.writeByte(this.field24733);
      if (this.field24733 == 0 || this.field24733 == 2) {
         var1.writeTextComponent(this.field24731);
         var1.method35713(this.field24732);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleScoreboardObjective(this);
   }

   public String method17510() {
      return this.field24730;
   }

   public ITextComponent method17511() {
      return this.field24731;
   }

   public int method17512() {
      return this.field24733;
   }

   public Class2316 method17513() {
      return this.field24732;
   }
}
