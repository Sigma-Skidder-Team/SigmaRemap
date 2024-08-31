package net.minecraft.network.play.server;

import mapped.Class2266;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import mapped.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SPlaySoundPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24314;
   public ResourceLocation field24315;
   private Class2266 field24316;
   private int field24317;
   private int field24318 = Integer.MAX_VALUE;
   private int field24319;
   private float field24320;
   private float field24321;

   public SPlaySoundPacket() {
   }

   public SPlaySoundPacket(ResourceLocation var1, Class2266 var2, Vector3d var3, float var4, float var5) {
      this.field24315 = var1;
      this.field24316 = var2;
      this.field24317 = (int)(var3.x * 8.0);
      this.field24318 = (int)(var3.y * 8.0);
      this.field24319 = (int)(var3.z * 8.0);
      this.field24320 = var4;
      this.field24321 = var5;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24315 = var1.readResourceLocation();
      this.field24316 = var1.<Class2266>method35712(Class2266.class);
      this.field24317 = var1.readInt();
      this.field24318 = var1.readInt();
      this.field24319 = var1.readInt();
      this.field24320 = var1.readFloat();
      this.field24321 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeResourceLocation(this.field24315);
      var1.method35713(this.field24316);
      var1.writeInt(this.field24317);
      var1.writeInt(this.field24318);
      var1.writeInt(this.field24319);
      var1.writeFloat(this.field24320);
      var1.writeFloat(this.field24321);
   }

   public ResourceLocation method17222() {
      return this.field24315;
   }

   public Class2266 method17223() {
      return this.field24316;
   }

   public double method17224() {
      return (double)((float)this.field24317 / 8.0F);
   }

   public double method17225() {
      return (double)((float)this.field24318 / 8.0F);
   }

   public double method17226() {
      return (double)((float)this.field24319 / 8.0F);
   }

   public float method17227() {
      return this.field24320;
   }

   public float method17228() {
      return this.field24321;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleCustomSound(this);
   }
}
