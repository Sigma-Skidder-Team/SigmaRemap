package mapped;

public final class Class6016 implements Class6014 {
   private static String[] field26203;
   public final float field26204;
   public final float field26205;
   public final Image field26206;

   public Class6016(float var1, float var2, Image var3) {
      this.field26204 = var1;
      this.field26205 = var2;
      this.field26206 = var3;
   }

   @Override
   public float[] method18646(Class2520 var1, float var2, float var3) {
      var2 -= var1.method10590();
      var3 -= var1.method10591();
      var2 /= var1.method10588() - var1.method10590();
      var3 /= var1.method10589() - var1.method10591();
      float var6 = var2 * this.field26204;
      float var7 = var3 * this.field26205;
      var6 = this.field26206.method23530() + this.field26206.method23532() * var6;
      var7 = this.field26206.method23531() + this.field26206.method23533() * var7;
      Class9247.method34787().method18398(var6, var7);
      return null;
   }
}
