package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import mapped.MathHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.List;

public class SExplosionPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24467;
   public double field24468;
   public double field24469;
   public double field24470;
   public float field24471;
   public List<BlockPos> field24472;
   public float field24473;
   public float field24474;
   public float field24475;

   public SExplosionPacket() {
   }

   public SExplosionPacket(double var1, double var3, double var5, float var7, List<BlockPos> var8, Vector3d var9) {
      this.field24468 = var1;
      this.field24469 = var3;
      this.field24470 = var5;
      this.field24471 = var7;
      this.field24472 = Lists.newArrayList(var8);
      if (var9 != null) {
         this.field24473 = (float)var9.x;
         this.field24474 = (float)var9.y;
         this.field24475 = (float)var9.z;
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24468 = (double)var1.readFloat();
      this.field24469 = (double)var1.readFloat();
      this.field24470 = (double)var1.readFloat();
      this.field24471 = var1.readFloat();
      int var4 = var1.readInt();
      this.field24472 = Lists.newArrayListWithCapacity(var4);
      int var5 = MathHelper.floor(this.field24468);
      int var6 = MathHelper.floor(this.field24469);
      int var7 = MathHelper.floor(this.field24470);

      for (int var8 = 0; var8 < var4; var8++) {
         int var9 = var1.readByte() + var5;
         int var10 = var1.readByte() + var6;
         int var11 = var1.readByte() + var7;
         this.field24472.add(new BlockPos(var9, var10, var11));
      }

      this.field24473 = var1.readFloat();
      this.field24474 = var1.readFloat();
      this.field24475 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat((float)this.field24468);
      var1.writeFloat((float)this.field24469);
      var1.writeFloat((float)this.field24470);
      var1.writeFloat(this.field24471);
      var1.writeInt(this.field24472.size());
      int var4 = MathHelper.floor(this.field24468);
      int var5 = MathHelper.floor(this.field24469);
      int var6 = MathHelper.floor(this.field24470);

      for (BlockPos var8 : this.field24472) {
         int var9 = var8.getX() - var4;
         int var10 = var8.getY() - var5;
         int var11 = var8.getZ() - var6;
         var1.writeByte(var9);
         var1.writeByte(var10);
         var1.writeByte(var11);
      }

      var1.writeFloat(this.field24473);
      var1.writeFloat(this.field24474);
      var1.writeFloat(this.field24475);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleExplosion(this);
   }

   public float method17338() {
      return this.field24473;
   }

   public float method17339() {
      return this.field24474;
   }

   public float method17340() {
      return this.field24475;
   }

   public double method17341() {
      return this.field24468;
   }

   public double method17342() {
      return this.field24469;
   }

   public double method17343() {
      return this.field24470;
   }

   public float method17344() {
      return this.field24471;
   }

   public List<BlockPos> method17345() {
      return this.field24472;
   }
}
