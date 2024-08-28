package mapped;

public final class Class6018 implements Class6014 {
   private static String[] field26208;
   public final Class8518 field26209;
   public final float[] field26210;
   public final float field26211;
   public final float field26212;
   public final Image field26213;

   public Class6018(Class8518 var1, float[] var2, float var3, float var4, Image var5) {
      this.field26209 = var1;
      this.field26210 = var2;
      this.field26211 = var3;
      this.field26212 = var4;
      this.field26213 = var5;
   }

   @Override
   public float[] method18646(Class2520 var1, float var2, float var3) {
      this.field26209.method30178(var1, var2 - this.field26210[0], var3 - this.field26210[1]).method10392();
      Class2532 var6 = this.field26209.method30180(var1, var2, var3);
      var2 += var6.field16737;
      var3 += var6.field16738;
      float var7 = var2 * this.field26211;
      float var8 = var3 * this.field26212;
      var7 = this.field26213.method23530() + this.field26213.method23532() * var7;
      var8 = this.field26213.method23531() + this.field26213.method23533() * var8;
      Class9247.method34787().method18398(var7, var8);
      return new float[]{var6.field16737 + var2, var6.field16738 + var3};
   }
}
