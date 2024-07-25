package remapped;

public class class_6318 extends class_2451 {
   private static String[] field_32267;

   public class_6318(class_317 var1) {
      super(var1);
   }

   @Override
   public ItemStack method_11242(ItemStack var1, World var2, LivingEntity var3) {
      super.method_11242(var1, var2, var3);
      if (var3 instanceof class_9359) {
         class_9359 var6 = (class_9359)var3;
         class_8807.field_45081.method_43401(var6, var1);
         var6.method_3211(class_6234.field_31907.method_43790(this));
      }

      if (!var2.field_33055) {
         var3.removeEffect(Effects.field_19718);
      }

      if (!var1.method_28022()) {
         if (var3 instanceof PlayerEntity && !((PlayerEntity)var3).playerAbilities.isCreativeMode) {
            ItemStack var8 = new ItemStack(class_4897.field_24812);
            PlayerEntity var7 = (PlayerEntity)var3;
            if (!var7.inventory.method_32414(var8)) {
               var7.method_3153(var8, false);
            }
         }

         return var1;
      } else {
         return new ItemStack(class_4897.field_24812);
      }
   }

   @Override
   public int method_11230(ItemStack var1) {
      return 40;
   }

   @Override
   public class_6209 method_11233(ItemStack var1) {
      return class_6209.field_31739;
   }

   @Override
   public SoundEvent method_11253() {
      return SoundEvents.field_2175;
   }

   @Override
   public SoundEvent method_11243() {
      return SoundEvents.field_2175;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, PlayerEntity var2, Hand var3) {
      return class_4754.method_21939(var1, var2, var3);
   }
}
