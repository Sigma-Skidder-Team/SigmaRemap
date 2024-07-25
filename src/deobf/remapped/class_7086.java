package remapped;

import java.util.Random;

public class class_7086 extends class_2830 implements class_3978 {
   private static String[] field_36579;
   public static final class_7044 field_36577 = class_6023.field_30750;
   private static final class_4190 field_36578 = class_6414.method_29292(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final class_4190 field_36580 = class_6414.method_29292(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public class_7086(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_36577, Integer.valueOf(0)));
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return new ItemStack(class_4897.field_25205);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      if (var1.<Integer>method_10313(field_36577) != 0) {
         return var1.<Integer>method_10313(field_36577) >= 3 ? super.method_10769(var1, var2, var3, var4) : field_36580;
      } else {
         return field_36578;
      }
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return var1.<Integer>method_10313(field_36577) < 3;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method_10313(field_36577);
      if (var7 < 3 && var4.nextInt(5) == 0 && var2.method_25261(var3.method_6081(), 0) >= 9) {
         var2.method_7513(var3, var1.method_10308(field_36577, Integer.valueOf(var7 + 1)), 2);
      }
   }

   @Override
   public void method_10784(class_2522 var1, World var2, BlockPos var3, Entity var4) {
      if (var4 instanceof LivingEntity && var4.getType() != EntityType.field_34250 && var4.getType() != EntityType.field_34238) {
         var4.method_37130(var1, new class_1343(0.8F, 0.75, 0.8F));
         if (!var2.field_33055
            && var1.<Integer>method_10313(field_36577) > 0
            && (var4.field_41754 != var4.getPosX() || var4.field_41724 != var4.getPosZ())) {
            double var7 = Math.abs(var4.getPosX() - var4.field_41754);
            double var9 = Math.abs(var4.getPosZ() - var4.field_41724);
            if (var7 >= 0.003F || var9 >= 0.003F) {
               var4.attackEntityFrom(DamageSource.field_31687, 1.0F);
            }
         }
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      int var9 = var1.<Integer>method_10313(field_36577);
      boolean var10 = var9 == 3;
      if (!var10 && var4.method_26617(var5).method_27960() == class_4897.field_24640) {
         return class_6910.field_35521;
      } else if (var9 <= 1) {
         return super.method_10777(var1, var2, var3, var4, var5, var6);
      } else {
         int var11 = 1 + var2.field_33033.nextInt(2);
         method_29267(var2, var3, new ItemStack(class_4897.field_25205, var11 + (!var10 ? 0 : 1)));
         var2.method_43359((PlayerEntity)null, var3, SoundEvents.field_2156, class_562.field_3322, 1.0F, 0.8F + var2.field_33033.nextFloat() * 0.4F);
         var2.method_7513(var3, var1.method_10308(field_36577, Integer.valueOf(1)), 2);
         return class_6910.method_31659(var2.field_33055);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_36577);
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return var3.<Integer>method_10313(field_36577) < 3;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      int var7 = Math.min(3, var4.<Integer>method_10313(field_36577) + 1);
      var1.method_7513(var3, var4.method_10308(field_36577, Integer.valueOf(var7)), 2);
   }
}
