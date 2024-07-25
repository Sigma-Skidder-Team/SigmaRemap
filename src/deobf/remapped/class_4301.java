package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_4301 implements class_9810 {
   private static String[] field_20877;
   private static final int field_20876 = 7;

   public void method_19961(class_7390 var1, class_9143 var2, int[][] var3) throws AACException {
      int var6 = var2.method_42072().method_11676() ? 11 : 9;
      boolean var7 = var1.method_33660();
      int var8 = var1.method_33662(8);
      int var9 = var1.method_33662(var6);
      class_2568 var10 = var2.method_42072();
      int var11 = var10.method_11670();
      int var12 = var10.method_11671();
      int[][] var13 = (int[][])null;
      int var14 = var2.method_42063();
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
                     var16 += this.method_19964(var1);
                     var3[var19][var20] = var16;
                  } else {
                     var18 = true;
                     var16 = this.method_19964(var1);
                  }
                  break;
               case 14:
               case 15:
                  if (!var17) {
                     var17 = true;
                  }

                  var15 += this.method_19964(var1);
                  var3[var19][var20] = var15;
                  break;
               default:
                  var14 += this.method_19964(var1);
                  var3[var19][var20] = var14;
            }
         }
      }

      int var22 = 0;
      if (var17) {
         var22 = this.method_19964(var1);
      }

      var18 = false;
      if (var1.method_33660()) {
         this.method_19962(var1, var2, var3);
      }
   }

   private void method_19962(class_7390 var1, class_9143 var2, int[][] var3) throws AACException {
      class_2568 var6 = var2.method_42072();
      int var7 = var6.method_11670();
      int var8 = var6.method_11671();
      int[][] var9 = (int[][])null;
      int var10 = var1.method_33662(8);
      boolean var11 = false;

      for (int var12 = 0; var12 < var7; var12++) {
         for (int var13 = 0; var13 < var8; var13++) {
            if (var9[var12][var13] == 13 && !var11) {
               var11 = true;
            } else if (Math.abs(var9[var12][var13]) == 7) {
               int var14 = this.method_19965(var1);
               if (var9[var12][var13] != -7) {
                  var3[var12][var13] = var3[var12][var13] + var14;
               } else {
                  var3[var12][var13] = var3[var12][var13] - var14;
               }
            }
         }
      }
   }

   private int method_19964(class_7390 var1) throws AACException {
      int var4 = 0;
      int var5 = field_49730[var4][1];
      int var6 = var1.method_33662(var5);

      while (var6 != field_49730[var4][2] && var5 < 10) {
         var4++;
         int var7 = field_49730[var4][1] - var5;
         var5 += var7;
         var6 <<= var7;
         var6 |= var1.method_33662(var7);
      }

      return field_49730[var4][0];
   }

   private int method_19965(class_7390 var1) throws AACException {
      int var4 = 0;
      int var5 = field_49731[var4][1];
      int var6 = var1.method_33662(var5);

      while (var6 != field_49731[var4][2] && var5 < 21) {
         var4++;
         int var7 = field_49731[var4][1] - var5;
         var5 += var7;
         var6 <<= var7;
         var6 |= var1.method_33662(var7);
      }

      return field_49731[var4][0];
   }
}
