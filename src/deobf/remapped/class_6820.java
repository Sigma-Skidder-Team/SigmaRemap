package remapped;

public class class_6820 extends class_644 {
   public class_6820(Identifier var1) {
      super(
         var1,
         "",
         3,
         3,
         class_2831.<class_8137>method_12871(
            class_8137.field_41675,
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_25262),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622),
            class_8137.method_37019(class_4897.field_24622)
         ),
         new class_6098(class_4897.field_25113)
      );
   }

   @Override
   public boolean method_2959(class_6946 var1, class_6486 var2) {
      if (!super.method_2959(var1, var2)) {
         return false;
      } else {
         class_6098 var5 = class_6098.field_31203;

         for (int var6 = 0; var6 < var1.method_31505() && var5.method_28022(); var6++) {
            class_6098 var7 = var1.method_31498(var6);
            if (var7.method_27960() == class_4897.field_25262) {
               var5 = var7;
            }
         }

         if (!var5.method_28022()) {
            class_2134 var8 = class_2143.method_10005(var5, var2);
            if (var8 != null) {
               return !this.method_31296(var8) ? var8.field_10678 < 4 : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private boolean method_31296(class_2134 var1) {
      if (var1.field_10683 != null) {
         for (class_3245 var5 : var1.field_10683.values()) {
            if (var5.method_14848() == class_8086.field_41400 || var5.method_14848() == class_8086.field_41410) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public class_6098 method_2946(class_6946 var1) {
      class_6098 var4 = class_6098.field_31203;

      for (int var5 = 0; var5 < var1.method_31505() && var4.method_28022(); var5++) {
         class_6098 var6 = var1.method_31498(var5);
         if (var6.method_27960() == class_4897.field_25262) {
            var4 = var6;
         }
      }

      var4 = var4.method_27973();
      var4.method_28017(1);
      var4.method_27994().method_25931("map_scale_direction", 1);
      return var4;
   }

   @Override
   public boolean method_41053() {
      return true;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14710;
   }
}
