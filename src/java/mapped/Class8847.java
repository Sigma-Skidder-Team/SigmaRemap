package mapped;

public class Class8847 {
   public final float field39968;
   public final float field39969;
   public final boolean field39970;

   public Class8847(float var1, float var2, boolean var3) {
      this.field39968 = var1;
      this.field39969 = var2;
      this.field39970 = var3;
   }

   public Class6488 method32097(Vector3d var1) {
      return this.method32098(var1.field18048, var1.field18049, var1.field18050);
   }

   public Class6488 method32098(double var1, double var3, double var5) {
      float var9 = this.field39968 / 2.0F;
      float var10 = this.field39969;
      return new Class6488(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)var10, var5 + (double)var9);
   }

   public Class8847 method32099(float var1) {
      return this.method32100(var1, var1);
   }

   public Class8847 method32100(float var1, float var2) {
      return !this.field39970 && (var1 != 1.0F || var2 != 1.0F) ? method32101(this.field39968 * var1, this.field39969 * var2) : this;
   }

   public static Class8847 method32101(float var0, float var1) {
      return new Class8847(var0, var1, false);
   }

   public static Class8847 method32102(float var0, float var1) {
      return new Class8847(var0, var1, true);
   }

   @Override
   public String toString() {
      return "EntityDimensions w=" + this.field39968 + ", h=" + this.field39969 + ", fixed=" + this.field39970;
   }
}
