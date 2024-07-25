package remapped;

public class class_3510 extends class_7157 {
   private static String[] field_17197;

   public class_3510(class_4639 var1) {
      super(var1);
   }

   public boolean method_16131(class_6946 var1, class_6486 var2) {
      class_9077 var5 = null;
      class_6098 var6 = null;
      class_6098 var7 = null;

      for (int var8 = 0; var8 < var1.method_31505(); var8++) {
         class_6098 var9 = var1.method_31498(var8);
         class_2451 var10 = var9.method_27960();
         if (var10 instanceof class_1967) {
            class_1967 var11 = (class_1967)var10;
            if (var5 != null) {
               if (var5 != var11.method_9065()) {
                  return false;
               }
            } else {
               var5 = var11.method_9065();
            }

            int var12 = class_8837.method_40660(var9);
            if (var12 > 6) {
               return false;
            }

            if (var12 <= 0) {
               if (var7 != null) {
                  return false;
               }

               var7 = var9;
            } else {
               if (var6 != null) {
                  return false;
               }

               var6 = var9;
            }
         }
      }

      return var6 != null && var7 != null;
   }

   public class_6098 method_16129(class_6946 var1) {
      for (int var4 = 0; var4 < var1.method_31505(); var4++) {
         class_6098 var5 = var1.method_31498(var4);
         if (!var5.method_28022()) {
            int var6 = class_8837.method_40660(var5);
            if (var6 > 0 && var6 <= 6) {
               class_6098 var7 = var5.method_27973();
               var7.method_28017(1);
               return var7;
            }
         }
      }

      return class_6098.field_31203;
   }

   public class_2831<class_6098> method_16130(class_6946 var1) {
      class_2831 var4 = class_2831.<class_6098>method_12872(var1.method_31505(), class_6098.field_31203);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_6098 var6 = var1.method_31498(var5);
         if (!var6.method_28022()) {
            if (!var6.method_27960().method_11232()) {
               if (var6.method_28002() && class_8837.method_40660(var6) > 0) {
                  class_6098 var7 = var6.method_27973();
                  var7.method_28017(1);
                  var4.set(var5, var7);
               }
            } else {
               var4.set(var5, new class_6098(var6.method_27960().method_11241()));
            }
         }
      }

      return var4;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14724;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }
}
