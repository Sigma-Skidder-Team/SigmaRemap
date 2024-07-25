package remapped;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_5900 extends class_4314 {
   private static String[] field_29952;
   public static final class_4190 field_29951 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public class_5900(class_3073 var1) {
      super(var1);
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_29951;
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      super.method_29280(var1, var2, var3, var4);

      for (int var7 = -2; var7 <= 2; var7++) {
         for (int var8 = -2; var8 <= 2; var8++) {
            if (var7 > -2 && var7 < 2 && var8 == -1) {
               var8 = 2;
            }

            if (var4.nextInt(16) == 0) {
               for (int var9 = 0; var9 <= 1; var9++) {
                  BlockPos var10 = var3.method_6104(var7, var9, var8);
                  if (var2.method_28262(var10).method_8350(class_4783.field_23313)) {
                     if (!var2.method_22548(var3.method_6104(var7 / 2, 0, var8 / 2))) {
                        break;
                     }

                     var2.method_43361(
                        class_3090.field_15354,
                        (double)var3.method_12173() + 0.5,
                        (double)var3.method_12165() + 2.0,
                        (double)var3.method_12185() + 0.5,
                        (double)((float)var7 + var4.nextFloat()) - 0.5,
                        (double)((float)var9 - var4.nextFloat() - 1.0F),
                        (double)((float)var8 + var4.nextFloat()) - 0.5
                     );
                  }
               }
            }
         }
      }
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38469;
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_7932();
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         var4.method_3152(var1.method_8317(var2, var3));
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Nullable
   @Override
   public class_4259 method_10767(class_2522 var1, World var2, BlockPos var3) {
      class_3757 var6 = var2.method_28260(var3);
      if (!(var6 instanceof class_7932)) {
         return null;
      } else {
         ITextComponent var7 = ((class_9875)var6).method_19839();
         return new class_6872((var2x, var3x, var4) -> new class_8372(var2x, var3x, class_9210.method_42530(var2, var3)), var7);
      }
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_7932) {
            ((class_7932)var8).method_35860(var5.method_28008());
         }
      }
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
