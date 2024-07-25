package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_1477 extends class_6414 {
   private static String[] field_7917;
   private static final class_4190 field_7920 = class_6414.method_29292(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final class_4190 field_7919 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final class_7044 field_7916 = class_6023.field_30745;
   public static final class_7044 field_7918 = class_6023.field_30753;

   public class_1477(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_7916, Integer.valueOf(0)).method_10308(field_7918, Integer.valueOf(1)));
   }

   @Override
   public void method_29286(World var1, BlockPos var2, Entity var3) {
      this.method_6808(var1, var2, var3, 100);
      super.method_29286(var1, var2, var3);
   }

   @Override
   public void method_29263(World var1, BlockPos var2, Entity var3, float var4) {
      if (!(var3 instanceof class_2811)) {
         this.method_6808(var1, var2, var3, 3);
      }

      super.method_29263(var1, var2, var3, var4);
   }

   private void method_6808(World var1, BlockPos var2, Entity var3, int var4) {
      if (this.method_6811(var1, var3) && !var1.field_33055 && var1.field_33033.nextInt(var4) == 0) {
         class_2522 var7 = var1.method_28262(var2);
         if (var7.method_8350(class_4783.field_23741)) {
            this.method_6809(var1, var2, var7);
         }
      }
   }

   private void method_6809(World var1, BlockPos var2, class_2522 var3) {
      var1.method_43359((PlayerEntity)null, var2, SoundEvents.field_2455, class_562.field_3322, 0.7F, 0.9F + var1.field_33033.nextFloat() * 0.2F);
      int var6 = var3.<Integer>method_10313(field_7918);
      if (var6 > 1) {
         var1.method_7513(var2, var3.method_10308(field_7918, Integer.valueOf(var6 - 1)), 2);
         var1.method_43364(2001, var2, class_6414.method_29285(var3));
      } else {
         var1.method_7510(var2, false);
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (this.method_6813(var2) && method_6812(var2, var3)) {
         int var7 = var1.<Integer>method_10313(field_7916);
         if (var7 >= 2) {
            var2.method_43359((PlayerEntity)null, var3, SoundEvents.field_2790, class_562.field_3322, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.method_7508(var3, false);

            for (int var8 = 0; var8 < var1.<Integer>method_10313(field_7918); var8++) {
               var2.method_43364(2001, var3, class_6414.method_29285(var1));
               class_3845 var9 = EntityType.field_34283.method_30484(var2);
               var9.method_8635(-24000);
               var9.method_17859(var3);
               var9.method_37144(
                  (double)var3.getX() + 0.3 + (double)var8 * 0.2, (double)var3.method_12165(), (double)var3.method_12185() + 0.3, 0.0F, 0.0F
               );
               var2.method_7509(var9);
            }
         } else {
            var2.method_43359((PlayerEntity)null, var3, SoundEvents.field_2694, class_562.field_3322, 0.7F, 0.9F + var4.nextFloat() * 0.2F);
            var2.method_7513(var3, var1.method_10308(field_7916, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   public static boolean method_6812(class_6163 var0, BlockPos var1) {
      return method_6810(var0, var1.method_6100());
   }

   public static boolean method_6810(class_6163 var0, BlockPos var1) {
      return var0.method_28262(var1).method_8349(class_2351.field_11803);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (method_6812(var2, var3) && !var2.field_33055) {
         var2.method_43364(2005, var3, 0);
      }
   }

   private boolean method_6813(World var1) {
      float var4 = var1.method_13578(1.0F);
      return (double)var4 < 0.69 && (double)var4 > 0.65 ? true : var1.field_33033.nextInt(500) == 0;
   }

   @Override
   public void method_29298(World var1, PlayerEntity var2, BlockPos var3, class_2522 var4, class_3757 var5, ItemStack var6) {
      super.method_29298(var1, var2, var3, var4, var5, var6);
      this.method_6809(var1, var3, var4);
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      return var2.method_21867().method_27960() == this.method_10803() && var1.<Integer>method_10313(field_7918) < 4 ? true : super.method_10781(var1, var2);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858());
      return !var4.method_8350(this)
         ? super.method_29302(var1)
         : var4.method_10308(field_7918, Integer.valueOf(Math.min(4, var4.<Integer>method_10313(field_7918) + 1)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return var1.<Integer>method_10313(field_7918) <= 1 ? field_7920 : field_7919;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_7916, field_7918);
   }

   private boolean method_6811(World var1, Entity var2) {
      if (var2 instanceof class_3845 || var2 instanceof class_2022) {
         return false;
      } else {
         return !(var2 instanceof LivingEntity) ? false : var2 instanceof PlayerEntity || var1.getGameRules().getBoolean(GameRules.field_1047);
      }
   }
}
