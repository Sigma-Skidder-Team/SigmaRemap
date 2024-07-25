package remapped;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import java.util.stream.IntStream;
import javax.annotation.concurrent.Immutable;

@Immutable
public class Vector3i implements Comparable<Vector3i> {
   public static final Codec<Vector3i> field_13233 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> Util.method_44654(var0, 3).map(var0x -> new Vector3i(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.getX(), var0.method_12165(), var0.method_12185())
      );
   public static final Vector3i field_13228 = new Vector3i(0, 0, 0);
   public int field_13231;
   public int field_13230;
   public int field_13229;

   public Vector3i(int var1, int var2, int var3) {
      this.field_13231 = var1;
      this.field_13230 = var2;
      this.field_13229 = var3;
   }

   public Vector3i(double var1, double var3, double var5) {
      this(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Vector3i) {
            Vector3i var4 = (Vector3i)var1;
            if (this.getX() == var4.getX()) {
               return this.method_12165() == var4.method_12165() ? this.method_12185() == var4.method_12185() : false;
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
      return (this.method_12165() + this.method_12185() * 31) * 31 + this.getX();
   }

   public int compareTo(Vector3i var1) {
      if (this.method_12165() != var1.method_12165()) {
         return this.method_12165() - var1.method_12165();
      } else {
         return this.method_12185() != var1.method_12185() ? this.method_12185() - var1.method_12185() : this.getX() - var1.getX();
      }
   }

   public int getX() {
      return this.field_13231;
   }

   public int method_12165() {
      return this.field_13230;
   }

   public int method_12185() {
      return this.field_13229;
   }

   public void method_12167(int var1) {
      this.field_13231 = var1;
   }

   public void method_12184(int var1) {
      this.field_13230 = var1;
   }

   public void method_12172(int var1) {
      this.field_13229 = var1;
   }

   public Vector3i method_12168() {
      return this.method_12169(1);
   }

   public Vector3i method_12169(int var1) {
      return this.method_12177(Direction.field_817, var1);
   }

   public Vector3i method_12181() {
      return this.method_12182(1);
   }

   public Vector3i method_12182(int var1) {
      return this.method_12177(Direction.field_802, var1);
   }

   public Vector3i method_12177(Direction var1, int var2) {
      return var2 != 0
         ? new Vector3i(
            this.getX() + var1.method_1041() * var2, this.method_12165() + var1.method_1054() * var2, this.method_12185() + var1.method_1034() * var2
         )
         : this;
   }

   public Vector3i method_12166(Vector3i var1) {
      return new Vector3i(
         this.method_12165() * var1.method_12185() - this.method_12185() * var1.method_12165(),
         this.method_12185() * var1.getX() - this.getX() * var1.method_12185(),
         this.getX() * var1.method_12165() - this.method_12165() * var1.getX()
      );
   }

   public boolean method_12171(Vector3i var1, double var2) {
      return this.method_12178((double)var1.getX(), (double)var1.method_12165(), (double)var1.method_12185(), false) < var2 * var2;
   }

   public boolean method_12170(class_66 var1, double var2) {
      return this.method_12178(var1.method_61(), var1.method_60(), var1.method_62(), true) < var2 * var2;
   }

   public double method_12180(Vector3i var1) {
      return this.method_12178((double)var1.getX(), (double)var1.method_12165(), (double)var1.method_12185(), true);
   }

   public double method_12179(class_66 var1, boolean var2) {
      return this.method_12178(var1.method_61(), var1.method_60(), var1.method_62(), var2);
   }

   public double method_12178(double var1, double var3, double var5, boolean var7) {
      double var10 = !var7 ? 0.0 : 0.5;
      double var12 = (double)this.getX() + var10 - var1;
      double var14 = (double)this.method_12165() + var10 - var3;
      double var16 = (double)this.method_12185() + var10 - var5;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }

   public int method_12176(Vector3i var1) {
      float var4 = (float)Math.abs(var1.getX() - this.getX());
      float var5 = (float)Math.abs(var1.method_12165() - this.method_12165());
      float var6 = (float)Math.abs(var1.method_12185() - this.method_12185());
      return (int)(var4 + var5 + var6);
   }

   public int method_12174(class_9249 var1) {
      return var1.method_42631(this.field_13231, this.field_13230, this.field_13229);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.getX()).add("y", this.method_12165()).add("z", this.method_12185()).toString();
   }

   public String method_12175() {
      return "" + this.getX() + ", " + this.method_12165() + ", " + this.method_12185();
   }
}
