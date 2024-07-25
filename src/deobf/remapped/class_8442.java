package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_8442 extends class_4041 {
   private static String[] field_43190;

   public class_8442(class_317 var1) {
      super(var1);
   }

   @Override
   public void method_11218(ItemStack var1, World var2, List<ITextComponent> var3, class_4605 var4) {
      class_9541.method_43988(var1, var3, 0.25F);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      var1.method_29528(
         (PlayerEntity)null,
         var2.getPosX(),
         var2.method_37309(),
         var2.getPosZ(),
         class_463.field_2383,
         class_562.field_3328,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      return super.method_11231(var1, var2, var3);
   }
}
