package mapped;

public class Class7647 {
   private static String[] field32823;
   private final Class7755[] field32824 = new Class7755[6];
   private double field32825;
   private double field32826;
   private double field32827;
   public boolean field32828 = false;

   public Class7647(Class9367 var1, Class9367 var2) {
      this.method25120(var1, var2);
   }

   public void method25119(double var1, double var3, double var5) {
      this.field32825 = var1;
      this.field32826 = var3;
      this.field32827 = var5;
   }

   private void method25120(Class9367 var1, Class9367 var2) {
      Class9367 var5 = var2.method35514();
      var5.method35508(var1);
      var5.method35506();
      this.method25121(var5, -1, 0, 0, 0);
      this.method25121(var5, 1, 0, 0, 1);
      this.method25121(var5, 0, -1, 0, 2);
      this.method25121(var5, 0, 1, 0, 3);
      this.method25121(var5, 0, 0, -1, 4);
      this.method25121(var5, 0, 0, 1, 5);
   }

   private void method25121(Class9367 var1, int var2, int var3, int var4, int var5) {
      Class7755 var8 = new Class7755((float)var2, (float)var3, (float)var4, 1.0F);
      var8.method25709(var1);
      var8.method25708();
      this.field32824[var5] = var8;
   }

   public boolean method25122(AxisAlignedBB var1) {
      return this.method25123(var1.field28449, var1.field28450, var1.field28451, var1.field28452, var1.field28453, var1.field28454);
   }

   private boolean method25123(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (!this.field32828) {
         float var15 = (float)(var1 - this.field32825);
         float var16 = (float)(var3 - this.field32826);
         float var17 = (float)(var5 - this.field32827);
         float var18 = (float)(var7 - this.field32825);
         float var19 = (float)(var9 - this.field32826);
         float var20 = (float)(var11 - this.field32827);
         return this.method25124(var15, var16, var17, var18, var19, var20);
      } else {
         return true;
      }
   }

   private boolean method25124(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < 6; var9++) {
         Class7755 var10 = this.field32824[var9];
         float var11 = var10.method25701();
         float var12 = var10.method25702();
         float var13 = var10.method25703();
         float var14 = var10.method25704();
         if (var11 * var1 + var12 * var2 + var13 * var3 + var14 <= 0.0F
            && var11 * var4 + var12 * var2 + var13 * var3 + var14 <= 0.0F
            && var11 * var1 + var12 * var5 + var13 * var3 + var14 <= 0.0F
            && var11 * var4 + var12 * var5 + var13 * var3 + var14 <= 0.0F
            && var11 * var1 + var12 * var2 + var13 * var6 + var14 <= 0.0F
            && var11 * var4 + var12 * var2 + var13 * var6 + var14 <= 0.0F
            && var11 * var1 + var12 * var5 + var13 * var6 + var14 <= 0.0F
            && var11 * var4 + var12 * var5 + var13 * var6 + var14 <= 0.0F) {
            return false;
         }
      }

      return true;
   }

   public boolean method25125(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.field32828) {
         return true;
      } else {
         float var15 = (float)var1;
         float var16 = (float)var3;
         float var17 = (float)var5;
         float var18 = (float)var7;
         float var19 = (float)var9;
         float var20 = (float)var11;

         for (int var21 = 0; var21 < 6; var21++) {
            Class7755 var22 = this.field32824[var21];
            float var23 = var22.method25701();
            float var24 = var22.method25702();
            float var25 = var22.method25703();
            float var26 = var22.method25704();
            if (var21 >= 4) {
               if (var23 * var15 + var24 * var16 + var25 * var17 + var26 <= 0.0F
                  && var23 * var18 + var24 * var16 + var25 * var17 + var26 <= 0.0F
                  && var23 * var15 + var24 * var19 + var25 * var17 + var26 <= 0.0F
                  && var23 * var18 + var24 * var19 + var25 * var17 + var26 <= 0.0F
                  && var23 * var15 + var24 * var16 + var25 * var20 + var26 <= 0.0F
                  && var23 * var18 + var24 * var16 + var25 * var20 + var26 <= 0.0F
                  && var23 * var15 + var24 * var19 + var25 * var20 + var26 <= 0.0F
                  && var23 * var18 + var24 * var19 + var25 * var20 + var26 <= 0.0F) {
                  return false;
               }
            } else if (var23 * var15 + var24 * var16 + var25 * var17 + var26 <= 0.0F
               || var23 * var18 + var24 * var16 + var25 * var17 + var26 <= 0.0F
               || var23 * var15 + var24 * var19 + var25 * var17 + var26 <= 0.0F
               || var23 * var18 + var24 * var19 + var25 * var17 + var26 <= 0.0F
               || var23 * var15 + var24 * var16 + var25 * var20 + var26 <= 0.0F
               || var23 * var18 + var24 * var16 + var25 * var20 + var26 <= 0.0F
               || var23 * var15 + var24 * var19 + var25 * var20 + var26 <= 0.0F
               || var23 * var18 + var24 * var19 + var25 * var20 + var26 <= 0.0F) {
               return false;
            }
         }

         return true;
      }
   }

   public Class7755[] method25126() {
      return this.field32824;
   }
}
