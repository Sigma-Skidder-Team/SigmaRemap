package remapped;

public class class_7615<T extends Entity & class_8190> extends class_2451 {
   private static String[] field_38752;
   private final EntityType<T> field_38751;
   private final int field_38750;

   public class_7615(class_317 var1, EntityType<T> var2, int var3) {
      super(var1);
      this.field_38751 = var2;
      this.field_38750 = var3;
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      if (!var1.field_33055) {
         Entity var7 = var2.method_37243();
         if (var2.isPassenger() && var7 instanceof class_8190 && var7.method_37387() == this.field_38751) {
            class_8190 var8 = (class_8190)var7;
            if (var8.method_37518()) {
               var6.method_28003(this.field_38750, var2, var1x -> var1x.method_26447(var3));
               if (!var6.method_28022()) {
                  return class_954.<ItemStack>method_4205(var6);
               }

               ItemStack var9 = new ItemStack(class_4897.field_24505);
               var9.method_27965(var6.method_27990());
               return class_954.<ItemStack>method_4205(var9);
            }
         }

         var2.method_3211(class_6234.field_31907.method_43790(this));
         return class_954.<ItemStack>method_4207(var6);
      } else {
         return class_954.<ItemStack>method_4207(var6);
      }
   }
}
