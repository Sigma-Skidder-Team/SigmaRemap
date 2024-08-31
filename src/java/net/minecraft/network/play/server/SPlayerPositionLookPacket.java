package net.minecraft.network.play.server;

import mapped.Class2033;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.Set;

public class SPlayerPositionLookPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24296;
   public double field24297;
   public double field24298;
   public double field24299;
   public float field24300;
   public float field24301;
   private Set<Class2033> field24302;
   private int field24303;

   public SPlayerPositionLookPacket() {
   }

   public SPlayerPositionLookPacket(double var1, double var3, double var5, float var7, float var8, Set<Class2033> var9, int var10) {
      this.field24297 = var1;
      this.field24298 = var3;
      this.field24299 = var5;
      this.field24300 = var7;
      this.field24301 = var8;
      this.field24302 = var9;
      this.field24303 = var10;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24297 = var1.readDouble();
      this.field24298 = var1.readDouble();
      this.field24299 = var1.readDouble();
      this.field24300 = var1.readFloat();
      this.field24301 = var1.readFloat();
      this.field24302 = Class2033.method8674(var1.readUnsignedByte());
      this.field24303 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeDouble(this.field24297);
      var1.writeDouble(this.field24298);
      var1.writeDouble(this.field24299);
      var1.writeFloat(this.field24300);
      var1.writeFloat(this.field24301);
      var1.writeByte(Class2033.method8675(this.field24302));
      var1.writeVarInt(this.field24303);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handlePlayerPosLook(this);
   }

   public double method17214() {
      return this.field24297;
   }

   public double method17215() {
      return this.field24298;
   }

   public double method17216() {
      return this.field24299;
   }

   public float method17217() {
      return this.field24300;
   }

   public float method17218() {
      return this.field24301;
   }

   public int method17219() {
      return this.field24303;
   }

   public Set<Class2033> method17220() {
      return this.field24302;
   }
}
