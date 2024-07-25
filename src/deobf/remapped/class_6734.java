package remapped;

import javax.annotation.Nullable;

public class class_6734 extends class_4109 {
   private static String[] field_34772;

   public class_6734(EntityType<? extends class_6734> var1, World var2) {
      super(var1, var2);
   }

   public static MutableAttribute method_30877() {
      return method_19064().createMutableAttribute(Attributes.MAX_HEALTH, 15.0).createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public void method_19084() {
      this.getAttribute(Attributes.field_37464).setBaseValue(this.method_19046());
   }

   @Override
   public class_2780 method_26550() {
      return class_2780.field_13579;
   }

   @Override
   public SoundEvent method_26918() {
      super.method_26918();
      return SoundEvents.field_2450;
   }

   @Override
   public SoundEvent method_26599() {
      super.method_26599();
      return SoundEvents.field_2471;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      super.method_26541(var1);
      return SoundEvents.field_2510;
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return EntityType.field_34268.method_30484(var1);
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (this.method_19043()) {
         if (!this.method_26449()) {
            if (!var1.method_3236()) {
               if (!this.method_37151()) {
                  if (!var5.method_28022()) {
                     if (var5.method_27960() == class_4897.field_24836 && !this.method_43357()) {
                        this.method_19076(var1);
                        return class_6910.method_31659(this.world.field_33055);
                     }

                     class_6910 var6 = var5.method_28000(var1, this, var2);
                     if (var6.method_31662()) {
                        return var6;
                     }
                  }

                  this.method_19039(var1);
                  return class_6910.method_31659(this.world.field_33055);
               } else {
                  return super.method_26857(var1, var2);
               }
            } else {
               this.method_19076(var1);
               return class_6910.method_31659(this.world.field_33055);
            }
         } else {
            return super.method_26857(var1, var2);
         }
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_19063() {
   }
}
