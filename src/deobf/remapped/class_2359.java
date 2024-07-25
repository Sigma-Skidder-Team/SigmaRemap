package remapped;

public class class_2359 {
   private static String[] field_11842;
   private final class_2637[] field_11838 = new class_2637[6];
   private double field_11839;
   private double field_11843;
   private double field_11840;
   public boolean field_11841 = false;

   public class_2359(class_8107 var1, class_8107 var2) {
      this.method_10826(var1, var2);
   }

   public void method_10820(double var1, double var3, double var5) {
      this.field_11839 = var1;
      this.field_11843 = var3;
      this.field_11840 = var5;
   }

   private void method_10826(class_8107 var1, class_8107 var2) {
      class_8107 var5 = var2.method_36824();
      var5.method_36832(var1);
      var5.method_36807();
      this.method_10819(var5, -1, 0, 0, 0);
      this.method_10819(var5, 1, 0, 0, 1);
      this.method_10819(var5, 0, -1, 0, 2);
      this.method_10819(var5, 0, 1, 0, 3);
      this.method_10819(var5, 0, 0, -1, 4);
      this.method_10819(var5, 0, 0, 1, 5);
   }

   private void method_10819(class_8107 var1, int var2, int var3, int var4, int var5) {
      class_2637 var8 = new class_2637((float)var2, (float)var3, (float)var4, 1.0F);
      var8.method_11929(var1);
      var8.method_11920();
      this.field_11838[var5] = var8;
   }

   public boolean method_10824(Box var1) {
      return this.method_10822(var1.field_19941, var1.field_19937, var1.field_19938, var1.field_19940, var1.field_19939, var1.field_19942);
   }

   private boolean method_10822(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (!this.field_11841) {
         float var15 = (float)(var1 - this.field_11839);
         float var16 = (float)(var3 - this.field_11843);
         float var17 = (float)(var5 - this.field_11840);
         float var18 = (float)(var7 - this.field_11839);
         float var19 = (float)(var9 - this.field_11843);
         float var20 = (float)(var11 - this.field_11840);
         return this.method_10821(var15, var16, var17, var18, var19, var20);
      } else {
         return true;
      }
   }

   private boolean method_10821(float var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var9 = 0; var9 < 6; var9++) {
         class_2637 var10 = this.field_11838[var9];
         float var11 = var10.method_11923();
         float var12 = var10.method_11922();
         float var13 = var10.method_11927();
         float var14 = var10.method_11924();
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

   public boolean method_10825(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (this.field_11841) {
         return true;
      } else {
         float var15 = (float)var1;
         float var16 = (float)var3;
         float var17 = (float)var5;
         float var18 = (float)var7;
         float var19 = (float)var9;
         float var20 = (float)var11;

         for (int var21 = 0; var21 < 6; var21++) {
            class_2637 var22 = this.field_11838[var21];
            float var23 = var22.method_11923();
            float var24 = var22.method_11922();
            float var25 = var22.method_11927();
            float var26 = var22.method_11924();
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

   public class_2637[] method_10818() {
      return this.field_11838;
   }
}
