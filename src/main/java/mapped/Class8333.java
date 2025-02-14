package mapped;



public class Class8333 implements Class8334 {
   private static String[] field35836;
   private static final int field35837 = 7;

   public void method29219(Class9189 var1, Class6512 var2, int[][] var3) throws Class2460 {
      int var6 = var2.method19720().method19874() ? 11 : 9;
      boolean var7 = var1.method34399();
      int var8 = var1.method34397(8);
      int var9 = var1.method34397(var6);
      Class6538 var10 = var2.method19720();
      int var11 = var10.method19871();
      int var12 = var10.method19866();
      int[][] var13 = (int[][])null;
      int var14 = var2.method19726();
      int var15 = 0;
      int var16 = var14 - 90 - 256;
      boolean var17 = false;
      boolean var18 = false;

      for (int var19 = 0; var19 < var11; var19++) {
         for (int var20 = 0; var20 < var12; var20++) {
            switch (var13[var19][var20]) {
               case 0:
                  var3[var19][var20] = 0;
                  break;
               case 13:
                  if (var18) {
                     var16 += this.method29221(var1);
                     var3[var19][var20] = var16;
                  } else {
                     var18 = true;
                     var16 = this.method29221(var1);
                  }
                  break;
               case 14:
               case 15:
                  if (!var17) {
                     var17 = true;
                  }

                  var15 += this.method29221(var1);
                  var3[var19][var20] = var15;
                  break;
               default:
                  var14 += this.method29221(var1);
                  var3[var19][var20] = var14;
            }
         }
      }

      int var22 = 0;
      if (var17) {
         var22 = this.method29221(var1);
      }

      var18 = false;
      if (var1.method34399()) {
         this.method29220(var1, var2, var3);
      }
   }

   private void method29220(Class9189 var1, Class6512 var2, int[][] var3) throws Class2460 {
      Class6538 var6 = var2.method19720();
      int var7 = var6.method19871();
      int var8 = var6.method19866();
      int[][] var9 = (int[][])null;
      int var10 = var1.method34397(8);
      boolean var11 = false;

      for (int var12 = 0; var12 < var7; var12++) {
         for (int var13 = 0; var13 < var8; var13++) {
            if (var9[var12][var13] == 13 && !var11) {
               var11 = true;
            } else if (Math.abs(var9[var12][var13]) == 7) {
               int var14 = this.method29222(var1);
               if (var9[var12][var13] != -7) {
                  var3[var12][var13] = var3[var12][var13] + var14;
               } else {
                  var3[var12][var13] = var3[var12][var13] - var14;
               }
            }
         }
      }
   }

   private int method29221(Class9189 var1) throws Class2460 {
      int var4 = 0;
      int var5 = field35838[var4][1];
      int var6 = var1.method34397(var5);

      while (var6 != field35838[var4][2] && var5 < 10) {
         var4++;
         int var7 = field35838[var4][1] - var5;
         var5 += var7;
         var6 <<= var7;
         var6 |= var1.method34397(var7);
      }

      return field35838[var4][0];
   }

   private int method29222(Class9189 var1) throws Class2460 {
      int var4 = 0;
      int var5 = field35839[var4][1];
      int var6 = var1.method34397(var5);

      while (var6 != field35839[var4][2] && var5 < 21) {
         var4++;
         int var7 = field35839[var4][1] - var5;
         var5 += var7;
         var6 <<= var7;
         var6 |= var1.method34397(var7);
      }

      return field35839[var4][0];
   }
}
