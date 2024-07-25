package remapped;

public class class_6553 extends class_7157 {
   public class_6553(Identifier var1) {
      super(var1);
   }

   public boolean method_29879(class_6946 var1, World var2) {
      int var5 = 0;
      ItemStack var6 = ItemStack.EMPTY;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         ItemStack var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (var8.method_27960() != class_4897.field_24698) {
               if (var8.method_27960() != class_4897.field_24805) {
                  return false;
               }

               var5++;
            } else {
               if (!var6.method_28022()) {
                  return false;
               }

               var6 = var8;
            }
         }
      }

      return !var6.method_28022() && var6.method_28002() && var5 > 0;
   }

   public ItemStack method_29877(class_6946 var1) {
      int var4 = 0;
      ItemStack var5 = ItemStack.EMPTY;

      for (int var6 = 0; var6 < var1.method_31505(); var6++) {
         ItemStack var7 = var1.method_31498(var6);
         if (!var7.method_28022()) {
            if (var7.method_27960() != class_4897.field_24698) {
               if (var7.method_27960() != class_4897.field_24805) {
                  return ItemStack.EMPTY;
               }

               var4++;
            } else {
               if (!var5.method_28022()) {
                  return ItemStack.EMPTY;
               }

               var5 = var7;
            }
         }
      }

      if (!var5.method_28022() && var5.method_28002() && var4 >= 1 && class_1138.method_4992(var5) < 2) {
         ItemStack var8 = new ItemStack(class_4897.field_24698, var4);
         CompoundNBT var9 = var5.method_27990().method_25944();
         var9.putInt("generation", class_1138.method_4992(var5) + 1);
         var8.method_27965(var9);
         return var8;
      } else {
         return ItemStack.EMPTY;
      }
   }

   public class_2831<ItemStack> method_29878(class_6946 var1) {
      class_2831 var4 = class_2831.<ItemStack>method_12872(var1.method_31505(), ItemStack.EMPTY);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         ItemStack var6 = var1.method_31498(var5);
         if (!var6.method_27960().method_11232()) {
            if (var6.method_27960() instanceof class_1138) {
               ItemStack var7 = var6.method_27973();
               var7.method_28017(1);
               var4.set(var5, var7);
               break;
            }
         } else {
            var4.set(var5, new ItemStack(var6.method_27960().method_11241()));
         }
      }

      return var4;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14723;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 >= 3 && var2 >= 3;
   }
}
