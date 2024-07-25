package remapped;

public class class_7347 extends class_7157 {
   private static final class_8137 field_37568 = class_8137.method_37019(class_4897.field_24622);
   private static final class_8137 field_37567 = class_8137.method_37019(class_4897.field_24581);
   private static final class_8137 field_37569 = class_8137.method_37019(class_4897.field_24554);

   public class_7347(Identifier var1) {
      super(var1);
   }

   public boolean method_33488(class_6946 var1, World var2) {
      boolean var5 = false;
      int var6 = 0;

      for (int var7 = 0; var7 < var1.method_31505(); var7++) {
         ItemStack var8 = var1.method_31498(var7);
         if (!var8.method_28022()) {
            if (!field_37568.test(var8)) {
               if (!field_37567.test(var8)) {
                  if (!field_37569.test(var8)) {
                     return false;
                  }
               } else if (++var6 > 3) {
                  return false;
               }
            } else {
               if (var5) {
                  return false;
               }

               var5 = true;
            }
         }
      }

      return var5 && var6 >= 1;
   }

   public ItemStack method_33487(class_6946 var1) {
      ItemStack var4 = new ItemStack(class_4897.field_24479, 3);
      class_5734 var5 = var4.method_27978("Fireworks");
      class_3416 var6 = new class_3416();
      int var7 = 0;

      for (int var8 = 0; var8 < var1.method_31505(); var8++) {
         ItemStack var9 = var1.method_31498(var8);
         if (!var9.method_28022()) {
            if (!field_37567.test(var9)) {
               if (field_37569.test(var9)) {
                  class_5734 var10 = var9.method_28021("Explosion");
                  if (var10 != null) {
                     var6.add(var10);
                  }
               }
            } else {
               var7++;
            }
         }
      }

      var5.method_25921("Flight", (byte)var7);
      if (!var6.isEmpty()) {
         var5.method_25946("Explosions", var6);
      }

      return var4;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack method_41044() {
      return new ItemStack(class_4897.field_24479);
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14709;
   }
}
