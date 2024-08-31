package net.minecraft.network.play.server;

import mapped.Class2062;
import mapped.PacketBuffer;
import mapped.Vector3d;
import mapped.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SPlayerLookPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24869;
   private double field24870;
   private double field24871;
   private double field24872;
   private int field24873;
   private Class2062 field24874;
   private Class2062 field24875;
   private boolean field24876;

   public SPlayerLookPacket() {
   }

   public SPlayerLookPacket(Class2062 var1, double var2, double var4, double var6) {
      this.field24874 = var1;
      this.field24870 = var2;
      this.field24871 = var4;
      this.field24872 = var6;
   }

   public SPlayerLookPacket(Class2062 var1, Entity var2, Class2062 var3) {
      this.field24874 = var1;
      this.field24873 = var2.method3205();
      this.field24875 = var3;
      Vector3d var6 = var3.method8711(var2);
      this.field24870 = var6.x;
      this.field24871 = var6.y;
      this.field24872 = var6.z;
      this.field24876 = true;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24874 = var1.<Class2062>method35712(Class2062.class);
      this.field24870 = var1.readDouble();
      this.field24871 = var1.readDouble();
      this.field24872 = var1.readDouble();
      if (var1.readBoolean()) {
         this.field24876 = true;
         this.field24873 = var1.method35714();
         this.field24875 = var1.<Class2062>method35712(Class2062.class);
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24874);
      var1.writeDouble(this.field24870);
      var1.writeDouble(this.field24871);
      var1.writeDouble(this.field24872);
      var1.writeBoolean(this.field24876);
      if (this.field24876) {
         var1.writeVarInt(this.field24873);
         var1.method35713(this.field24875);
      }
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handlePlayerLook(this);
   }

   public Class2062 method17623() {
      return this.field24874;
   }

   @Nullable
   public Vector3d method17624(World var1) {
      if (!this.field24876) {
         return new Vector3d(this.field24870, this.field24871, this.field24872);
      } else {
         Entity var4 = var1.method6774(this.field24873);
         return var4 != null ? this.field24875.method8711(var4) : new Vector3d(this.field24870, this.field24871, this.field24872);
      }
   }
}
