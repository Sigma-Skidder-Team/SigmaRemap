package remapped;

public class class_6675 extends class_2451 {
   private static String[] field_34506;

   public class_6675(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11202(ItemStack var1, PlayerEntity var2, LivingEntity var3, Hand var4) {
      if (var1.method_28018() && !(var3 instanceof PlayerEntity)) {
         if (!var2.world.field_33055 && var3.isAlive()) {
            var3.method_37303(var1.method_28008());
            if (var3 instanceof MobEntity) {
               ((MobEntity)var3).method_26883();
            }

            var1.method_27970(1);
         }

         return class_6910.method_31659(var2.world.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }
}
