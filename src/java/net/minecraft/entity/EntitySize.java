package net.minecraft.entity;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

public class EntitySize {
   public final float width;
   public final float height;
   public final boolean fixed;

   public EntitySize(float var1, float var2, boolean var3) {
      this.width = var1;
      this.height = var2;
      this.fixed = var3;
   }

   public AxisAlignedBB method32097(Vector3d var1) {
      return this.method32098(var1.x, var1.y, var1.z);
   }

   public AxisAlignedBB method32098(double var1, double var3, double var5) {
      float var9 = this.width / 2.0F;
      float var10 = this.height;
      return new AxisAlignedBB(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)var10, var5 + (double)var9);
   }

   public EntitySize method32099(float var1) {
      return this.method32100(var1, var1);
   }

   public EntitySize method32100(float var1, float var2) {
      return !this.fixed && (var1 != 1.0F || var2 != 1.0F) ? method32101(this.width * var1, this.height * var2) : this;
   }

   public static EntitySize method32101(float var0, float var1) {
      return new EntitySize(var0, var1, false);
   }

   public static EntitySize method32102(float var0, float var1) {
      return new EntitySize(var0, var1, true);
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.width + ", h=" + this.height + ", fixed=" + this.fixed;
   }
}
