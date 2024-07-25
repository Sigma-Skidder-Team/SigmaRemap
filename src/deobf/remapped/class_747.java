package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_747 extends class_6414 implements class_3978 {
   private static String[] field_4057;
   public static final class_4190 field_4062 = class_6414.method_29292(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   public static final class_4190 field_4060 = class_6414.method_29292(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   public static final class_4190 field_4061 = class_6414.method_29292(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final class_7044 field_4063 = class_6023.field_30736;
   public static final class_7360<class_6546> field_4059 = class_6023.field_30685;
   public static final class_7044 field_4058 = class_6023.field_30751;

   public class_747(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_4063, Integer.valueOf(0))
            .method_10308(field_4059, class_6546.field_33278)
            .method_10308(field_4058, Integer.valueOf(0))
      );
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_4063, field_4059, field_4058);
   }

   @Override
   public class_7971 method_10772() {
      return class_7971.field_40824;
   }

   @Override
   public boolean method_29275(class_2522 var1, class_6163 var2, BlockPos var3) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      class_4190 var7 = var1.method_10313(field_4059) != class_6546.field_33280 ? field_4062 : field_4060;
      class_1343 var8 = var1.method_8353(var2, var3);
      return var7.method_19496(var8.field_7336, var8.field_7333, var8.field_7334);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      class_1343 var7 = var1.method_8353(var2, var3);
      return field_4061.method_19496(var7.field_7336, var7.field_7333, var7.field_7334);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      if (var4.method_22001()) {
         class_2522 var5 = var1.method_21862().method_28262(var1.method_21858().method_6100());
         if (!var5.method_8349(class_2351.field_11752)) {
            return null;
         } else if (!var5.method_8350(class_4783.field_23454)) {
            if (var5.method_8350(class_4783.field_23886)) {
               int var7 = var5.<Integer>method_10313(field_4063) <= 0 ? 0 : 1;
               return this.method_29260().method_10308(field_4063, Integer.valueOf(var7));
            } else {
               class_2522 var6 = var1.method_21862().method_28262(var1.method_21858().method_6081());
               return !var6.method_8350(class_4783.field_23886) && !var6.method_8350(class_4783.field_23454)
                  ? class_4783.field_23454.method_29260()
                  : this.method_29260().method_10308(field_4063, var6.<Integer>method_10313(field_4063));
            }
         } else {
            return this.method_29260().method_10308(field_4063, Integer.valueOf(0));
         }
      } else {
         return null;
      }
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_4058) == 0;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var1.<Integer>method_10313(field_4058) == 0
         && var4.nextInt(3) == 0
         && var2.method_22548(var3.method_6081())
         && var2.method_25261(var3.method_6081(), 0) >= 9) {
         int var7 = this.method_3383(var2, var3) + 1;
         if (var7 < 16) {
            this.method_3384(var1, var2, var3, var4, var7);
         }
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return var2.method_28262(var3.method_6100()).method_8349(class_2351.field_11752);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      if (var2 == Direction.field_817
         && var3.method_8350(class_4783.field_23886)
         && var3.<Integer>method_10313(field_4063) > var1.<Integer>method_10313(field_4063)) {
         var4.method_7513(var5, var1.method_10317(field_4063), 2);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      int var7 = this.method_3382(var1, var2);
      int var8 = this.method_3383(var1, var2);
      return var7 + var8 + 1 < 16 && var1.method_28262(var2.method_6082(var7)).<Integer>method_10313(field_4058) != 1;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      int var7 = this.method_3382(var1, var3);
      int var8 = this.method_3383(var1, var3);
      int var9 = var7 + var8 + 1;
      int var10 = 1 + var2.nextInt(2);

      for (int var11 = 0; var11 < var10; var11++) {
         BlockPos var12 = var3.method_6082(var7);
         class_2522 var13 = var1.method_28262(var12);
         if (var9 >= 16 || var13.<Integer>method_10313(field_4058) == 1 || !var1.method_22548(var12.method_6081())) {
            return;
         }

         this.method_3384(var13, var1, var12, var2, var9);
         var7++;
         var9++;
      }
   }

   @Override
   public float method_10799(class_2522 var1, class_704 var2, class_6163 var3, BlockPos var4) {
      return !(var2.method_26446().method_27960() instanceof class_2235) ? super.method_10799(var1, var2, var3, var4) : 1.0F;
   }

   public void method_3384(class_2522 var1, World var2, BlockPos var3, Random var4, int var5) {
      class_2522 var8 = var2.method_28262(var3.method_6100());
      BlockPos var9 = var3.method_6101(2);
      class_2522 var10 = var2.method_28262(var9);
      class_6546 var11 = class_6546.field_33278;
      if (var5 >= 1) {
         if (!var8.method_8350(class_4783.field_23886) || var8.<class_6546>method_10313(field_4059) == class_6546.field_33278) {
            var11 = class_6546.field_33277;
         } else if (var8.method_8350(class_4783.field_23886) && var8.<class_6546>method_10313(field_4059) != class_6546.field_33278) {
            var11 = class_6546.field_33280;
            if (var10.method_8350(class_4783.field_23886)) {
               var2.method_7513(var3.method_6100(), var8.method_10308(field_4059, class_6546.field_33277), 3);
               var2.method_7513(var9, var10.method_10308(field_4059, class_6546.field_33278), 3);
            }
         }
      }

      int var12 = var1.<Integer>method_10313(field_4063) != 1 && !var10.method_8350(class_4783.field_23886) ? 0 : 1;
      int var13 = (var5 < 11 || !(var4.nextFloat() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.method_7513(
         var3.method_6081(),
         this.method_29260().method_10308(field_4063, Integer.valueOf(var12)).method_10308(field_4059, var11).method_10308(field_4058, Integer.valueOf(var13)),
         3
      );
   }

   public int method_3382(class_6163 var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.method_28262(var2.method_6082(var5 + 1)).method_8350(class_4783.field_23886)) {
         var5++;
      }

      return var5;
   }

   public int method_3383(class_6163 var1, BlockPos var2) {
      int var5 = 0;

      while (var5 < 16 && var1.method_28262(var2.method_6101(var5 + 1)).method_8350(class_4783.field_23886)) {
         var5++;
      }

      return var5;
   }
}
