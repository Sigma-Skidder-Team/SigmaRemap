package remapped;

import java.util.Random;

public class class_8537 extends class_6414 implements class_3978 {
   private static String[] field_43704;
   public static final class_4190 field_43705 = class_6414.method_29292(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   public class_8537(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_7971 method_10772() {
      return class_7971.field_40824;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      Vector3d var7 = var1.method_8353(var2, var3);
      return field_43705.method_19496(var7.field_7336, var7.field_7333, var7.field_7334);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) == 0 && var2.method_22548(var3.method_6081()) && var2.method_25261(var3.method_6081(), 0) >= 9) {
         this.method_39309(var2, var3);
      }
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return var2.method_28262(var3.method_6100()).method_8349(class_2351.field_11752);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.method_8309(var4, var5)) {
         if (var2 == Direction.field_817 && var3.method_8350(class_4783.field_23886)) {
            var4.method_7513(var5, class_4783.field_23886.method_29260(), 2);
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      } else {
         return class_4783.field_23184.method_29260();
      }
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return new ItemStack(class_4897.field_24648);
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return var1.method_28262(var2.method_6081()).method_8345();
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      this.method_39309(var1, var3);
   }

   @Override
   public float method_10799(class_2522 var1, PlayerEntity var2, class_6163 var3, BlockPos var4) {
      return !(var2.method_26446().method_27960() instanceof class_2235) ? super.method_10799(var1, var2, var3, var4) : 1.0F;
   }

   public void method_39309(World var1, BlockPos var2) {
      var1.method_7513(var2.method_6081(), class_4783.field_23886.method_29260().method_10308(class_747.field_4059, class_6546.field_33277), 3);
   }
}
