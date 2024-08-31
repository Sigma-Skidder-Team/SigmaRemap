package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.Class2301;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;

public class STitlePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24804;
   private Class2301 field24805;
   private ITextComponent field24806;
   private int field24807;
   private int field24808;
   private int field24809;

   public STitlePacket() {
   }

   public STitlePacket(Class2301 var1, ITextComponent var2) {
      this(var1, var2, -1, -1, -1);
   }

   public STitlePacket(int var1, int var2, int var3) {
      this(Class2301.field15713, (ITextComponent)null, var1, var2, var3);
   }

   public STitlePacket(Class2301 var1, ITextComponent var2, int var3, int var4, int var5) {
      this.field24805 = var1;
      this.field24806 = var2;
      this.field24807 = var3;
      this.field24808 = var4;
      this.field24809 = var5;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24805 = var1.<Class2301>method35712(Class2301.class);
      if (this.field24805 == Class2301.field15710 || this.field24805 == Class2301.field15711 || this.field24805 == Class2301.field15712) {
         this.field24806 = var1.method35710();
      }

      if (this.field24805 == Class2301.field15713) {
         this.field24807 = var1.readInt();
         this.field24808 = var1.readInt();
         this.field24809 = var1.readInt();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24805);
      if (this.field24805 == Class2301.field15710 || this.field24805 == Class2301.field15711 || this.field24805 == Class2301.field15712) {
         var1.method35711(this.field24806);
      }

      if (this.field24805 == Class2301.field15713) {
         var1.writeInt(this.field24807);
         var1.writeInt(this.field24808);
         var1.writeInt(this.field24809);
      }
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleTitle(this);
   }

   public Class2301 method17569() {
      return this.field24805;
   }

   public ITextComponent method17570() {
      return this.field24806;
   }

   public int method17571() {
      return this.field24807;
   }

   public int method17572() {
      return this.field24808;
   }

   public int method17573() {
      return this.field24809;
   }
}
