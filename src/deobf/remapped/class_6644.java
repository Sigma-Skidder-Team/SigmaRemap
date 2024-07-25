package remapped;

import java.util.Random;

public class class_6644 extends class_6414 implements class_5978 {
   private static String[] field_34382;
   public static final class_6720 field_34381 = class_6023.field_30725;

   public class_6644(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_34381, Boolean.valueOf(true)));
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      class_2522 var7 = var2.method_28262(var3.method_6081());
      if (!var7.method_8345()) {
         var4.method_37188(var1.<Boolean>method_10313(field_34381));
      } else {
         var4.method_37334(var1.<Boolean>method_10313(field_34381));
         if (!var2.field_33055) {
            class_6331 var8 = (class_6331)var2;

            for (int var9 = 0; var9 < 2; var9++) {
               var8.method_28957(
                  class_3090.field_15346,
                  (double)var3.method_12173() + var2.field_33033.nextDouble(),
                  (double)(var3.method_12165() + 1),
                  (double)var3.method_12185() + var2.field_33033.nextDouble(),
                  1,
                  0.0,
                  0.0,
                  0.0,
                  1.0
               );
               var8.method_28957(
                  class_3090.field_15340,
                  (double)var3.method_12173() + var2.field_33033.nextDouble(),
                  (double)(var3.method_12165() + 1),
                  (double)var3.method_12185() + var2.field_33033.nextDouble(),
                  1,
                  0.0,
                  0.01,
                  0.0,
                  0.2
               );
            }
         }
      }
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      method_30519(var2, var3.method_6081(), method_30521(var2, var3.method_6100()));
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      method_30519(var2, var3.method_6081(), method_30521(var2, var3));
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return class_8532.field_43674.method_17649(false);
   }

   public static void method_30519(class_9379 var0, BlockPos var1, boolean var2) {
      if (method_30520(var0, var1)) {
         var0.method_7513(var1, class_4783.field_23269.method_29260().method_10308(field_34381, Boolean.valueOf(var2)), 2);
      }
   }

   public static boolean method_30520(class_9379 var0, BlockPos var1) {
      class_4774 var4 = var0.method_28258(var1);
      return var0.method_28262(var1).method_8350(class_4783.field_23900) && var4.method_21996() >= 8 && var4.method_21993();
   }

   private static boolean method_30521(class_6163 var0, BlockPos var1) {
      class_2522 var4 = var0.method_28262(var1);
      return !var4.method_8350(class_4783.field_23269) ? !var4.method_8350(class_4783.field_23784) : var4.<Boolean>method_10313(field_34381);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.method_12173();
      double var9 = (double)var3.method_12165();
      double var11 = (double)var3.method_12185();
      if (!var1.<Boolean>method_10313(field_34381)) {
         var2.method_29551(class_3090.field_15382, var7 + 0.5, var9, var11 + 0.5, 0.0, 0.04, 0.0);
         var2.method_29551(
            class_3090.field_15382, var7 + (double)var4.nextFloat(), var9 + (double)var4.nextFloat(), var11 + (double)var4.nextFloat(), 0.0, 0.04, 0.0
         );
         if (var4.nextInt(200) == 0) {
            var2.method_29527(
               var7, var9, var11, class_463.field_2568, class_562.field_3322, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      } else {
         var2.method_29551(class_3090.field_15363, var7 + 0.5, var9 + 0.8, var11, 0.0, 0.0, 0.0);
         if (var4.nextInt(200) == 0) {
            var2.method_29527(
               var7, var9, var11, class_463.field_2861, class_562.field_3322, 0.2F + var4.nextFloat() * 0.2F, 0.9F + var4.nextFloat() * 0.15F, false
            );
         }
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.method_8309(var4, var5)) {
         if (var2 != Direction.field_802) {
            if (var2 == Direction.field_817 && !var3.method_8350(class_4783.field_23269) && method_30520(var4, var6)) {
               var4.method_43367().method_14011(var5, this, 5);
            }
         } else {
            var4.method_7513(var5, class_4783.field_23269.method_29260().method_10308(field_34381, Boolean.valueOf(method_30521(var4, var6))), 2);
         }

         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return class_4783.field_23900.method_29260();
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      class_2522 var6 = var2.method_28262(var3.method_6100());
      return var6.method_8350(class_4783.field_23269) || var6.method_8350(class_4783.field_23215) || var6.method_8350(class_4783.field_23784);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return class_3370.method_15536();
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38470;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_34381);
   }

   @Override
   public class_2340 method_27280(class_9379 var1, BlockPos var2, class_2522 var3) {
      var1.method_7513(var2, class_4783.field_23184.method_29260(), 11);
      return class_8532.field_43674;
   }
}
