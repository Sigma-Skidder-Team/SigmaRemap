package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_6001 extends class_2830 implements class_3978, class_2593 {
   private static String[] field_30567;
   public static final class_7044 field_30566 = class_6023.field_30692;
   public static final class_6720 field_30565 = class_6023.field_30719;
   public static final class_4190 field_30563 = class_6414.method_29292(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   public static final class_4190 field_30564 = class_6414.method_29292(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   public static final class_4190 field_30568 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   public static final class_4190 field_30562 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   public class_6001(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_30566, Integer.valueOf(1)).method_10308(field_30565, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858());
      if (!var4.method_8350(this)) {
         class_4774 var5 = var1.method_21862().method_28258(var1.method_21858());
         boolean var6 = var5.method_22005() == class_8532.field_43674;
         return super.method_29302(var1).method_10308(field_30565, Boolean.valueOf(var6));
      } else {
         return var4.method_10308(field_30566, Integer.valueOf(Math.min(4, var4.<Integer>method_10313(field_30566) + 1)));
      }
   }

   public static boolean method_27398(class_2522 var0) {
      return !var0.<Boolean>method_10313(field_30565);
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      return !var1.method_8324(var2, var3).method_19494(Direction.field_817).method_19485() || var1.method_8308(var2, var3, Direction.field_817);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      BlockPos var6 = var3.method_6100();
      return this.method_12870(var2.method_28262(var6), var2, var6);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.method_8309(var4, var5)) {
         if (var1.<Boolean>method_10313(field_30565)) {
            var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return class_4783.field_23184.method_29260();
      }
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      return var2.method_21867().method_27960() == this.method_10803() && var1.<Integer>method_10313(field_30566) < 4 ? true : super.method_10781(var1, var2);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch (var1.<Integer>method_10313(field_30566)) {
         case 1:
         default:
            return field_30563;
         case 2:
            return field_30564;
         case 3:
            return field_30568;
         case 4:
            return field_30562;
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_30565) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_30566, field_30565);
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      if (!method_27398(var4) && var1.method_28262(var3.method_6100()).method_8349(class_2351.field_11725)) {
         byte var7 = 5;
         byte var8 = 1;
         byte var9 = 2;
         int var10 = 0;
         int var11 = var3.getX() - 2;
         int var12 = 0;

         for (int var13 = 0; var13 < 5; var13++) {
            for (int var14 = 0; var14 < var8; var14++) {
               int var15 = 2 + var3.getY() - 1;

               for (int var16 = var15 - 2; var16 < var15; var16++) {
                  BlockPos var17 = new BlockPos(var11 + var13, var16, var3.getZ() - var12 + var14);
                  if (var17 != var3 && var2.nextInt(6) == 0 && var1.method_28262(var17).method_8350(class_4783.field_23900)) {
                     class_2522 var18 = var1.method_28262(var17.method_6100());
                     if (var18.method_8349(class_2351.field_11725)) {
                        var1.method_7513(var17, class_4783.field_23239.method_29260().method_10308(field_30566, Integer.valueOf(var2.nextInt(4) + 1)), 3);
                     }
                  }
               }
            }

            if (var10 >= 2) {
               var8 -= 2;
               var12--;
            } else {
               var8 += 2;
               var12++;
            }

            var10++;
         }

         var1.method_7513(var3, var4.method_10308(field_30566, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
