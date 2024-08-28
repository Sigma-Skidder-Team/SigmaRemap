package mapped;

public class Class6881 implements Class6880 {
   private static String[] field29820;
   private Class2532 field29821;
   private float field29822;
   private Class7462 field29823;
   private Class2520 field29824;

   public Class6881(Class2520 var1, Class8412 var2, Class7462 var3) {
      this.field29823 = var3;
      this.field29822 = var3.method24145();
      float var6 = var3.method24146();
      float var7 = var3.method24148();
      float[] var8 = new float[]{var6, var7};
      var3.method24135().method29529(var8, 0, var8, 0, 1);
      var2.method29529(var8, 0, var8, 0, 1);
      float[] var9 = new float[]{var6, var7 - this.field29822};
      var3.method24135().method29529(var9, 0, var9, 0, 1);
      var2.method29529(var9, 0, var9, 0, 1);
      this.field29821 = new Class2532(var8[0], var8[1]);
      Class2532 var10 = new Class2532(var9[0], var9[1]);
      this.field29822 = var10.method10701(this.field29821);
   }

   @Override
   public Class2532 method20956(float var1, float var2) {
      float var5 = this.field29821.method10701(new Class2532(var1, var2));
      var5 /= this.field29822;
      if (var5 > 0.99F) {
         var5 = 0.99F;
      }

      return new Class2532(var5, 0.0F);
   }
}
