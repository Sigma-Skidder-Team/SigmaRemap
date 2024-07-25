package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_8440 extends class_2451 {
   public class_8440(class_317 var1) {
      super(var1);
      class_6451.method_29408(this, class_8228.field_42243);
   }

   @Override
   public String method_11217(ItemStack var1) {
      return var1.method_28021("BlockEntityTag") == null ? super.method_11217(var1) : this.method_11216() + '.' + method_38824(var1).method_41796();
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_1967.method_9064(var1, var3);
   }

   @Override
   public class_6209 method_11233(ItemStack var1) {
      return class_6209.field_31740;
   }

   @Override
   public int method_11230(ItemStack var1) {
      return 72000;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      var2.method_26462(var3);
      return class_954.<ItemStack>method_4206(var6);
   }

   @Override
   public boolean method_11223(ItemStack var1, ItemStack var2) {
      return class_391.field_1605.method_10609(var2.method_27960()) || super.method_11223(var1, var2);
   }

   public static class_9077 method_38824(ItemStack var0) {
      return class_9077.method_41789(var0.method_27978("BlockEntityTag").method_25947("Base"));
   }
}
