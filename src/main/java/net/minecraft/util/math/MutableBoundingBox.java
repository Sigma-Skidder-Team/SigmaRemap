package net.minecraft.util.math;

import com.google.common.base.MoreObjects;
import mapped.Class8403;
import net.minecraft.nbt.IntArrayNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3i;

public class MutableBoundingBox {
   public int minX;
   public int minY;
   public int minZ;
   public int maxX;
   public int maxY;
   public int maxZ;

   public MutableBoundingBox() {
   }

   public MutableBoundingBox(int[] var1) {
      if (var1.length == 6) {
         this.minX = var1[0];
         this.minY = var1[1];
         this.minZ = var1[2];
         this.maxX = var1[3];
         this.maxY = var1[4];
         this.maxZ = var1[5];
      }
   }

   public static MutableBoundingBox method38386() {
      return new MutableBoundingBox(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
   }

   public static MutableBoundingBox method38387() {
      return new MutableBoundingBox(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public static MutableBoundingBox method38388(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Direction var9) {
      switch (Class8403.field36060[var9.ordinal()]) {
         case 1:
            return new MutableBoundingBox(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case 2:
            return new MutableBoundingBox(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case 3:
            return new MutableBoundingBox(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case 4:
            return new MutableBoundingBox(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         default:
            return new MutableBoundingBox(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
      }
   }

   public static MutableBoundingBox method38389(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new MutableBoundingBox(Math.min(var0, var3), Math.min(var1, var4), Math.min(var2, var5), Math.max(var0, var3), Math.max(var1, var4), Math.max(var2, var5));
   }

   public MutableBoundingBox(MutableBoundingBox var1) {
      this.minX = var1.minX;
      this.minY = var1.minY;
      this.minZ = var1.minZ;
      this.maxX = var1.maxX;
      this.maxY = var1.maxY;
      this.maxZ = var1.maxZ;
   }

   public MutableBoundingBox(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.minX = var1;
      this.minY = var2;
      this.minZ = var3;
      this.maxX = var4;
      this.maxY = var5;
      this.maxZ = var6;
   }

   public MutableBoundingBox(Vector3i var1, Vector3i var2) {
      this.minX = Math.min(var1.getX(), var2.getX());
      this.minY = Math.min(var1.getY(), var2.getY());
      this.minZ = Math.min(var1.getZ(), var2.getZ());
      this.maxX = Math.max(var1.getX(), var2.getX());
      this.maxY = Math.max(var1.getY(), var2.getY());
      this.maxZ = Math.max(var1.getZ(), var2.getZ());
   }

   public MutableBoundingBox(int var1, int var2, int var3, int var4) {
      this.minX = var1;
      this.minZ = var2;
      this.maxX = var3;
      this.maxZ = var4;
      this.minY = 1;
      this.maxY = 512;
   }

   public boolean method38390(MutableBoundingBox var1) {
      return this.maxX >= var1.minX
         && this.minX <= var1.maxX
         && this.maxZ >= var1.minZ
         && this.minZ <= var1.maxZ
         && this.maxY >= var1.minY
         && this.minY <= var1.maxY;
   }

   public boolean intersectsWith(int var1, int var2, int var3, int var4) {
      return this.maxX >= var1 && this.minX <= var3 && this.maxZ >= var2 && this.minZ <= var4;
   }

   public void method38392(MutableBoundingBox var1) {
      this.minX = Math.min(this.minX, var1.minX);
      this.minY = Math.min(this.minY, var1.minY);
      this.minZ = Math.min(this.minZ, var1.minZ);
      this.maxX = Math.max(this.maxX, var1.maxX);
      this.maxY = Math.max(this.maxY, var1.maxY);
      this.maxZ = Math.max(this.maxZ, var1.maxZ);
   }

   public void method38393(int var1, int var2, int var3) {
      this.minX += var1;
      this.minY += var2;
      this.minZ += var3;
      this.maxX += var1;
      this.maxY += var2;
      this.maxZ += var3;
   }

   public MutableBoundingBox method38394(int var1, int var2, int var3) {
      return new MutableBoundingBox(
         this.minX + var1, this.minY + var2, this.minZ + var3, this.maxX + var1, this.maxY + var2, this.maxZ + var3
      );
   }

   public void method38395(Vector3i var1) {
      this.method38393(var1.getX(), var1.getY(), var1.getZ());
   }

   public boolean method38396(Vector3i var1) {
      return var1.getX() >= this.minX
         && var1.getX() <= this.maxX
         && var1.getZ() >= this.minZ
         && var1.getZ() <= this.maxZ
         && var1.getY() >= this.minY
         && var1.getY() <= this.maxY;
   }

   public Vector3i method38397() {
      return new Vector3i(this.maxX - this.minX, this.maxY - this.minY, this.maxZ - this.minZ);
   }

   public int method38398() {
      return this.maxX - this.minX + 1;
   }

   public int method38399() {
      return this.maxY - this.minY + 1;
   }

   public int method38400() {
      return this.maxZ - this.minZ + 1;
   }

   public Vector3i method38401() {
      return new BlockPos(
         this.minX + (this.maxX - this.minX + 1) / 2,
         this.minY + (this.maxY - this.minY + 1) / 2,
         this.minZ + (this.maxZ - this.minZ + 1) / 2
      );
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("x0", this.minX)
         .add("y0", this.minY)
         .add("z0", this.minZ)
         .add("x1", this.maxX)
         .add("y1", this.maxY)
         .add("z1", this.maxZ)
         .toString();
   }

   public IntArrayNBT method38402() {
      return new IntArrayNBT(new int[]{this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ});
   }
}
