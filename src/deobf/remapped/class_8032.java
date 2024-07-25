package remapped;

import javax.annotation.Nullable;

public class class_8032 extends class_7937 {
   private static String[] field_41111;

   public class_8032(EntityType<? extends class_8032> var1, World var2) {
      super(var1, var2);
   }

   public static MutableAttribute method_36481() {
      return class_7937.method_35905().createMutableAttribute(Attributes.MAX_HEALTH, 12.0);
   }

   @Override
   public boolean method_26442(Entity var1) {
      if (!super.method_26442(var1)) {
         return false;
      } else {
         if (var1 instanceof LivingEntity) {
            byte var4 = 0;
            if (this.world.method_43370() != class_423.field_1789) {
               if (this.world.method_43370() == class_423.field_1782) {
                  var4 = 15;
               }
            } else {
               var4 = 7;
            }

            if (var4 > 0) {
               ((LivingEntity)var1).method_26558(new class_2250(Effects.field_19718, var4 * 20, 0));
            }
         }

         return true;
      }
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      return var4;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.45F;
   }
}
