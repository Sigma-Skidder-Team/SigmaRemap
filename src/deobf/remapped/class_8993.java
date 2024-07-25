package remapped;

import javax.annotation.Nullable;

public class class_8993 extends class_3064 implements class_4582 {
   private static String[] field_46043;
   public static final class_7360<class_7422> field_46044 = class_3064.field_15063;
   public static final class_4190 field_46045 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public class_8993(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_46045;
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      return var1.method_8308(var2, var3, Direction.field_817) && !var1.method_8350(class_4783.field_23215);
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return new ItemStack(class_4783.field_23563);
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = super.method_29302(var1);
      if (var4 != null) {
         class_4774 var5 = var1.method_21862().method_28258(var1.method_21858().method_6081());
         if (var5.method_22007(class_6503.field_33094) && var5.method_21996() == 8) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      if (var1.<class_7422>method_10313(field_46044) != class_7422.field_37874) {
         class_4774 var7 = var2.method_28258(var3);
         return super.method_10787(var1, var2, var3) && var7.method_22007(class_6503.field_33094) && var7.method_21996() == 8;
      } else {
         class_2522 var6 = var2.method_28262(var3.method_6100());
         return var6.method_8350(this) && var6.<class_7422>method_10313(field_46044) == class_7422.field_37876;
      }
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_21238(class_6163 var1, BlockPos var2, class_2522 var3, class_2340 var4) {
      return false;
   }

   @Override
   public boolean method_21237(class_9379 var1, BlockPos var2, class_2522 var3, class_4774 var4) {
      return false;
   }
}
