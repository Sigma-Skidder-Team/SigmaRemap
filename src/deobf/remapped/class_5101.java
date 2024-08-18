package remapped;

import java.util.List;
import java.util.function.Predicate;

public class class_5101 extends class_2451 {
   private static String[] field_26317;
   private static final Predicate<Entity> field_26316 = class_3572.field_17483.and(Entity::method_37167);
   private final class_3837 field_26315;

   public class_5101(class_3837 var1, class_317 var2) {
      super(var2);
      this.field_26315 = var1;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      class_9529 var7 = method_11238(var1, var2, class_9583.field_48752);
      if (var7.method_33990() == class_1430.field_7721) {
         return class_954.<ItemStack>method_4207(var6);
      } else {
         Vector3d var8 = var2.method_37307(1.0F);
         double var9 = 5.0;
         List var11 = var1.method_25867(var2, var2.getBoundingBox().method_18929(var8.method_6209(5.0)).grow(1.0), field_26316);
         if (!var11.isEmpty()) {
            Vector3d var12 = var2.method_37335(1.0F);

            for (Entity var14 : var11) {
               Box var15 = var14.getBoundingBox().grow((double)var14.method_37355());
               if (var15.method_18903(var12)) {
                  return class_954.<ItemStack>method_4207(var6);
               }
            }
         }

         if (var7.method_33990() != class_1430.field_7717) {
            return class_954.<ItemStack>method_4207(var6);
         } else {
            BoatEntity var16 = new BoatEntity(var1, var7.method_33993().field_7336, var7.method_33993().field_7333, var7.method_33993().field_7334);
            var16.method_42101(this.field_26315);
            var16.rotationYaw = var2.rotationYaw;
            if (var1.method_6683(var16, var16.getBoundingBox().grow(-0.1))) {
               if (!var1.field_33055) {
                  var1.method_7509(var16);
                  if (!var2.playerAbilities.isCreativeMode) {
                     var6.method_27970(1);
                  }
               }

               var2.method_3211(class_6234.field_31907.method_43790(this));
               return class_954.<ItemStack>method_4208(var6, var1.method_22567());
            } else {
               return class_954.<ItemStack>method_4202(var6);
            }
         }
      }
   }
}
