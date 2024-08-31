package net.minecraft.network.play.server;

import mapped.Class2073;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

public class SUpdateScorePacket implements Packet<IClientPlayNetHandler> {
   private String field24662 = "";
   private String field24663;
   private int field24664;
   private Class2073 field24665;

   public SUpdateScorePacket() {
   }

   public SUpdateScorePacket(Class2073 var1, String var2, String var3, int var4) {
      if (var1 != Class2073.field13504 && var2 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.field24662 = var3;
         this.field24663 = var2;
         this.field24664 = var4;
         this.field24665 = var1;
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24662 = var1.method35728(40);
      this.field24665 = var1.<Class2073>method35712(Class2073.class);
      String var4 = var1.method35728(16);
      this.field24663 = !Objects.equals(var4, "") ? var4 : null;
      if (this.field24665 != Class2073.field13504) {
         this.field24664 = var1.method35714();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24662);
      var1.method35713(this.field24665);
      var1.method35729(this.field24663 != null ? this.field24663 : "");
      if (this.field24665 != Class2073.field13504) {
         var1.writeVarInt(this.field24664);
      }
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleUpdateScore(this);
   }

   public String method17473() {
      return this.field24662;
   }

   @Nullable
   public String method17474() {
      return this.field24663;
   }

   public int method17475() {
      return this.field24664;
   }

   public Class2073 method17476() {
      return this.field24665;
   }
}
