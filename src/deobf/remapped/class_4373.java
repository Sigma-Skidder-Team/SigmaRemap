package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4373 extends class_6414 {
   private static final ITextComponent field_21460 = new TranslationTextComponent("container.crafting");

   public class_4373(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055) {
         var4.method_3152(var1.method_8317(var2, var3));
         var4.method_3209(class_6234.field_31908);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public class_4259 method_10767(class_2522 var1, World var2, BlockPos var3) {
      return new class_6872((var2x, var3x, var4) -> new class_1722(var2x, var3x, class_9210.method_42530(var2, var3)), field_21460);
   }
}
