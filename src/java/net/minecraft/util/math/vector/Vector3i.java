package net.minecraft.util.math.vector;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import mapped.IPosition;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.Util;

import javax.annotation.concurrent.Immutable;
import java.util.stream.IntStream;

@Immutable
public class Vector3i implements Comparable<Vector3i> {
   public static final Codec<Vector3i> field13025 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> Util.validateIntStreamSize(var0, 3).map(var0x -> new Vector3i(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.getX(), var0.getY(), var0.getZ())
      );
   public static final Vector3i NULL_VECTOR = new Vector3i(0, 0, 0);
   public int x;
   public int y;
   public int z;

   public Vector3i(int x, int y, int z) {
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public Vector3i(double x, double y, double z) {
      this(MathHelper.floor(x), MathHelper.floor(y), MathHelper.floor(z));
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Vector3i) {
            Vector3i var4 = (Vector3i)var1;
            if (this.getX() == var4.getX()) {
               return this.getY() == var4.getY() ? this.getZ() == var4.getZ() : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return (this.getY() + this.getZ() * 31) * 31 + this.getX();
   }

   public int compareTo(Vector3i var1) {
      if (this.getY() != var1.getY()) {
         return this.getY() - var1.getY();
      } else {
         return this.getZ() != var1.getZ() ? this.getZ() - var1.getZ() : this.getX() - var1.getX();
      }
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }

   public int getZ() {
      return this.z;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setZ(int z) {
      this.z = z;
   }

   public Vector3i up() {
      return this.up(1);
   }

   public Vector3i up(int n) {
      return this.offset(Direction.UP, n);
   }

   public Vector3i down() {
      return this.down(1);
   }

   public Vector3i down(int n) {
      return this.offset(Direction.DOWN, n);
   }

   public Vector3i offset(Direction facing, int n) {
      return n != 0
         ? new Vector3i(this.getX() + facing.getXOffset() * n, this.getY() + facing.getYOffset() * n, this.getZ() + facing.getZOffset() * n)
         : this;
   }

   public Vector3i crossProduct(Vector3i vec) {
      return new Vector3i(
         this.getY() * vec.getZ() - this.getZ() * vec.getY(),
         this.getZ() * vec.getX() - this.getX() * vec.getZ(),
         this.getX() * vec.getY() - this.getY() * vec.getX()
      );
   }

   public boolean withinDistance(Vector3i vector, double distance) {
      return this.distanceSq((double)vector.getX(), (double)vector.getY(), (double)vector.getZ(), false) < distance * distance;
   }

   public boolean withinDistance(IPosition position, double distance) {
      return this.distanceSq(position.getX(), position.getY(), position.getZ(), true) < distance * distance;
   }

   public double distanceSq(Vector3i to) {
      return this.distanceSq((double)to.getX(), (double)to.getY(), (double)to.getZ(), true);
   }

   public double method8319(IPosition position, boolean useCenter) {
      return this.distanceSq(position.getX(), position.getY(), position.getZ(), useCenter);
   }

   public double distanceSq(double var1, double var3, double var5, boolean var7) {
      double var10 = !var7 ? 0.0 : 0.5;
      double var12 = (double)this.getX() + var10 - var1;
      double var14 = (double)this.getY() + var10 - var3;
      double var16 = (double)this.getZ() + var10 - var5;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public int manhattanDistance(Vector3i vector) {
      float var4 = (float)Math.abs(vector.getX() - this.getX());
      float var5 = (float)Math.abs(vector.getY() - this.getY());
      float var6 = (float)Math.abs(vector.getZ() - this.getZ());
      return (int)(var4 + var5 + var6);
   }

   public int func_243648_a(Direction.Axis p_243648_1_) {
      return p_243648_1_.method327(this.x, this.y, this.z);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.getX()).add("y", this.getY()).add("z", this.getZ()).toString();
   }

   public String getCoordinatesAsString() {
      return this.getX() + ", " + this.getY() + ", " + this.getZ();
   }
}
