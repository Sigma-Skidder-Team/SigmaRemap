package remapped;

import java.util.Random;

public class class_4309 extends class_6414 {
   private static String[] field_20903;
   public static final class_7044 field_20904 = class_6023.field_30686;
   public static final class_4190 field_20902 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   public static final class_4190 field_20901 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public class_4309(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_20904, Integer.valueOf(0)));
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.method_6081();
      if (var2.method_22548(var7)) {
         int var8 = 1;

         while (var2.method_28262(var3.method_6101(var8)).method_8350(this)) {
            var8++;
         }

         if (var8 < 3) {
            int var9 = var1.<Integer>method_10313(field_20904);
            if (var9 != 15) {
               var2.method_7513(var3, var1.method_10308(field_20904, Integer.valueOf(var9 + 1)), 4);
            } else {
               var2.method_29594(var7, this.method_29260());
               class_2522 var10 = var1.method_10308(field_20904, Integer.valueOf(0));
               var2.method_7513(var3, var10, 4);
               var10.method_8343(var2, var7, this, var3, false);
            }
         }
      }
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_20902;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_20901;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      for (Direction var7 : class_9594.field_48893) {
         class_2522 var8 = var2.method_28262(var3.method_6098(var7));
         class_5371 var9 = var8.method_8362();
         if (var9.method_24499() || var2.method_28258(var3.method_6098(var7)).method_22007(class_6503.field_33095)) {
            return false;
         }
      }

      class_2522 var10 = var2.method_28262(var3.method_6100());
      return (var10.method_8350(class_4783.field_23500) || var10.method_8350(class_4783.field_23216) || var10.method_8350(class_4783.field_23814))
         && !var2.method_28262(var3.method_6081()).method_8362().method_24494();
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      var4.attackEntityFrom(DamageSource.field_31677, 1.0F);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_20904);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
