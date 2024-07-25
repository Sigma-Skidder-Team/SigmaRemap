package remapped;

import java.util.List;

public class class_5336 extends class_2451 {
   private static String[] field_27220;

   public class_5336(class_317 var1) {
      super(var1);
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      List var6 = var1.<class_4478>method_25869(
         class_4478.class, var2.getBoundingBox().grow(2.0), var0 -> var0 != null && var0.isAlive() && var0.method_20795() instanceof class_2770
      );
      ItemStack var7 = var2.method_26617(var3);
      if (var6.isEmpty()) {
         class_9529 var10 = method_11238(var1, var2, class_9583.field_48749);
         if (var10.method_33990() != class_1430.field_7721) {
            if (var10.method_33990() == class_1430.field_7717) {
               BlockPos var9 = var10.method_43955();
               if (!var1.method_29538(var2, var9)) {
                  return class_954.<ItemStack>method_4207(var7);
               }

               if (var1.method_28258(var9).method_22007(class_6503.field_33094)) {
                  var1.method_29528(var2, var2.getPosX(), var2.method_37309(), var2.getPosZ(), SoundEvents.field_2054, class_562.field_3328, 1.0F, 1.0F);
                  return class_954.<ItemStack>method_4208(
                     this.method_24320(var7, var2, class_9541.method_43999(new ItemStack(class_4897.field_25157), class_3697.field_18108)),
                     var1.method_22567()
                  );
               }
            }

            return class_954.<ItemStack>method_4207(var7);
         } else {
            return class_954.<ItemStack>method_4207(var7);
         }
      } else {
         class_4478 var8 = (class_4478)var6.get(0);
         var8.method_20781(var8.method_20783() - 0.5F);
         var1.method_29528(
            (PlayerEntity)null, var2.getPosX(), var2.method_37309(), var2.getPosZ(), SoundEvents.field_2366, class_562.field_3328, 1.0F, 1.0F
         );
         return class_954.<ItemStack>method_4208(this.method_24320(var7, var2, new ItemStack(class_4897.field_25220)), var1.method_22567());
      }
   }

   public ItemStack method_24320(ItemStack var1, PlayerEntity var2, ItemStack var3) {
      var2.method_3211(class_6234.field_31907.method_43790(this));
      return class_4754.method_21940(var1, var2, var3);
   }
}
