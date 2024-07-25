package remapped;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_9049 {
   private static Map[] field_46328 = null;
   private static Map[] field_46342 = null;
   private static Map[][] field_46353 = (Map[][])null;
   private static class_1385[][] field_46348 = (class_1385[][])null;
   private static class_1385[][] field_46324 = (class_1385[][])null;
   private static boolean field_46352 = false;
   public static final int field_46339 = -1;
   public static final int field_46347 = 0;
   public static final int field_46326 = 1;
   public static final int field_46350 = 2;
   public static final int field_46329 = 3;
   public static final int field_46327 = 4;
   public static final int field_46330 = 5;
   private static final int field_46335 = 0;
   private static final int field_46345 = 1;
   private static final int field_46341 = 2;
   public static final class_2522 field_46332 = class_4783.field_23184.method_29260();
   private static class_5155 field_46349 = null;
   public static Identifier field_46323 = class_5525.field_28139;
   private static final class_4536[] field_46321 = new class_4536[]{
      class_4536.field_22117, class_4536.field_22131, class_4536.field_22133, class_4536.field_22120
   };
   private static final class_4536[] field_46325 = new class_4536[]{
      class_4536.field_22117, class_4536.field_22131, class_4536.field_22120, class_4536.field_22133
   };
   private static final class_4536[] field_46344 = new class_4536[]{
      class_4536.field_22131, class_4536.field_22117, class_4536.field_22134, class_4536.field_22124
   };
   private static final class_4536[] field_46333 = new class_4536[]{
      class_4536.field_22117, class_4536.field_22131, class_4536.field_22134, class_4536.field_22124
   };
   private static final class_4536[] field_46338 = new class_4536[]{
      class_4536.field_22133, class_4536.field_22120, class_4536.field_22134, class_4536.field_22124
   };
   private static final class_4536[] field_46336 = new class_4536[]{
      class_4536.field_22120, class_4536.field_22133, class_4536.field_22134, class_4536.field_22124
   };
   private static final class_4536[] field_46351 = new class_4536[]{
      class_4536.field_22132, class_4536.field_22136, class_4536.field_22118, class_4536.field_22130
   };
   private static final class_4536[] field_46337 = new class_4536[]{
      class_4536.field_22118, class_4536.field_22130, class_4536.field_22132, class_4536.field_22136
   };
   private static final class_4536[] field_46343 = new class_4536[]{
      class_4536.field_22123, class_4536.field_22129, class_4536.field_22126, class_4536.field_22125
   };
   private static final class_4536[] field_46322 = new class_4536[]{
      class_4536.field_22129, class_4536.field_22123, class_4536.field_22125, class_4536.field_22126
   };
   private static final class_4536[] field_46320 = new class_4536[]{
      class_4536.field_22116, class_4536.field_22122, class_4536.field_22135, class_4536.field_22128
   };
   private static final class_4536[] field_46334 = new class_4536[]{
      class_4536.field_22122, class_4536.field_22116, class_4536.field_22128, class_4536.field_22135
   };
   public static final class_5155 field_46340 = new class_5155(new Identifier("default"));
   private static final Random field_46331 = new Random(0L);

   public static class_5024[] method_41550(class_5561 var0, class_2522 var1, BlockPos var2, class_5024 var3, class_4460 var4) {
      class_5155 var5 = var3.method_23148();
      if (var5 == null) {
         return var4.method_20683(var3);
      } else if (method_41575(var0, var1, var2, var3, var4)) {
         var3 = method_41553(field_46349, var3);
         return var4.method_20683(var3);
      } else {
         Direction var6 = var3.method_23150();
         return method_41556(var0, var1, var2, var6, var3, var4);
      }
   }

   private static boolean method_41575(class_6163 var0, class_2522 var1, BlockPos var2, class_5024 var3, class_4460 var4) {
      class_6414 var5 = var1.method_8360();
      if (var5 instanceof class_6498) {
         Direction var6 = var3.method_23150();
         if (var6 != Direction.field_817 && var6 != Direction.field_802) {
            return false;
         }

         if (!var3.method_23164()) {
            return false;
         }

         BlockPos var7 = var2.method_6098(var3.method_23150());
         class_2522 var8 = var0.method_28262(var7);
         if (var8.method_8360() != var5) {
            return false;
         }

         class_6414 var9 = var8.method_8360();
         if (var5 instanceof class_5402 && var9 instanceof class_5402) {
            class_9077 var10 = ((class_5402)var5).method_33828();
            class_9077 var11 = ((class_5402)var9).method_33828();
            if (var10 != var11) {
               return false;
            }
         }

         double var14 = (double)var3.method_23151();
         if (var14 < 0.4) {
            if (var8.<Boolean>method_10313(class_9787.field_49664)) {
               return true;
            }
         } else if (var14 > 0.6) {
            if (var8.<Boolean>method_10313(class_9787.field_49667)) {
               return true;
            }
         } else {
            double var12 = var3.method_23165();
            if (var12 < 0.4) {
               if (var8.<Boolean>method_10313(class_9787.field_49671)) {
                  return true;
               }
            } else {
               if (!(var12 > 0.6)) {
                  return true;
               }

               if (var8.<Boolean>method_10313(class_9787.field_49670)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static class_5024[] method_41583(class_5155 var0, class_5024 var1, class_4460 var2) {
      if (var0 == null) {
         return null;
      } else if (var0 == field_46340) {
         return var2.method_20683(var1);
      } else {
         class_5024 var3 = method_41553(var0, var1);
         return var2.method_20683(var3);
      }
   }

   private static synchronized class_5024 method_41553(class_5155 var0, class_5024 var1) {
      if (field_46328 == null) {
         return var1;
      } else {
         int var2 = var0.method_23624();
         if (var2 >= 0 && var2 < field_46328.length) {
            Object var3 = field_46328[var2];
            if (var3 == null) {
               var3 = new IdentityHashMap(1);
               field_46328[var2] = (Map)var3;
            }

            class_5024 var4 = (class_5024)var3.get(var1);
            if (var4 == null) {
               var4 = method_41561(var1, var0);
               var3.put(var1, var4);
            }

            return var4;
         } else {
            return var1;
         }
      }
   }

   private static synchronized class_5024 method_41566(class_5155 var0, class_5024 var1, int var2) {
      if (field_46342 == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         int var3 = var0.method_23624();
         if (var3 >= 0 && var3 < field_46342.length) {
            Object var4 = field_46342[var3];
            if (var4 == null) {
               var4 = new EnumMap(Direction.class);
               field_46342[var3] = (Map)var4;
            }

            Direction var5 = var1.method_23150();
            class_5024 var6 = (class_5024)var4.get(var5);
            if (var6 == null) {
               var6 = class_2870.method_13184(var5, var0, var2);
               var4.put(var5, var6);
            }

            return var6;
         } else {
            return null;
         }
      }
   }

   private static class_5024 method_41561(class_5024 var0, class_5155 var1) {
      int[] var2 = (int[])var0.method_23155().clone();
      class_5155 var3 = var0.method_23148();

      for (int var4 = 0; var4 < 4; var4++) {
         method_41565(var2, var4, var3, var1);
      }

      return new class_5024(var2, var0.method_23160(), var0.method_23150(), var1, var0.method_23168());
   }

   private static void method_41565(int[] var0, int var1, class_5155 var2, class_5155 var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.method_23634(var6);
      double var10 = var2.method_23613(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.method_23602(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.method_23639(var10));
   }

   private static class_5024[] method_41556(class_5561 var0, class_2522 var1, BlockPos var2, Direction var3, class_5024 var4, class_4460 var5) {
      class_5024[] var6 = method_41572(var0, var1, var2, var3, var4, true, 0, var5);
      if (!field_46352) {
         return var6;
      } else if (var6.length == 1 && var6[0] == var4) {
         return var6;
      } else {
         List var7 = var5.method_20669(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            class_5024 var9 = (class_5024)var7.get(var8);
            class_5024 var10 = var9;

            for (int var11 = 0; var11 < 3; var11++) {
               class_5024[] var12 = method_41572(var0, var1, var2, var3, var10, false, var11 + 1, var5);
               if (var12.length != 1 || var12[0] == var10) {
                  break;
               }

               var10 = var12[0];
            }

            var7.set(var8, var10);
         }

         for (int var13 = 0; var13 < var6.length; var13++) {
            var6[var13] = (class_5024)var7.get(var13);
         }

         return var6;
      }
   }

   public static class_5024[] method_41572(
           class_5561 var0, class_2522 var1, BlockPos var2, Direction var3, class_5024 var4, boolean var5, int var6, class_4460 var7
   ) {
      class_6414 var8 = var1.method_8360();
      class_5155 var9 = var4.method_23148();
      if (field_46324 != null) {
         int var10 = var9.method_23624();
         if (var10 >= 0 && var10 < field_46324.length) {
            class_1385[] var11 = field_46324[var10];
            if (var11 != null) {
               int var12 = method_41540(var3);

               for (int var13 = 0; var13 < var11.length; var13++) {
                  class_1385 var14 = var11[var13];
                  if (var14 != null && var14.method_6398(var1.method_11477())) {
                     class_5024[] var15 = method_41549(var14, var0, var1, var2, var12, var4, var6, var7);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }
         }
      }

      if (field_46348 != null && var5) {
         int var16 = var7.method_20694();
         if (var16 >= 0 && var16 < field_46348.length) {
            class_1385[] var17 = field_46348[var16];
            if (var17 != null) {
               int var18 = method_41540(var3);

               for (int var19 = 0; var19 < var17.length; var19++) {
                  class_1385 var20 = var17[var19];
                  if (var20 != null && var20.method_6377(var9)) {
                     class_5024[] var21 = method_41549(var20, var0, var1, var2, var18, var4, var6, var7);
                     if (var21 != null) {
                        return var21;
                     }
                  }
               }
            }
         }
      }

      return var7.method_20683(var4);
   }

   public static int method_41540(Direction var0) {
      if (var0 == null) {
         return -1;
      } else {
         switch (var0) {
            case field_802:
               return 0;
            case field_817:
               return 1;
            case field_804:
               return 5;
            case field_809:
               return 4;
            case field_818:
               return 2;
            case field_800:
               return 3;
            default:
               return -1;
         }
      }
   }

   private static Direction method_41557(int var0) {
      switch (var0) {
         case 0:
            return Direction.field_802;
         case 1:
            return Direction.field_817;
         case 2:
            return Direction.field_818;
         case 3:
            return Direction.field_800;
         case 4:
            return Direction.field_809;
         case 5:
            return Direction.field_804;
         default:
            return Direction.field_817;
      }
   }

   private static class_5024[] method_41549(
           class_1385 var0, class_5561 var1, class_2522 var2, BlockPos var3, int var4, class_5024 var5, int var6, class_4460 var7
   ) {
      int var8 = 0;
      int var9 = var2.method_11473();
      class_6414 var10 = var2.method_8360();
      if (var10 instanceof class_7947) {
         var8 = method_41563(var2);
      }

      if (!var0.method_6386(var2.method_11477(), var9)) {
         return null;
      } else {
         if (var4 >= 0 && var0.field_7530 != 63) {
            int var11 = var4;
            if (var8 != 0) {
               var11 = method_41585(var4, var8);
            }

            if ((1 << var11 & var0.field_7530) == 0) {
               return null;
            }
         }

         int var13 = var3.getY();
         if (var0.field_7517 != null && !var0.field_7517.method_40164(var13)) {
            return null;
         } else {
            if (var0.field_7525 != null) {
               class_6325 var12 = class_5630.method_25519(var1, var3);
               if (!var0.method_6383(var12)) {
                  return null;
               }
            }

            if (var0.field_7560 != null) {
               String var14 = class_2294.method_10557(var1, var3);
               if (!var0.field_7560.method_7706(var14)) {
                  return null;
               }
            }

            class_5155 var15 = var5.method_23148();
            switch (var0.field_7551) {
               case 1:
                  return method_41583(method_41559(var0, var1, var2, var3, var8, var4, var15, var9, var7), var5, var7);
               case 2:
                  return method_41583(method_41564(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 3:
                  return method_41583(method_41554(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 4:
                  return method_41583(method_41544(var0, var1, var2, var3, var4), var5, var7);
               case 5:
                  return method_41583(method_41579(var0, var3, var4), var5, var7);
               case 6:
                  return method_41583(method_41573(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 7:
                  return method_41583(method_41567(var0), var5, var7);
               case 8:
                  return method_41583(method_41560(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 9:
                  return method_41583(method_41532(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 10:
                  if (var6 == 0) {
                     return method_41538(var0, var1, var2, var3, var8, var4, var5, var9, var7);
                  }
               default:
                  return null;
               case 11:
                  return method_41545(var0, var1, var2, var3, var8, var4, var5, var9, var7);
               case 12:
                  return method_41541(var0, var5, var7);
               case 13:
                  return method_41562(var0, var1, var2, var3, var4, var5, var7);
               case 14:
                  return method_41558(var0, var3, var4, var5, var7);
               case 15:
                  return method_41577(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            }
         }
      }
   }

   private static int method_41585(int var0, int var1) {
      switch (var1) {
         case 0:
            return var0;
         case 1:
            switch (var0) {
               case 0:
                  return 2;
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 0;
               default:
                  return var0;
            }
         case 2:
            switch (var0) {
               case 0:
                  return 4;
               case 1:
                  return 5;
               case 2:
               case 3:
               default:
                  return var0;
               case 4:
                  return 1;
               case 5:
                  return 0;
            }
         default:
            return var0;
      }
   }

   private static int method_41563(class_2522 var0) {
      class_9249 var1 = var0.<class_9249>method_10313(class_7947.field_40671);
      switch (var1) {
         case field_47215:
            return 2;
         case field_47219:
            return 1;
         default:
            return 0;
      }
   }

   private static class_5155 method_41544(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4) {
      if (var0.field_7503.length == 1) {
         return var0.field_7503[0];
      } else {
         int var5 = var4 / var0.field_7516 * var0.field_7516;
         if (var0.field_7529) {
            BlockPos var6 = var3.method_6100();

            for (class_2522 var7 = var1.method_28262(var6); var7.method_8360() == var2.method_8360(); var7 = var1.method_28262(var6)) {
               var3 = var6;
               var6 = var6.method_6100();
               if (var6.getY() < 0) {
                  break;
               }
            }
         }

         int var11 = Config.method_14242(var3, var5) & 2147483647;

         for (int var12 = 0; var12 < var0.field_7538; var12++) {
            var11 = Config.method_14419(var11);
         }

         int var13 = 0;
         if (var0.field_7522 == null) {
            var13 = var11 % var0.field_7503.length;
         } else {
            int var8 = var11 % var0.field_7547;
            int[] var9 = var0.field_7508;

            for (int var10 = 0; var10 < var9.length; var10++) {
               if (var8 < var9[var10]) {
                  var13 = var10;
                  break;
               }
            }
         }

         return var0.field_7503[var13];
      }
   }

   private static class_5155 method_41567(class_1385 var0) {
      return var0.field_7503[0];
   }

   private static class_5155 method_41579(class_1385 var0, BlockPos var1, int var2) {
      if (var0.field_7503.length == 1) {
         return var0.field_7503[0];
      } else {
         int var3 = var1.getX();
         int var4 = var1.getY();
         int var5 = var1.getZ();
         int var6 = 0;
         int var7 = 0;
         switch (var2) {
            case 0:
               var6 = var3;
               var7 = -var5 - 1;
               break;
            case 1:
               var6 = var3;
               var7 = var5;
               break;
            case 2:
               var6 = -var3 - 1;
               var7 = -var4;
               break;
            case 3:
               var6 = var3;
               var7 = -var4;
               break;
            case 4:
               var6 = var5;
               var7 = -var4;
               break;
            case 5:
               var6 = -var5 - 1;
               var7 = -var4;
         }

         var6 %= var0.field_7520;
         var7 %= var0.field_7506;
         if (var6 < 0) {
            var6 += var0.field_7520;
         }

         if (var7 < 0) {
            var7 += var0.field_7506;
         }

         int var8 = var7 * var0.field_7520 + var6;
         return var0.field_7503[var8];
      }
   }

   private static class_5155 method_41559(
           class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7, class_4460 var8
   ) {
      int var9 = method_41568(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      return var0.field_7503[var9];
   }

   private static synchronized class_5024[] method_41538(
           class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5024 var6, int var7, class_4460 var8
   ) {
      class_5155 var9 = var6.method_23148();
      int var10 = method_41568(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      return class_4841.method_22266(var10, var0, var5, var6, var8);
   }

   private static class_5024[] method_41545(
           class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5024 var6, int var7, class_4460 var8
   ) {
      if (!var6.method_23159()) {
         return null;
      } else {
         class_5155 var9 = var6.method_23148();
         class_4536[] var10 = method_41536(var5, var4);
         boolean[] var11 = var8.method_20688();

         for (int var12 = 0; var12 < 4; var12++) {
            var11[var12] = method_41552(var0, var1, var2, var10[var12].method_21056(var3), var5, var9, var7);
         }

         class_8910 var21 = var8.method_20695(var0.field_7502);

         Object var13;
         try {
            if (!var11[0] || !var11[1] || !var11[2] || !var11[3]) {
               if (var11[0] && var11[1] && var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[5], var6, var0.field_7523), var0.field_7561);
                  return null;
               }

               if (var11[0] && var11[2] && var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[6], var6, var0.field_7523), var0.field_7561);
                  return null;
               }

               if (var11[1] && var11[2] && var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[12], var6, var0.field_7523), var0.field_7561);
                  return null;
               }

               if (var11[0] && var11[1] && var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[13], var6, var0.field_7523), var0.field_7561);
                  return null;
               }

               class_4536[] var14 = method_41555(var5, var4);
               boolean[] var15 = var8.method_20676();

               for (int var16 = 0; var16 < 4; var16++) {
                  var15[var16] = method_41552(var0, var1, var2, var14[var16].method_21056(var3), var5, var9, var7);
               }

               if (var11[1] && var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[3], var6, var0.field_7523), var0.field_7561);
                  if (var15[3]) {
                     var21.method_40989(method_41566(var0.field_7503[16], var6, var0.field_7523), var0.field_7561);
                  }

                  return null;
               }

               if (var11[0] && var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[4], var6, var0.field_7523), var0.field_7561);
                  if (var15[2]) {
                     var21.method_40989(method_41566(var0.field_7503[14], var6, var0.field_7523), var0.field_7561);
                  }

                  return null;
               }

               if (var11[1] && var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[10], var6, var0.field_7523), var0.field_7561);
                  if (var15[1]) {
                     var21.method_40989(method_41566(var0.field_7503[2], var6, var0.field_7523), var0.field_7561);
                  }

                  return null;
               }

               if (var11[0] && var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[11], var6, var0.field_7523), var0.field_7561);
                  if (var15[0]) {
                     var21.method_40989(method_41566(var0.field_7503[0], var6, var0.field_7523), var0.field_7561);
                  }

                  return null;
               }

               boolean[] var26 = var8.method_20672();

               for (int var17 = 0; var17 < 4; var17++) {
                  var26[var17] = method_41569(var0, var1, var2, var10[var17].method_21056(var3), var5, var9, var7);
               }

               if (var11[0]) {
                  var21.method_40989(method_41566(var0.field_7503[9], var6, var0.field_7523), var0.field_7561);
               }

               if (var11[1]) {
                  var21.method_40989(method_41566(var0.field_7503[7], var6, var0.field_7523), var0.field_7561);
               }

               if (var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[1], var6, var0.field_7523), var0.field_7561);
               }

               if (var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[15], var6, var0.field_7523), var0.field_7561);
               }

               if (var15[0] && (var26[1] || var26[2]) && !var11[1] && !var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[0], var6, var0.field_7523), var0.field_7561);
               }

               if (var15[1] && (var26[0] || var26[2]) && !var11[0] && !var11[2]) {
                  var21.method_40989(method_41566(var0.field_7503[2], var6, var0.field_7523), var0.field_7561);
               }

               if (var15[2] && (var26[1] || var26[3]) && !var11[1] && !var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[14], var6, var0.field_7523), var0.field_7561);
               }

               if (var15[3] && (var26[0] || var26[3]) && !var11[0] && !var11[3]) {
                  var21.method_40989(method_41566(var0.field_7503[16], var6, var0.field_7523), var0.field_7561);
               }

               return null;
            }

            var21.method_40989(method_41566(var0.field_7503[8], var6, var0.field_7523), var0.field_7561);
            var13 = null;
         } finally {
            if (var21.method_40987() > 0) {
               var8.method_20698(true);
            }
         }

         return (class_5024[])var13;
      }
   }

   private static class_5024[] method_41541(class_1385 var0, class_5024 var1, class_4460 var2) {
      if (!var1.method_23159()) {
         return null;
      } else {
         class_8910 var3 = var2.method_20695(var0.field_7502);

         Object var4;
         try {
            class_5155 var5 = method_41567(var0);
            if (var5 != null) {
               var3.method_40989(method_41566(var5, var1, var0.field_7523), var0.field_7561);
            }

            var4 = null;
         } finally {
            if (var3.method_40987() > 0) {
               var2.method_20698(true);
            }
         }

         return (class_5024[])var4;
      }
   }

   private static class_5024[] method_41562(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, class_5024 var5, class_4460 var6) {
      if (!var5.method_23159()) {
         return null;
      } else {
         class_8910 var7 = var6.method_20695(var0.field_7502);

         Object var8;
         try {
            class_5155 var9 = method_41544(var0, var1, var2, var3, var4);
            if (var9 != null) {
               var7.method_40989(method_41566(var9, var5, var0.field_7523), var0.field_7561);
            }

            var8 = null;
         } finally {
            if (var7.method_40987() > 0) {
               var6.method_20698(true);
            }
         }

         return (class_5024[])var8;
      }
   }

   private static class_5024[] method_41558(class_1385 var0, BlockPos var1, int var2, class_5024 var3, class_4460 var4) {
      if (!var3.method_23159()) {
         return null;
      } else {
         class_8910 var5 = var4.method_20695(var0.field_7502);

         Object var6;
         try {
            class_5155 var7 = method_41579(var0, var1, var2);
            if (var7 != null) {
               var5.method_40989(method_41566(var7, var3, var0.field_7523), var0.field_7561);
            }

            var6 = null;
         } finally {
            if (var5.method_40987() > 0) {
               var4.method_20698(true);
            }
         }

         return (class_5024[])var6;
      }
   }

   private static class_5024[] method_41577(
           class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5024 var6, int var7, class_4460 var8
   ) {
      if (!var6.method_23159()) {
         return null;
      } else {
         class_8910 var9 = var8.method_20695(var0.field_7502);

         Object var10;
         try {
            class_5155 var11 = method_41559(var0, var1, var2, var3, var4, var5, var6.method_23148(), var7, var8);
            if (var11 != null) {
               var9.method_40989(method_41566(var11, var6, var0.field_7523), var0.field_7561);
            }

            var10 = null;
         } finally {
            if (var9.method_40987() > 0) {
               var8.method_20698(true);
            }
         }

         return (class_5024[])var10;
      }
   }

   private static class_4536[] method_41536(int var0, int var1) {
      switch (var0) {
         case 0:
            return field_46321;
         case 1:
            return field_46325;
         case 2:
            return field_46344;
         case 3:
            return field_46333;
         case 4:
            return field_46338;
         case 5:
            return field_46336;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static class_4536[] method_41555(int var0, int var1) {
      switch (var0) {
         case 0:
            return field_46351;
         case 1:
            return field_46337;
         case 2:
            return field_46343;
         case 3:
            return field_46322;
         case 4:
            return field_46320;
         case 5:
            return field_46334;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   public static Map[][] method_41570() {
      return field_46353;
   }

   private static int method_41568(
           class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7, class_4460 var8
   ) {
      boolean[] var9 = var8.method_20688();
      switch (var5) {
         case 0:
            var9[0] = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var16 = var3.method_6100();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var16.method_6108(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var16.method_6090(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var16.method_6094(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var16.method_6073(), var5, var6, var7);
            }
            break;
         case 1:
            var9[0] = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var15 = var3.method_6081();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var15.method_6108(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var15.method_6090(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var15.method_6073(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var15.method_6094(), var5, var6, var7);
            }
            break;
         case 2:
            var9[0] = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var14 = var3.method_6094();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var14.method_6090(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var14.method_6108(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var14.method_6100(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var14.method_6081(), var5, var6, var7);
            }
            break;
         case 3:
            var9[0] = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var13 = var3.method_6073();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var13.method_6108(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var13.method_6090(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var13.method_6100(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var13.method_6081(), var5, var6, var7);
            }
            break;
         case 4:
            var9[0] = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var12 = var3.method_6108();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var12.method_6094(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var12.method_6073(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var12.method_6100(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var12.method_6081(), var5, var6, var7);
            }
            break;
         case 5:
            var9[0] = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            var9[1] = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            var9[2] = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            var9[3] = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            if (var0.field_7552) {
               BlockPos var10 = var3.method_6090();
               var9[0] = var9[0] && !method_41542(var0, var1, var2, var10.method_6073(), var5, var6, var7);
               var9[1] = var9[1] && !method_41542(var0, var1, var2, var10.method_6094(), var5, var6, var7);
               var9[2] = var9[2] && !method_41542(var0, var1, var2, var10.method_6100(), var5, var6, var7);
               var9[3] = var9[3] && !method_41542(var0, var1, var2, var10.method_6081(), var5, var6, var7);
            }
      }

      byte var17 = 0;
      if (var9[0] & !var9[1] & !var9[2] & !var9[3]) {
         var17 = 3;
      } else if (!var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 1;
      } else if (!var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 12;
      } else if (!var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 36;
      } else if (var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 2;
      } else if (!var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 24;
      } else if (var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 15;
      } else if (var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 39;
      } else if (!var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 13;
      } else if (!var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 37;
      } else if (!var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 25;
      } else if (var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 27;
      } else if (var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 38;
      } else if (var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 14;
      } else if (var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 26;
      }

      if (var17 == 0) {
         return var17;
      } else if (!Config.method_14309()) {
         return var17;
      } else {
         switch (var5) {
            case 0:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6090().method_6094(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6108().method_6094(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6090().method_6073(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6108().method_6073(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var22 = var3.method_6100();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var22.method_6090().method_6094(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var22.method_6108().method_6094(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var22.method_6090().method_6073(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var22.method_6108().method_6073(), var5, var6, var7);
               }
               break;
            case 1:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6090().method_6073(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6108().method_6073(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6090().method_6094(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6108().method_6094(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var21 = var3.method_6081();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var21.method_6090().method_6073(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var21.method_6108().method_6073(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var21.method_6090().method_6094(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var21.method_6108().method_6094(), var5, var6, var7);
               }
               break;
            case 2:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6108().method_6100(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6090().method_6100(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6108().method_6081(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6090().method_6081(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var20 = var3.method_6094();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var20.method_6108().method_6100(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var20.method_6090().method_6100(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var20.method_6108().method_6081(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var20.method_6090().method_6081(), var5, var6, var7);
               }
               break;
            case 3:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6090().method_6100(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6108().method_6100(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6090().method_6081(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6108().method_6081(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var19 = var3.method_6073();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var19.method_6090().method_6100(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var19.method_6108().method_6100(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var19.method_6090().method_6081(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var19.method_6108().method_6081(), var5, var6, var7);
               }
               break;
            case 4:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6100().method_6073(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6100().method_6094(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6081().method_6073(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6081().method_6094(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var18 = var3.method_6108();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var18.method_6100().method_6073(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var18.method_6100().method_6094(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var18.method_6081().method_6073(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var18.method_6081().method_6094(), var5, var6, var7);
               }
               break;
            case 5:
               var9[0] = !method_41542(var0, var1, var2, var3.method_6100().method_6094(), var5, var6, var7);
               var9[1] = !method_41542(var0, var1, var2, var3.method_6100().method_6073(), var5, var6, var7);
               var9[2] = !method_41542(var0, var1, var2, var3.method_6081().method_6094(), var5, var6, var7);
               var9[3] = !method_41542(var0, var1, var2, var3.method_6081().method_6073(), var5, var6, var7);
               if (var0.field_7552) {
                  BlockPos var11 = var3.method_6090();
                  var9[0] = var9[0] || method_41542(var0, var1, var2, var11.method_6100().method_6094(), var5, var6, var7);
                  var9[1] = var9[1] || method_41542(var0, var1, var2, var11.method_6100().method_6073(), var5, var6, var7);
                  var9[2] = var9[2] || method_41542(var0, var1, var2, var11.method_6081().method_6094(), var5, var6, var7);
                  var9[3] = var9[3] || method_41542(var0, var1, var2, var11.method_6081().method_6073(), var5, var6, var7);
               }
         }

         if (var17 == 13 && var9[0]) {
            var17 = 4;
         } else if (var17 == 15 && var9[1]) {
            var17 = 5;
         } else if (var17 == 37 && var9[2]) {
            var17 = 16;
         } else if (var17 == 39 && var9[3]) {
            var17 = 17;
         } else if (var17 == 14 && var9[0] && var9[1]) {
            var17 = 7;
         } else if (var17 == 25 && var9[0] && var9[2]) {
            var17 = 6;
         } else if (var17 == 27 && var9[3] && var9[1]) {
            var17 = 19;
         } else if (var17 == 38 && var9[3] && var9[2]) {
            var17 = 18;
         } else if (var17 == 14 && !var9[0] && var9[1]) {
            var17 = 31;
         } else if (var17 == 25 && var9[0] && !var9[2]) {
            var17 = 30;
         } else if (var17 == 27 && !var9[3] && var9[1]) {
            var17 = 41;
         } else if (var17 == 38 && var9[3] && !var9[2]) {
            var17 = 40;
         } else if (var17 == 14 && var9[0] && !var9[1]) {
            var17 = 29;
         } else if (var17 == 25 && !var9[0] && var9[2]) {
            var17 = 28;
         } else if (var17 == 27 && var9[3] && !var9[1]) {
            var17 = 43;
         } else if (var17 == 38 && !var9[3] && var9[2]) {
            var17 = 42;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 46;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 9;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 21;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 8;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 20;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 11;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 22;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 23;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 10;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 34;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 35;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && !var9[3]) {
            var17 = 32;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 33;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 44;
         } else if (var17 == 26 && !var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 45;
         }

         return var17;
      }
   }

   private static void method_41582(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean method_41552(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, class_5155 var5, int var6) {
      class_2522 var7 = var1.method_28262(var3);
      if (!method_41551(var7, var1, var3)) {
         return false;
      } else if (var0.field_7535 != null && !class_2164.method_10065(var7.method_11477(), var7.method_11473(), var0.field_7535)) {
         return false;
      } else {
         if (var0.field_7532 != null) {
            class_5155 var8 = method_41571(var1, var2, var3, var7, var4);
            if (!Config.method_14352(var8, var0.field_7532)) {
               return false;
            }
         }

         BlockPos var10 = var3.method_6098(method_41557(var4));
         class_2522 var9 = var1.method_28262(var10);
         if (var9.method_8321(var1, var10)) {
            return false;
         } else {
            return var4 == 1 && var9.method_8360() == class_4783.field_23552 ? false : !method_41543(var0, var1, var2, var3, var7, var4, var5, var6);
         }
      }
   }

   private static boolean method_41551(class_2522 var0, class_6163 var1, BlockPos var2) {
      if (class_9451.method_43717(var0, var1, var2)) {
         return true;
      } else {
         class_6414 var3 = var0.method_8360();
         return var3 instanceof class_9660 ? true : var3 instanceof class_9243;
      }
   }

   private static boolean method_41569(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, class_5155 var5, int var6) {
      class_2522 var7 = var1.method_28262(var3);
      if (var7 == field_46332) {
         return false;
      } else if (var0.field_7515 != null && !var0.method_6386(var7.method_11477(), var7.method_11473())) {
         return false;
      } else {
         if (var0.field_7512 != null) {
            class_5155 var8 = method_41571(var1, var2, var3, var7, var4);
            if (var8 != var5) {
               return false;
            }
         }

         BlockPos var10 = var3.method_6098(method_41557(var4));
         class_2522 var9 = var1.method_28262(var10);
         return var9.method_8321(var1, var10) ? false : var4 != 1 || var9.method_8360() != class_4783.field_23552;
      }
   }

   private static boolean method_41542(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, class_5155 var5, int var6) {
      class_2522 var7 = var1.method_28262(var3);
      return method_41543(var0, var1, var2, var3, var7, var4, var5, var6);
   }

   private static boolean method_41543(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, class_2522 var4, int var5, class_5155 var6, int var7) {
      if (var2 == var4) {
         return true;
      } else if (var0.field_7509 == 2) {
         if (var4 == null) {
            return false;
         } else if (var4 == field_46332) {
            return false;
         } else {
            class_5155 var10 = method_41571(var1, var2, var3, var4, var5);
            return var10 == var6;
         }
      } else if (var0.field_7509 == 3) {
         if (var4 == null) {
            return false;
         } else {
            return var4 == field_46332 ? false : var4.method_8362() == var2.method_8362();
         }
      } else if (var0.field_7509 == 1) {
         class_6414 var8 = var2.method_8360();
         class_6414 var9 = var4.method_8360();
         return var9 == var8;
      } else {
         return false;
      }
   }

   private static class_5155 method_41571(class_6163 var0, class_2522 var1, BlockPos var2, class_2522 var3, int var4) {
      class_7373 var5 = MinecraftClient.getInstance().method_8505().method_3716().method_43946(var3);
      if (var5 == null) {
         return null;
      } else {
         Direction var6 = method_41557(var4);
         List var7 = var5.method_33580(var3, var6, field_46331);
         if (var7 == null) {
            return null;
         } else {
            if (Config.method_14331()) {
               var7 = class_8316.method_38342(var0, var3, var2, var6, var7);
            }

            if (var7.size() > 0) {
               class_5024 var11 = (class_5024)var7.get(0);
               return var11.method_23148();
            } else {
               List var8 = var5.method_33580(var3, (Direction)null, field_46331);
               if (var8 == null) {
                  return null;
               } else {
                  for (int var9 = 0; var9 < var8.size(); var9++) {
                     class_5024 var10 = (class_5024)var8.get(var9);
                     if (var10.method_23150() == var6) {
                        return var10.method_23148();
                     }
                  }

                  return null;
               }
            }
         }
      }
   }

   private static class_5155 method_41564(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7) {
      boolean var8;
      boolean var9;
      var8 = false;
      var9 = false;
      label46:
      switch (var4) {
         case 0:
            switch (var5) {
               case 0:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
               default:
                  break label46;
            }
         case 1:
            switch (var5) {
               case 0:
                  var8 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
               default:
                  break label46;
            }
         case 2:
            switch (var5) {
               case 0:
                  var8 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
                  break;
               case 1:
                  var8 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
                  break;
               case 2:
                  var8 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
                  break;
               case 3:
                  var8 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
                  break;
               case 4:
                  var8 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
                  break;
               case 5:
                  var8 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
                  var9 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.field_7503[var10];
   }

   private static class_5155 method_41573(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      switch (var4) {
         case 0:
            if (var5 == 1) {
               var8 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            } else if (var5 == 0) {
               var8 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            } else {
               var8 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            }
            break;
         case 1:
            if (var5 == 3) {
               var8 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            } else if (var5 == 2) {
               var8 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            } else {
               var8 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6094(), var5, var6, var7);
            }
            break;
         case 2:
            if (var5 == 5) {
               var8 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
            } else if (var5 == 4) {
               var8 = method_41542(var0, var1, var2, var3.method_6100(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            } else {
               var8 = method_41542(var0, var1, var2, var3.method_6108(), var5, var6, var7);
               var9 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.field_7503[var10];
   }

   private static class_5155 method_41560(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7) {
      class_5155[] var8 = var0.field_7503;
      class_5155 var9 = method_41564(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         class_5155 var10 = method_41573(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static class_5155 method_41532(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7) {
      class_5155[] var8 = var0.field_7503;
      class_5155 var9 = method_41573(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         class_5155 var10 = method_41564(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static class_5155 method_41554(class_1385 var0, class_6163 var1, class_2522 var2, BlockPos var3, int var4, int var5, class_5155 var6, int var7) {
      boolean var8 = false;
      switch (var4) {
         case 0:
            if (var5 == 1 || var5 == 0) {
               return null;
            }

            var8 = method_41542(var0, var1, var2, var3.method_6081(), var5, var6, var7);
            break;
         case 1:
            if (var5 == 3 || var5 == 2) {
               return null;
            }

            var8 = method_41542(var0, var1, var2, var3.method_6073(), var5, var6, var7);
            break;
         case 2:
            if (var5 == 5 || var5 == 4) {
               return null;
            }

            var8 = method_41542(var0, var1, var2, var3.method_6090(), var5, var6, var7);
      }

      return var8 ? var0.field_7503[0] : null;
   }

   public static void method_41533(class_8359 var0) {
      field_46348 = (class_1385[][])null;
      field_46324 = (class_1385[][])null;
      field_46328 = null;
      field_46353 = (Map[][])null;
      if (Config.method_14370()) {
         class_8169[] var1 = Config.method_14347();

         for (int var2 = var1.length - 1; var2 >= 0; var2--) {
            class_8169 var3 = var1[var2];
            method_41534(var0, var3);
         }

         method_41534(var0, Config.method_14415());
         field_46349 = var0.method_38515(field_46323);
         field_46328 = new Map[var0.method_38525() + 1];
         field_46342 = new Map[var0.method_38525() + 1];
         field_46353 = new Map[var0.method_38525() + 1][];
         if (field_46348.length <= 0) {
            field_46348 = (class_1385[][])null;
         }

         if (field_46324.length <= 0) {
            field_46324 = (class_1385[][])null;
         }
      }
   }

   public static void method_41534(class_8359 var0, class_8169 var1) {
      String[] var2 = class_9654.method_44543(var1, "optifine/ctm/", ".properties", method_41537());
      Arrays.sort(var2);
      List var3 = method_41578(field_46324);
      List var4 = method_41578(field_46348);

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var2[var5];
         Config.method_14277("ConnectedTextures: " + var6);

         try {
            Identifier var7 = new Identifier(var6);
            InputStream var8 = var1.method_37466(class_3168.field_15844, var7);
            if (var8 == null) {
               Config.method_14317("ConnectedTextures file not found: " + var6);
            } else {
               class_8407 var9 = new class_8407();
               var9.load(var8);
               var8.close();
               class_1385 var10 = new class_1385(var9, var6);
               if (var10.method_6404(var6)) {
                  var10.method_6403(var0);
                  method_41576(var10, var3);
                  method_41548(var10, var4);
               }
            }
         } catch (FileNotFoundException var11) {
            Config.method_14317("ConnectedTextures file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      field_46348 = method_41539(var4);
      field_46324 = method_41539(var3);
      field_46352 = method_41535();
      Config.method_14277("Multipass connected textures: " + field_46352);
   }

   public static void method_41546(class_8359 var0) {
      method_41547(field_46348, var0);
      method_41547(field_46324, var0);
      field_46349 = method_41580(var0, field_46323);
   }

   private static class_5155 method_41580(class_8359 var0, Identifier var1) {
      class_5155 var2 = var0.method_38528(var1);
      if (var2 == null || var2 instanceof class_2008) {
         Config.method_14317("Missing CTM sprite: " + var1);
      }

      return var2;
   }

   private static void method_41547(class_1385[][] var0, class_8359 var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            class_1385[] var3 = var0[var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  class_1385 var5 = var3[var4];
                  if (var5 != null) {
                     var5.method_6374(var1);
                  }
               }
            }
         }
      }
   }

   private static List method_41578(class_1385[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            class_1385[] var3 = var0[var2];
            ArrayList var4 = null;
            if (var3 != null) {
               var4 = new ArrayList<class_1385>(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static boolean method_41535() {
      ArrayList var0 = new ArrayList();

      for (int var1 = 0; var1 < field_46324.length; var1++) {
         class_1385[] var2 = field_46324[var1];
         if (var2 != null) {
            var0.addAll(Arrays.asList(var2));
         }
      }

      for (int var6 = 0; var6 < field_46348.length; var6++) {
         class_1385[] var8 = field_46348[var6];
         if (var8 != null) {
            var0.addAll(Arrays.asList(var8));
         }
      }

      class_1385[] var7 = var0.<class_1385>toArray(new class_1385[var0.size()]);
      HashSet var9 = new HashSet();
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var7.length; var4++) {
         class_1385 var5 = var7[var4];
         if (var5.field_7512 != null) {
            var9.addAll(Arrays.asList(var5.field_7512));
         }

         if (var5.field_7503 != null) {
            var3.addAll(Arrays.asList(var5.field_7503));
         }
      }

      var9.retainAll(var3);
      return !var9.isEmpty();
   }

   private static class_1385[][] method_41539(List var0) {
      class_1385[][] var1 = new class_1385[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List var3 = (List)var0.get(var2);
         if (var3 != null) {
            class_1385[] var4 = var3.<class_1385>toArray(new class_1385[var3.size()]);
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static void method_41576(class_1385 var0, List var1) {
      if (var0.field_7512 != null) {
         for (int var2 = 0; var2 < var0.field_7512.length; var2++) {
            class_5155 var3 = var0.field_7512[var2];
            if (!(var3 instanceof class_5155)) {
               Config.method_14317("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.method_23644());
            } else {
               int var4 = var3.method_23624();
               if (var4 < 0) {
                  Config.method_14317("Invalid tile ID: " + var4 + ", icon: " + var3.method_23644());
               } else {
                  method_41584(var0, var1, var4);
               }
            }
         }
      }
   }

   private static void method_41548(class_1385 var0, List var1) {
      if (var0.field_7515 != null) {
         for (int var2 = 0; var2 < var0.field_7515.length; var2++) {
            int var3 = var0.field_7515[var2].method_43838();
            if (var3 < 0) {
               Config.method_14317("Invalid block ID: " + var3);
            } else {
               method_41584(var0, var1, var3);
            }
         }
      }
   }

   private static void method_41584(class_1385 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      Object var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      var3.add(var0);
   }

   private static String[] method_41537() {
      ArrayList var0 = new ArrayList();
      method_41581(var0, "textures/block/glass.png", "20_glass/glass.properties");
      method_41581(var0, "textures/block/glass.png", "20_glass/glass_pane.properties");
      method_41581(var0, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
      method_41581(var0, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
      method_41581(var0, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
      String[] var1 = new String[]{
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      };

      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = class_8251.method_37808("" + var2, 2, '0');
         method_41581(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_" + var3 + ".properties");
         method_41581(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_pane_" + var3 + ".properties");
      }

      return var0.<String>toArray(new String[var0.size()]);
   }

   private static void method_41581(List var0, String var1, String var2) {
      String var3 = "optifine/ctm/default/";
      Identifier var4 = new Identifier(var1);
      class_8169 var5 = Config.method_14233(var4);
      if (var5 != null) {
         if (var5.method_37470().equals("Programmer Art")) {
            String var6 = var3 + "programmer_art/";
            var0.add(var6 + var2);
         } else if (var5 == Config.method_14415()) {
            var0.add(var3 + var2);
         }
      }
   }
}
