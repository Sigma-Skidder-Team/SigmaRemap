package mapped;

public class Class6882 implements Class6880 {
   private static String[] field29825;
   private Class2532 field29826;
   private Class2532 field29827;
   private Class7462 field29828;
   private Class2530 field29829;
   private Class2520 field29830;

   public Class6882(Class2520 var1, Class8412 var2, Class7462 var3) {
      this.field29828 = var3;
      float var6 = var3.method24146();
      float var7 = var3.method24148();
      float var8 = var3.method24147();
      float var9 = var3.method24149();
      float var10 = var9 - var7;
      float var11 = var8 - var6;
      float[] var12 = new float[]{var6, var7 + var10 / 2.0F};
      var3.method24135().method29529(var12, 0, var12, 0, 1);
      var2.method29529(var12, 0, var12, 0, 1);
      float[] var13 = new float[]{var6 + var11, var7 + var10 / 2.0F};
      var3.method24135().method29529(var13, 0, var13, 0, 1);
      var2.method29529(var13, 0, var13, 0, 1);
      this.field29826 = new Class2532(var12[0], var12[1]);
      this.field29827 = new Class2532(var13[0], var13[1]);
      this.field29829 = new Class2530(this.field29826, this.field29827);
   }

   @Override
   public Class2532 method20956(float var1, float var2) {
      Class2532 var5 = new Class2532();
      this.field29829.method10674(new Class2532(var1, var2), var5);
      float var6 = var5.method10701(this.field29826);
      var6 /= this.field29829.method10661();
      return new Class2532(var6, 0.0F);
   }
}
