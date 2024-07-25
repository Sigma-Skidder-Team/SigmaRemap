package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class class_9362 extends class_1279 {
   private static String[] field_47818;
   private class_7914 field_47817;
   private class_7914 field_47820;
   private final List<class_1279> field_47819 = Lists.newArrayList();

   public class_9362(Random var1, int var2, int var3, Direction var4) {
      super(class_2746.field_13410, 0);
      this.method_32519(var4);
      Direction var7 = this.method_32518();
      if (var7.method_1029() != class_9249.field_47219) {
         this.field_36435 = new class_9616(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      } else {
         this.field_36435 = new class_9616(var2, 39, var3, var2 + 58 - 1, 61, var3 + 58 - 1);
      }

      List var8 = this.method_43297(var1);
      class_7914.method_35804(this.field_47817, true);
      this.field_47819.add(new class_311(var7, this.field_47817));
      this.field_47819.add(new class_366(var7, this.field_47820));
      ArrayList var9 = Lists.newArrayList();
      var9.add(new class_2346(null));
      var9.add(new class_7802(null));
      var9.add(new class_7645(null));
      var9.add(new class_7785(null));
      var9.add(new class_730(null));
      var9.add(new class_6063(null));
      var9.add(new class_756(null));

      for (class_7914 var11 : var8) {
         if (!class_7914.method_35813(var11) && !var11.method_35811()) {
            for (class_5225 var13 : var9) {
               if (var13.method_23912(var11)) {
                  this.field_47819.add(var13.method_23913(var7, var11, var1));
                  break;
               }
            }
         }
      }

      int var17 = this.field_36435.field_48995;
      int var18 = this.method_32530(9, 22);
      int var19 = this.method_32523(9, 22);

      for (class_1279 var14 : this.field_47819) {
         var14.method_32512().method_44391(var18, var17, var19);
      }

      class_9616 var21 = class_9616.method_44400(
         this.method_32530(1, 1), this.method_32507(1), this.method_32523(1, 1), this.method_32530(23, 21), this.method_32507(8), this.method_32523(23, 21)
      );
      class_9616 var22 = class_9616.method_44400(
         this.method_32530(34, 1), this.method_32507(1), this.method_32523(34, 1), this.method_32530(56, 21), this.method_32507(8), this.method_32523(56, 21)
      );
      class_9616 var15 = class_9616.method_44400(
         this.method_32530(22, 22),
         this.method_32507(13),
         this.method_32523(22, 22),
         this.method_32530(35, 35),
         this.method_32507(17),
         this.method_32523(35, 35)
      );
      int var16 = var1.nextInt();
      this.field_47819.add(new class_9794(var7, var21, var16++));
      this.field_47819.add(new class_9794(var7, var22, var16++));
      this.field_47819.add(new class_2352(var7, var15));
   }

   public class_9362(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13410, var2);
   }

   private List<class_7914> method_43297(Random var1) {
      class_7914[] var4 = new class_7914[75];

      for (int var5 = 0; var5 < 5; var5++) {
         for (int var6 = 0; var6 < 4; var6++) {
            boolean var7 = false;
            int var8 = method_5723(var5, 0, var6);
            var4[var8] = new class_7914(var8);
         }
      }

      for (int var17 = 0; var17 < 5; var17++) {
         for (int var21 = 0; var21 < 4; var21++) {
            boolean var25 = true;
            int var29 = method_5723(var17, 1, var21);
            var4[var29] = new class_7914(var29);
         }
      }

      for (int var18 = 1; var18 < 4; var18++) {
         for (int var22 = 0; var22 < 2; var22++) {
            byte var26 = 2;
            int var30 = method_5723(var18, 2, var22);
            var4[var30] = new class_7914(var30);
         }
      }

      this.field_47817 = var4[field_7038];

      for (int var19 = 0; var19 < 5; var19++) {
         for (int var23 = 0; var23 < 5; var23++) {
            for (int var27 = 0; var27 < 3; var27++) {
               int var31 = method_5723(var19, var27, var23);
               if (var4[var31] != null) {
                  for (Direction var12 : Direction.values()) {
                     int var13 = var19 + var12.method_1041();
                     int var14 = var27 + var12.method_1054();
                     int var15 = var23 + var12.method_1034();
                     if (var13 >= 0 && var13 < 5 && var15 >= 0 && var15 < 5 && var14 >= 0 && var14 < 3) {
                        int var16 = method_5723(var13, var14, var15);
                        if (var4[var16] != null) {
                           if (var15 != var23) {
                              var4[var31].method_35814(var12.method_1046(), var4[var16]);
                           } else {
                              var4[var31].method_35814(var12, var4[var16]);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      class_7914 var20 = new class_7914(1003);
      class_7914 var24 = new class_7914(1001);
      class_7914 var28 = new class_7914(1002);
      var4[field_7033].method_35814(Direction.field_817, var20);
      var4[field_7030].method_35814(Direction.field_800, var24);
      var4[field_7036].method_35814(Direction.field_800, var28);
      class_7914.method_35804(var20, true);
      class_7914.method_35804(var24, true);
      class_7914.method_35804(var28, true);
      class_7914.method_35805(this.field_47817, true);
      this.field_47820 = var4[method_5723(var1.nextInt(4), 0, 2)];
      class_7914.method_35804(this.field_47820, true);
      class_7914.method_35804(class_7914.method_35807(this.field_47820)[Direction.field_804.method_1050()], true);
      class_7914.method_35804(class_7914.method_35807(this.field_47820)[Direction.field_818.method_1050()], true);
      class_7914.method_35804(
         class_7914.method_35807(class_7914.method_35807(this.field_47820)[Direction.field_804.method_1050()])[Direction.field_818.method_1050()], true
      );
      class_7914.method_35804(class_7914.method_35807(this.field_47820)[Direction.field_817.method_1050()], true);
      class_7914.method_35804(
         class_7914.method_35807(class_7914.method_35807(this.field_47820)[Direction.field_804.method_1050()])[Direction.field_817.method_1050()], true
      );
      class_7914.method_35804(
         class_7914.method_35807(class_7914.method_35807(this.field_47820)[Direction.field_818.method_1050()])[Direction.field_817.method_1050()], true
      );
      class_7914.method_35804(
         class_7914.method_35807(
            class_7914.method_35807(class_7914.method_35807(this.field_47820)[Direction.field_804.method_1050()])[Direction.field_818.method_1050()]
         )[Direction.field_817.method_1050()],
         true
      );
      ArrayList var32 = Lists.newArrayList();

      for (class_7914 var39 : var4) {
         if (var39 != null) {
            var39.method_35812();
            var32.add(var39);
         }
      }

      var20.method_35812();
      Collections.shuffle(var32, var1);
      int var34 = 1;

      for (class_7914 var38 : var32) {
         int var40 = 0;
         int var41 = 0;

         while (var40 < 2 && var41 < 5) {
            var41++;
            int var42 = var1.nextInt(6);
            if (class_7914.method_35806(var38)[var42]) {
               int var43 = Direction.method_1033(var42).method_1046().method_1050();
               class_7914.method_35806(var38)[var42] = false;
               class_7914.method_35806(class_7914.method_35807(var38)[var42])[var43] = false;
               if (var38.method_35810(var34++) && class_7914.method_35807(var38)[var42].method_35810(var34++)) {
                  var40++;
               } else {
                  class_7914.method_35806(var38)[var42] = true;
                  class_7914.method_35806(class_7914.method_35807(var38)[var42])[var43] = true;
               }
            }
         }
      }

      var32.add(var20);
      var32.add(var24);
      var32.add(var28);
      return var32;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      int var10 = Math.max(var1.method_22552(), 64) - this.field_36435.field_48995;
      this.method_5718(var1, var5, 0, 0, 0, 58, var10, 58);
      this.method_43302(false, 0, var1, var4, var5);
      this.method_43302(true, 33, var1, var4, var5);
      this.method_43300(var1, var4, var5);
      this.method_43299(var1, var4, var5);
      this.method_43301(var1, var4, var5);
      this.method_43303(var1, var4, var5);
      this.method_43296(var1, var4, var5);
      this.method_43298(var1, var4, var5);

      for (int var11 = 0; var11 < 7; var11++) {
         int var12 = 0;

         while (var12 < 7) {
            if (var12 == 0 && var11 == 3) {
               var12 = 6;
            }

            int var13 = var11 * 9;
            int var14 = var12 * 9;

            for (int var15 = 0; var15 < 4; var15++) {
               for (int var16 = 0; var16 < 4; var16++) {
                  this.method_32529(var1, field_7039, var13 + var15, 0, var14 + var16, var5);
                  this.method_32499(var1, field_7039, var13 + var15, -1, var14 + var16, var5);
               }
            }

            if (var11 != 0 && var11 != 6) {
               var12 += 6;
            } else {
               var12++;
            }
         }
      }

      for (int var17 = 0; var17 < 5; var17++) {
         this.method_5718(var1, var5, -1 - var17, 0 + var17 * 2, -1 - var17, -1 - var17, 23, 58 + var17);
         this.method_5718(var1, var5, 58 + var17, 0 + var17 * 2, -1 - var17, 58 + var17, 23, 58 + var17);
         this.method_5718(var1, var5, 0 - var17, 0 + var17 * 2, -1 - var17, 57 + var17, 23, -1 - var17);
         this.method_5718(var1, var5, 0 - var17, 0 + var17 * 2, 58 + var17, 57 + var17, 23, 58 + var17);
      }

      for (class_1279 var19 : this.field_47819) {
         if (var19.method_32512().method_44402(var5)) {
            var19.method_32501(var1, var2, var3, var4, var5, var6, var7);
         }
      }

      return true;
   }

   private void method_43302(boolean var1, int var2, class_700 var3, Random var4, class_9616 var5) {
      byte var8 = 24;
      if (this.method_5721(var5, var2, 0, var2 + 23, 20)) {
         this.method_32500(var3, var5, var2 + 0, 0, 0, var2 + 24, 0, 20, field_7037, field_7037, false);
         this.method_5718(var3, var5, var2 + 0, 1, 0, var2 + 24, 10, 20);

         for (int var9 = 0; var9 < 4; var9++) {
            this.method_32500(var3, var5, var2 + var9, var9 + 1, var9, var2 + var9, var9 + 1, 20, field_7039, field_7039, false);
            this.method_32500(var3, var5, var2 + var9 + 7, var9 + 5, var9 + 7, var2 + var9 + 7, var9 + 5, 20, field_7039, field_7039, false);
            this.method_32500(var3, var5, var2 + 17 - var9, var9 + 5, var9 + 7, var2 + 17 - var9, var9 + 5, 20, field_7039, field_7039, false);
            this.method_32500(var3, var5, var2 + 24 - var9, var9 + 1, var9, var2 + 24 - var9, var9 + 1, 20, field_7039, field_7039, false);
            this.method_32500(var3, var5, var2 + var9 + 1, var9 + 1, var9, var2 + 23 - var9, var9 + 1, var9, field_7039, field_7039, false);
            this.method_32500(var3, var5, var2 + var9 + 8, var9 + 5, var9 + 7, var2 + 16 - var9, var9 + 5, var9 + 7, field_7039, field_7039, false);
         }

         this.method_32500(var3, var5, var2 + 4, 4, 4, var2 + 6, 4, 20, field_7037, field_7037, false);
         this.method_32500(var3, var5, var2 + 7, 4, 4, var2 + 17, 4, 6, field_7037, field_7037, false);
         this.method_32500(var3, var5, var2 + 18, 4, 4, var2 + 20, 4, 20, field_7037, field_7037, false);
         this.method_32500(var3, var5, var2 + 11, 8, 11, var2 + 13, 8, 20, field_7037, field_7037, false);
         this.method_32529(var3, field_7035, var2 + 12, 9, 12, var5);
         this.method_32529(var3, field_7035, var2 + 12, 9, 15, var5);
         this.method_32529(var3, field_7035, var2 + 12, 9, 18, var5);
         int var13 = var2 + (!var1 ? 5 : 19);
         int var10 = var2 + (!var1 ? 19 : 5);

         for (byte var11 = 20; var11 >= 5; var11 -= 3) {
            this.method_32529(var3, field_7035, var13, 5, var11, var5);
         }

         for (byte var14 = 19; var14 >= 7; var14 -= 3) {
            this.method_32529(var3, field_7035, var10, 5, var14, var5);
         }

         for (int var15 = 0; var15 < 4; var15++) {
            int var12 = !var1 ? var2 + 17 - var15 * 3 : var2 + 24 - (17 - var15 * 3);
            this.method_32529(var3, field_7035, var12, 5, 5, var5);
         }

         this.method_32529(var3, field_7035, var10, 5, 5, var5);
         this.method_32500(var3, var5, var2 + 11, 1, 12, var2 + 13, 7, 12, field_7037, field_7037, false);
         this.method_32500(var3, var5, var2 + 12, 1, 11, var2 + 12, 7, 13, field_7037, field_7037, false);
      }
   }

   private void method_43300(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 22, 5, 35, 17)) {
         this.method_5718(var1, var3, 25, 0, 0, 32, 8, 20);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method_32500(var1, var3, 24, 2, 5 + var6 * 4, 24, 4, 5 + var6 * 4, field_7039, field_7039, false);
            this.method_32500(var1, var3, 22, 4, 5 + var6 * 4, 23, 4, 5 + var6 * 4, field_7039, field_7039, false);
            this.method_32529(var1, field_7039, 25, 5, 5 + var6 * 4, var3);
            this.method_32529(var1, field_7039, 26, 6, 5 + var6 * 4, var3);
            this.method_32529(var1, field_7032, 26, 5, 5 + var6 * 4, var3);
            this.method_32500(var1, var3, 33, 2, 5 + var6 * 4, 33, 4, 5 + var6 * 4, field_7039, field_7039, false);
            this.method_32500(var1, var3, 34, 4, 5 + var6 * 4, 35, 4, 5 + var6 * 4, field_7039, field_7039, false);
            this.method_32529(var1, field_7039, 32, 5, 5 + var6 * 4, var3);
            this.method_32529(var1, field_7039, 31, 6, 5 + var6 * 4, var3);
            this.method_32529(var1, field_7032, 31, 5, 5 + var6 * 4, var3);
            this.method_32500(var1, var3, 27, 6, 5 + var6 * 4, 30, 6, 5 + var6 * 4, field_7037, field_7037, false);
         }
      }
   }

   private void method_43299(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 15, 20, 42, 21)) {
         this.method_32500(var1, var3, 15, 0, 21, 42, 0, 21, field_7037, field_7037, false);
         this.method_5718(var1, var3, 26, 1, 21, 31, 3, 21);
         this.method_32500(var1, var3, 21, 12, 21, 36, 12, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 17, 11, 21, 40, 11, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 16, 10, 21, 41, 10, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 15, 7, 21, 42, 9, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 16, 6, 21, 41, 6, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 17, 5, 21, 40, 5, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 21, 4, 21, 36, 4, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 22, 3, 21, 26, 3, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 31, 3, 21, 35, 3, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 23, 2, 21, 25, 2, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 32, 2, 21, 34, 2, 21, field_7037, field_7037, false);
         this.method_32500(var1, var3, 28, 4, 20, 29, 4, 21, field_7039, field_7039, false);
         this.method_32529(var1, field_7039, 27, 3, 21, var3);
         this.method_32529(var1, field_7039, 30, 3, 21, var3);
         this.method_32529(var1, field_7039, 26, 2, 21, var3);
         this.method_32529(var1, field_7039, 31, 2, 21, var3);
         this.method_32529(var1, field_7039, 25, 1, 21, var3);
         this.method_32529(var1, field_7039, 32, 1, 21, var3);

         for (int var6 = 0; var6 < 7; var6++) {
            this.method_32529(var1, field_7040, 28 - var6, 6 + var6, 21, var3);
            this.method_32529(var1, field_7040, 29 + var6, 6 + var6, 21, var3);
         }

         for (int var7 = 0; var7 < 4; var7++) {
            this.method_32529(var1, field_7040, 28 - var7, 9 + var7, 21, var3);
            this.method_32529(var1, field_7040, 29 + var7, 9 + var7, 21, var3);
         }

         this.method_32529(var1, field_7040, 28, 12, 21, var3);
         this.method_32529(var1, field_7040, 29, 12, 21, var3);

         for (int var8 = 0; var8 < 3; var8++) {
            this.method_32529(var1, field_7040, 22 - var8 * 2, 8, 21, var3);
            this.method_32529(var1, field_7040, 22 - var8 * 2, 9, 21, var3);
            this.method_32529(var1, field_7040, 35 + var8 * 2, 8, 21, var3);
            this.method_32529(var1, field_7040, 35 + var8 * 2, 9, 21, var3);
         }

         this.method_5718(var1, var3, 15, 13, 21, 42, 15, 21);
         this.method_5718(var1, var3, 15, 1, 21, 15, 6, 21);
         this.method_5718(var1, var3, 16, 1, 21, 16, 5, 21);
         this.method_5718(var1, var3, 17, 1, 21, 20, 4, 21);
         this.method_5718(var1, var3, 21, 1, 21, 21, 3, 21);
         this.method_5718(var1, var3, 22, 1, 21, 22, 2, 21);
         this.method_5718(var1, var3, 23, 1, 21, 24, 1, 21);
         this.method_5718(var1, var3, 42, 1, 21, 42, 6, 21);
         this.method_5718(var1, var3, 41, 1, 21, 41, 5, 21);
         this.method_5718(var1, var3, 37, 1, 21, 40, 4, 21);
         this.method_5718(var1, var3, 36, 1, 21, 36, 3, 21);
         this.method_5718(var1, var3, 33, 1, 21, 34, 1, 21);
         this.method_5718(var1, var3, 35, 1, 21, 35, 2, 21);
      }
   }

   private void method_43301(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 21, 21, 36, 36)) {
         this.method_32500(var1, var3, 21, 0, 22, 36, 0, 36, field_7037, field_7037, false);
         this.method_5718(var1, var3, 21, 1, 22, 36, 23, 36);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method_32500(var1, var3, 21 + var6, 13 + var6, 21 + var6, 36 - var6, 13 + var6, 21 + var6, field_7039, field_7039, false);
            this.method_32500(var1, var3, 21 + var6, 13 + var6, 36 - var6, 36 - var6, 13 + var6, 36 - var6, field_7039, field_7039, false);
            this.method_32500(var1, var3, 21 + var6, 13 + var6, 22 + var6, 21 + var6, 13 + var6, 35 - var6, field_7039, field_7039, false);
            this.method_32500(var1, var3, 36 - var6, 13 + var6, 22 + var6, 36 - var6, 13 + var6, 35 - var6, field_7039, field_7039, false);
         }

         this.method_32500(var1, var3, 25, 16, 25, 32, 16, 32, field_7037, field_7037, false);
         this.method_32500(var1, var3, 25, 17, 25, 25, 19, 25, field_7039, field_7039, false);
         this.method_32500(var1, var3, 32, 17, 25, 32, 19, 25, field_7039, field_7039, false);
         this.method_32500(var1, var3, 25, 17, 32, 25, 19, 32, field_7039, field_7039, false);
         this.method_32500(var1, var3, 32, 17, 32, 32, 19, 32, field_7039, field_7039, false);
         this.method_32529(var1, field_7039, 26, 20, 26, var3);
         this.method_32529(var1, field_7039, 27, 21, 27, var3);
         this.method_32529(var1, field_7032, 27, 20, 27, var3);
         this.method_32529(var1, field_7039, 26, 20, 31, var3);
         this.method_32529(var1, field_7039, 27, 21, 30, var3);
         this.method_32529(var1, field_7032, 27, 20, 30, var3);
         this.method_32529(var1, field_7039, 31, 20, 31, var3);
         this.method_32529(var1, field_7039, 30, 21, 30, var3);
         this.method_32529(var1, field_7032, 30, 20, 30, var3);
         this.method_32529(var1, field_7039, 31, 20, 26, var3);
         this.method_32529(var1, field_7039, 30, 21, 27, var3);
         this.method_32529(var1, field_7032, 30, 20, 27, var3);
         this.method_32500(var1, var3, 28, 21, 27, 29, 21, 27, field_7037, field_7037, false);
         this.method_32500(var1, var3, 27, 21, 28, 27, 21, 29, field_7037, field_7037, false);
         this.method_32500(var1, var3, 28, 21, 30, 29, 21, 30, field_7037, field_7037, false);
         this.method_32500(var1, var3, 30, 21, 28, 30, 21, 29, field_7037, field_7037, false);
      }
   }

   private void method_43303(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 0, 21, 6, 58)) {
         this.method_32500(var1, var3, 0, 0, 21, 6, 0, 57, field_7037, field_7037, false);
         this.method_5718(var1, var3, 0, 1, 21, 6, 7, 57);
         this.method_32500(var1, var3, 4, 4, 21, 6, 4, 53, field_7037, field_7037, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method_32500(var1, var3, var6, var6 + 1, 21, var6, var6 + 1, 57 - var6, field_7039, field_7039, false);
         }

         for (byte var7 = 23; var7 < 53; var7 += 3) {
            this.method_32529(var1, field_7035, 5, 5, var7, var3);
         }

         this.method_32529(var1, field_7035, 5, 5, 52, var3);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method_32500(var1, var3, var8, var8 + 1, 21, var8, var8 + 1, 57 - var8, field_7039, field_7039, false);
         }

         this.method_32500(var1, var3, 4, 1, 52, 6, 3, 52, field_7037, field_7037, false);
         this.method_32500(var1, var3, 5, 1, 51, 5, 3, 53, field_7037, field_7037, false);
      }

      if (this.method_5721(var3, 51, 21, 58, 58)) {
         this.method_32500(var1, var3, 51, 0, 21, 57, 0, 57, field_7037, field_7037, false);
         this.method_5718(var1, var3, 51, 1, 21, 57, 7, 57);
         this.method_32500(var1, var3, 51, 4, 21, 53, 4, 53, field_7037, field_7037, false);

         for (int var9 = 0; var9 < 4; var9++) {
            this.method_32500(var1, var3, 57 - var9, var9 + 1, 21, 57 - var9, var9 + 1, 57 - var9, field_7039, field_7039, false);
         }

         for (byte var10 = 23; var10 < 53; var10 += 3) {
            this.method_32529(var1, field_7035, 52, 5, var10, var3);
         }

         this.method_32529(var1, field_7035, 52, 5, 52, var3);
         this.method_32500(var1, var3, 51, 1, 52, 53, 3, 52, field_7037, field_7037, false);
         this.method_32500(var1, var3, 52, 1, 51, 52, 3, 53, field_7037, field_7037, false);
      }

      if (this.method_5721(var3, 0, 51, 57, 57)) {
         this.method_32500(var1, var3, 7, 0, 51, 50, 0, 57, field_7037, field_7037, false);
         this.method_5718(var1, var3, 7, 1, 51, 50, 10, 57);

         for (int var11 = 0; var11 < 4; var11++) {
            this.method_32500(var1, var3, var11 + 1, var11 + 1, 57 - var11, 56 - var11, var11 + 1, 57 - var11, field_7039, field_7039, false);
         }
      }
   }

   private void method_43296(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 7, 21, 13, 50)) {
         this.method_32500(var1, var3, 7, 0, 21, 13, 0, 50, field_7037, field_7037, false);
         this.method_5718(var1, var3, 7, 1, 21, 13, 10, 50);
         this.method_32500(var1, var3, 11, 8, 21, 13, 8, 53, field_7037, field_7037, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method_32500(var1, var3, var6 + 7, var6 + 5, 21, var6 + 7, var6 + 5, 54, field_7039, field_7039, false);
         }

         for (byte var7 = 21; var7 <= 45; var7 += 3) {
            this.method_32529(var1, field_7035, 12, 9, var7, var3);
         }
      }

      if (this.method_5721(var3, 44, 21, 50, 54)) {
         this.method_32500(var1, var3, 44, 0, 21, 50, 0, 50, field_7037, field_7037, false);
         this.method_5718(var1, var3, 44, 1, 21, 50, 10, 50);
         this.method_32500(var1, var3, 44, 8, 21, 46, 8, 53, field_7037, field_7037, false);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method_32500(var1, var3, 50 - var8, var8 + 5, 21, 50 - var8, var8 + 5, 54, field_7039, field_7039, false);
         }

         for (byte var9 = 21; var9 <= 45; var9 += 3) {
            this.method_32529(var1, field_7035, 45, 9, var9, var3);
         }
      }

      if (this.method_5721(var3, 8, 44, 49, 54)) {
         this.method_32500(var1, var3, 14, 0, 44, 43, 0, 50, field_7037, field_7037, false);
         this.method_5718(var1, var3, 14, 1, 44, 43, 10, 50);

         for (byte var10 = 12; var10 <= 45; var10 += 3) {
            this.method_32529(var1, field_7035, var10, 9, 45, var3);
            this.method_32529(var1, field_7035, var10, 9, 52, var3);
            if (var10 == 12 || var10 == 18 || var10 == 24 || var10 == 33 || var10 == 39 || var10 == 45) {
               this.method_32529(var1, field_7035, var10, 9, 47, var3);
               this.method_32529(var1, field_7035, var10, 9, 50, var3);
               this.method_32529(var1, field_7035, var10, 10, 45, var3);
               this.method_32529(var1, field_7035, var10, 10, 46, var3);
               this.method_32529(var1, field_7035, var10, 10, 51, var3);
               this.method_32529(var1, field_7035, var10, 10, 52, var3);
               this.method_32529(var1, field_7035, var10, 11, 47, var3);
               this.method_32529(var1, field_7035, var10, 11, 50, var3);
               this.method_32529(var1, field_7035, var10, 12, 48, var3);
               this.method_32529(var1, field_7035, var10, 12, 49, var3);
            }
         }

         for (int var11 = 0; var11 < 3; var11++) {
            this.method_32500(var1, var3, 8 + var11, 5 + var11, 54, 49 - var11, 5 + var11, 54, field_7037, field_7037, false);
         }

         this.method_32500(var1, var3, 11, 8, 54, 46, 8, 54, field_7039, field_7039, false);
         this.method_32500(var1, var3, 14, 8, 44, 43, 8, 53, field_7037, field_7037, false);
      }
   }

   private void method_43298(class_700 var1, Random var2, class_9616 var3) {
      if (this.method_5721(var3, 14, 21, 20, 43)) {
         this.method_32500(var1, var3, 14, 0, 21, 20, 0, 43, field_7037, field_7037, false);
         this.method_5718(var1, var3, 14, 1, 22, 20, 14, 43);
         this.method_32500(var1, var3, 18, 12, 22, 20, 12, 39, field_7037, field_7037, false);
         this.method_32500(var1, var3, 18, 12, 21, 20, 12, 21, field_7039, field_7039, false);

         for (int var6 = 0; var6 < 4; var6++) {
            this.method_32500(var1, var3, var6 + 14, var6 + 9, 21, var6 + 14, var6 + 9, 43 - var6, field_7039, field_7039, false);
         }

         for (byte var7 = 23; var7 <= 39; var7 += 3) {
            this.method_32529(var1, field_7035, 19, 13, var7, var3);
         }
      }

      if (this.method_5721(var3, 37, 21, 43, 43)) {
         this.method_32500(var1, var3, 37, 0, 21, 43, 0, 43, field_7037, field_7037, false);
         this.method_5718(var1, var3, 37, 1, 22, 43, 14, 43);
         this.method_32500(var1, var3, 37, 12, 22, 39, 12, 39, field_7037, field_7037, false);
         this.method_32500(var1, var3, 37, 12, 21, 39, 12, 21, field_7039, field_7039, false);

         for (int var8 = 0; var8 < 4; var8++) {
            this.method_32500(var1, var3, 43 - var8, var8 + 9, 21, 43 - var8, var8 + 9, 43 - var8, field_7039, field_7039, false);
         }

         for (byte var9 = 23; var9 <= 39; var9 += 3) {
            this.method_32529(var1, field_7035, 38, 13, var9, var3);
         }
      }

      if (this.method_5721(var3, 15, 37, 42, 43)) {
         this.method_32500(var1, var3, 21, 0, 37, 36, 0, 43, field_7037, field_7037, false);
         this.method_5718(var1, var3, 21, 1, 37, 36, 14, 43);
         this.method_32500(var1, var3, 21, 12, 37, 36, 12, 39, field_7037, field_7037, false);

         for (int var10 = 0; var10 < 4; var10++) {
            this.method_32500(var1, var3, 15 + var10, var10 + 9, 43 - var10, 42 - var10, var10 + 9, 43 - var10, field_7039, field_7039, false);
         }

         for (byte var11 = 21; var11 <= 36; var11 += 3) {
            this.method_32529(var1, field_7035, var11, 13, 38, var3);
         }
      }
   }
}
