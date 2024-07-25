package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_1655 extends class_603 {
   public class_1655(class_317 var1) {
      super(var1);
   }

   @Override
   public ItemStack method_11207() {
      return class_9541.method_43999(super.method_11207(), class_3697.field_18125);
   }

   @Override
   public void method_11239(class_8230 var1, class_2831<ItemStack> var2) {
      if (this.method_11224(var1)) {
         for (class_6004 var6 : class_8669.field_44365) {
            if (!var6.method_27404().isEmpty()) {
               var2.add(class_9541.method_43999(new ItemStack(this), var6));
            }
         }
      }
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_9541.method_43988(var1, var3, 0.125F);
   }

   @Override
   public String method_11217(ItemStack var1) {
      return class_9541.method_43990(var1).method_27405(this.method_11216() + ".effect.");
   }
}
