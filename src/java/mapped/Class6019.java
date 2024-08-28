package mapped;

public final class Class6019 implements Class6014 {
   private static String[] field26214;
   public final float field26215;
   public final float field26216;
   public final Image field26217;

   public Class6019(float var1, float var2, Image var3) {
      this.field26215 = var1;
      this.field26216 = var2;
      this.field26217 = var3;
   }

   @Override
   public float[] method18646(Class2520 var1, float var2, float var3) {
      float var6 = var2 * this.field26215;
      float var7 = var3 * this.field26216;
      var6 = this.field26217.method23530() + this.field26217.method23532() * var6;
      var7 = this.field26217.method23531() + this.field26217.method23533() * var7;
      Class9247.method34787().method18398(var6, var7);
      return null;
   }
}
