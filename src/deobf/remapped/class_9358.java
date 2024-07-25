package remapped;

public class class_9358 extends class_7157 {
   public class_9358(Identifier var1) {
      super(var1);
   }

   public boolean method_43222(class_6946 var1, World var2) {
      ItemStack var5 = ItemStack.EMPTY;
      ItemStack var6 = ItemStack.EMPTY;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         ItemStack var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (!(var8.method_27960() instanceof class_1967)) {
               if (var8.method_27960() != class_4897.field_24840) {
                  return false;
               }

               if (!var5.method_28022()) {
                  return false;
               }

               if (var8.method_28021("BlockEntityTag") != null) {
                  return false;
               }

               var5 = var8;
            } else {
               if (!var6.method_28022()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var5.method_28022() && !var6.method_28022();
   }

   public ItemStack method_43221(class_6946 var1) {
      ItemStack var4 = ItemStack.EMPTY;
      ItemStack var5 = ItemStack.EMPTY;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         ItemStack var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            if (!(var7.method_27960() instanceof class_1967)) {
               if (var7.method_27960() == class_4897.field_24840) {
                  var5 = var7.method_27973();
               }
            } else {
               var4 = var7;
            }
         }
      }

      if (!var5.method_28022()) {
         CompoundNBT var8 = var4.method_28021("BlockEntityTag");
         CompoundNBT var9 = var8 != null ? var8.method_25944() : new CompoundNBT();
         var9.method_25931("Base", ((class_1967)var4.method_27960()).method_9065().method_41794());
         var5.method_27954("BlockEntityTag", var9);
         return var5;
      } else {
         return var5;
      }
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14715;
   }
}
