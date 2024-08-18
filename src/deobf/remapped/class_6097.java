package remapped;

public class class_6097 {
   public final float field_31199;
   public final float field_31200;
   public final boolean field_31198;

   public class_6097(float var1, float var2, boolean var3) {
      this.field_31199 = var1;
      this.field_31200 = var2;
      this.field_31198 = var3;
   }

   public Box method_27939(Vector3d var1) {
      return this.method_27940(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public Box method_27940(double var1, double var3, double var5) {
      float var9 = this.field_31199 / 2.0F;
      float var10 = this.field_31200;
      return new Box(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)var10, var5 + (double)var9);
   }

   public class_6097 method_27942(float var1) {
      return this.method_27943(var1, var1);
   }

   public class_6097 method_27943(float var1, float var2) {
      return !this.field_31198 && (var1 != 1.0F || var2 != 1.0F) ? method_27938(this.field_31199 * var1, this.field_31200 * var2) : this;
   }

   public static class_6097 method_27938(float var0, float var1) {
      return new class_6097(var0, var1, false);
   }

   public static class_6097 method_27941(float var0, float var1) {
      return new class_6097(var0, var1, true);
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.field_31199 + ", h=" + this.field_31200 + ", fixed=" + this.field_31198;
   }
}
