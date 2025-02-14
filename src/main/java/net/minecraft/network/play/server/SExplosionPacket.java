package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import net.minecraft.util.math.MathHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.List;

public class SExplosionPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24467;
   public double posX;
   public double posY;
   public double posZ;
   public float strength;
   public List<BlockPos> affectedBlockPositions;
   public float motionX;
   public float motionY;
   public float motionZ;

   public SExplosionPacket() {
   }

   public SExplosionPacket(double var1, double var3, double var5, float var7, List<BlockPos> var8, Vector3d var9) {
      this.posX = var1;
      this.posY = var3;
      this.posZ = var5;
      this.strength = var7;
      this.affectedBlockPositions = Lists.newArrayList(var8);
      if (var9 != null) {
         this.motionX = (float)var9.x;
         this.motionY = (float)var9.y;
         this.motionZ = (float)var9.z;
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.posX = (double)var1.readFloat();
      this.posY = (double)var1.readFloat();
      this.posZ = (double)var1.readFloat();
      this.strength = var1.readFloat();
      int var4 = var1.readInt();
      this.affectedBlockPositions = Lists.newArrayListWithCapacity(var4);
      int var5 = MathHelper.floor(this.posX);
      int var6 = MathHelper.floor(this.posY);
      int var7 = MathHelper.floor(this.posZ);

      for (int var8 = 0; var8 < var4; var8++) {
         int var9 = var1.readByte() + var5;
         int var10 = var1.readByte() + var6;
         int var11 = var1.readByte() + var7;
         this.affectedBlockPositions.add(new BlockPos(var9, var10, var11));
      }

      this.motionX = var1.readFloat();
      this.motionY = var1.readFloat();
      this.motionZ = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeFloat((float)this.posX);
      var1.writeFloat((float)this.posY);
      var1.writeFloat((float)this.posZ);
      var1.writeFloat(this.strength);
      var1.writeInt(this.affectedBlockPositions.size());
      int var4 = MathHelper.floor(this.posX);
      int var5 = MathHelper.floor(this.posY);
      int var6 = MathHelper.floor(this.posZ);

      for (BlockPos var8 : this.affectedBlockPositions) {
         int var9 = var8.getX() - var4;
         int var10 = var8.getY() - var5;
         int var11 = var8.getZ() - var6;
         var1.writeByte(var9);
         var1.writeByte(var10);
         var1.writeByte(var11);
      }

      var1.writeFloat(this.motionX);
      var1.writeFloat(this.motionY);
      var1.writeFloat(this.motionZ);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleExplosion(this);
   }

   public float getMotionX() {
      return this.motionX;
   }

   public float getMotionY() {
      return this.motionY;
   }

   public float getMotionZ() {
      return this.motionZ;
   }

   public double getX() {
      return this.posX;
   }

   public double getY() {
      return this.posY;
   }

   public double getZ() {
      return this.posZ;
   }

   public float getStrength() {
      return this.strength;
   }

   public List<BlockPos> getAffectedBlockPositions() {
      return this.affectedBlockPositions;
   }
}
